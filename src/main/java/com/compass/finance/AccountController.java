package com.compass.finance;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.compass.order.model.AccountBean;
import com.compass.order.service.OrderPayService;
import com.compass.park.model.ParkBean;
import com.compass.park.service.ParkService;
import com.compass.systemlog.service.SystemLogService;
import com.compass.utils.ConstantUtils;
import com.compass.utils.DateUtil;
import com.compass.utils.IpUtils;

@Controller
@RequestMapping("/finance/account.do")
public class AccountController {
	
	private static final Logger log = LoggerFactory
			.getLogger(AccountController.class);
	
	@Autowired
	@Qualifier("parkService")
	private ParkService parkService;
	
	@Autowired
	@Qualifier("orderPayService")
	private OrderPayService orderPayService;
	
	@RequestMapping(params = "method=makeAccount")
	@ResponseBody
	public void makeAccount(
			@RequestParam(value = "dateSet") String dateSet,
			@RequestParam(value = "startDate") String startDate,
			@RequestParam(value = "endDate") String endDate,
			@RequestParam(value = "payType") String payType,
			HttpServletRequest req,HttpServletResponse response) {
		log.info("dateSet:"+dateSet+",startDate:"+startDate+",endDate:"+endDate+",payType:"+payType);
		try {
			String bDate = " 00:00:00";
			String eDate = " 23:59:59";
			if("1".equals(dateSet)){
				//昨天
				String yesterDay = DateUtil.yesterday();
				bDate = yesterDay+bDate;
				eDate = yesterDay+eDate;
			}else if("2".equals(dateSet)){
				//上周
				bDate = DateUtil.lastWeekFirst()+bDate;
				eDate = DateUtil.lastWeekEnd()+eDate;
			}else if("3".equals(dateSet)){
				//上月
				bDate = DateUtil.lastMonthFirst()+bDate;
				eDate = DateUtil.lastMonthEnd()+eDate;
			}else if("4".equals(dateSet)){
				//自定义
				bDate = startDate+bDate;
				eDate = endDate+eDate;
			}
			String changeParkId = (String) req.getSession().getAttribute("changeParkId");
			String outParkingId = req.getSession().getAttribute(ConstantUtils.AGENCYID).toString().trim();
			outParkingId = ConstantUtils.CENTERCODE.equals(outParkingId)?changeParkId:outParkingId;
			this.addLog(req, ConstantUtils.OPERNAMEACCOUNT, ConstantUtils.OPERTYPEEXPO, "参数：outParkingId："+outParkingId+",payType:"+payType+",bDate:"+bDate+",eDate:"+eDate);
			ParkBean parkBean = new ParkBean();
			if(StringUtils.isNotBlank(outParkingId)){
				parkBean = parkService.getParkByOutParkingId(outParkingId);
			}
			List<AccountBean> list = orderPayService.getAccountList(outParkingId,payType,bDate, eDate);
			exportDataToExcel(response,bDate,eDate,parkBean,list,"对账报表", ".xls");
		} catch (Exception e) {
			log.error("数据导出异常",e);
		}
	}
	
	
	public static void exportDataToExcel(HttpServletResponse response,String startDate,String endDate,ParkBean parkBean,List<AccountBean> list,String fileName,String fileSuffix){
    	OutputStream os = null;
        try {
        	HSSFWorkbook workbook = new HSSFWorkbook();
            //生成一个表格
            HSSFSheet sheet = workbook.createSheet(fileName);
            //设置表格默认列宽15个字节
            sheet.setDefaultColumnWidth(15);
            //生成表格标题
            HSSFRow row = sheet.createRow(0);
            row.createCell(0).setCellValue("起始日期:");
            row.createCell(1).setCellValue("["+startDate+"]");
            row.createCell(2).setCellValue("终止日期:");
            row.createCell(3).setCellValue("["+endDate+"]");
            row = sheet.createRow(1);
            row.createCell(0).setCellValue("对账单编号");
            row.createCell(1).setCellValue(System.currentTimeMillis()+"");
            row = sheet.createRow(2);
            row.createCell(0).setCellValue("停车场基本信息");
            row = sheet.createRow(3);
            row.createCell(0).setCellValue("停车场id");
            row.createCell(1).setCellValue("停车场名称");
            row = sheet.createRow(4);
            row.createCell(0).setCellValue(parkBean.getOutParkingId());
            row.createCell(1).setCellValue(parkBean.getParkingName());
            row = sheet.createRow(6);
            row.createCell(0).setCellValue("收费汇总清单");
            row = sheet.createRow(7);
            row.createCell(0).setCellValue("收费类型");
            row.createCell(1).setCellValue("交易笔数");
            row.createCell(2).setCellValue("交易金额");
            row.createCell(3).setCellValue("退款笔数");
            row.createCell(4).setCellValue("退款金额");
            row.createCell(5).setCellValue("商户优惠");
            row.createCell(6).setCellValue("云停风行优惠");
            row.createCell(7).setCellValue("实收金额");
            row.createCell(8).setCellValue("手续费");
            row.createCell(9).setCellValue("结算金额");
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
            if(list!=null&&!list.isEmpty()&&list.size()>0){
            	int i = 7;
            	for (AccountBean accountBean : list) {
            		i++;
            		row = sheet.createRow(i);
                    row.createCell(0).setCellValue(accountBean.getPayTypeName());
                    row.createCell(1).setCellValue(accountBean.getTotalCount());
                    HSSFCell cell = row.createCell(2);
                    cell.setCellValue(new BigDecimal(accountBean.getTransactionAmount()).doubleValue());
                    row.createCell(3).setCellValue(accountBean.getRefundCount());
                    cell = row.createCell(4);
                    cell.setCellValue(new BigDecimal(accountBean.getRefundAmount()).doubleValue());
                    cell = row.createCell(5);
                    cell.setCellValue(new BigDecimal(accountBean.getMerchantDiscount()).doubleValue());
                    cell = row.createCell(6);
                    cell.setCellValue(new BigDecimal(accountBean.getCloudDiscount()).doubleValue());
                    cell = row.createCell(7);
                    cell.setCellValue(new BigDecimal(accountBean.getActualAmount()).doubleValue());
                    cell = row.createCell(8);
                    cell.setCellValue(new BigDecimal(accountBean.getFreeAmount()).doubleValue());
                    cell = row.createCell(9);
                    cell.setCellValue(new BigDecimal(accountBean.getSettAmount()).doubleValue());
				}
            }
        	 fileName = fileName+System.currentTimeMillis();
        	 response.setHeader("Content-Disposition", "attachment; filename=" + new String(fileName.getBytes("gb2312"),"ISO8859-1")+fileSuffix);
             response.setCharacterEncoding("UTF-8");
             response.setContentType("application/vnd.ms-excel");
             os = response.getOutputStream();
             workbook.write(os);
        } catch (Exception e) {
            log.error("写入excel异常",e);
        }finally{
            try {
                os.flush();
                os.close();
            } catch (IOException e) {
                log.error("关闭流异常",e);
            }
        }
    }
	
	@Autowired
    @Qualifier("systemLogService")
    private SystemLogService     systemLogService;
	
	public void addLog(HttpServletRequest req,String operName,String operType,String operateDetail){
		try {
			String ipAddress = IpUtils.getRemoteHost(req);
			String userId = req.getSession().getAttribute(ConstantUtils.USERID).toString();
			String agencyIdS = req.getSession().getAttribute(ConstantUtils.AGENCYID).toString();
			systemLogService.addLog(ipAddress, agencyIdS, userId, operName, operType, operateDetail);
		} catch (Exception e) {
			log.error("insert--log---error",e);
		}
	}
}
