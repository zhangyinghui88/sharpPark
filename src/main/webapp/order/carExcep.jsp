<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<%@ page import="com.compass.utils.ConstantUtils"%>
<%
    String agencyId = session.getAttribute(ConstantUtils.AGENCYID)
					.toString();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>云停风驰管理系统</title>
<script type="text/javascript">	
var agid='<%=session.getAttribute(ConstantUtils.AGENCYID).toString().trim()%>';
var sysId='<%=session.getAttribute(ConstantUtils.SYSTEMID).toString().trim()%>';
var parentagencyId='<%=session.getAttribute(ConstantUtils.PARENTAGENCYID).toString().trim()%>';
var staticagecyId='<%=ConstantUtils.CENTERCODE%>';
var roleid=${sessionScope.roletypeId};
var onlineControl='<%=session.getAttribute(ConstantUtils.ONLINEFLAG)%>';
var agencyControl='<%=session.getAttribute(ConstantUtils.AGENCYFLAG)%>';
	//判断是否为中文
	function checkChinese(str) {
		var reg = new RegExp("[\\u4E00-\\u9FFF]+", "g");
		return reg.test(str);
	}

	function cs() {
		return $(window).width() - 8;
	}
	$(function() {
		$.viewOrder();
	});

	function check() {
		if (roleid != "1") {
			return true;
		}
		return false;
	}
	$.success = function(message, data) {
		$.messager.alert("提示 ", message);
		$('#save').linkbutton('enable');
		$.close();
		$.viewOrder();
	};
	$.failed = function(message, data) {
		$.messager.alert("提示 ", message);
		$('#save').linkbutton('enable');

	};
	$.close = function() {
		$.hideDivShade();
		$("#markSave").window('close');
	};
	$.viewOrder = function() {
		var carNumber = $('#carNumber').val();
		if (carNumber == null || $.trim(carNumber) == '-1') {
			carNumber = "";
		}
		$('#viewOrder').datagrid({
			title : '异常出场',
			width : $(window).width() - 8,
			height : $(window).height() * 0.9,
			pageSize : 20,
			pageNumber : 1,
			url : "${ctx}/order/order.do?method=getExcepOrder",
			queryParams : {
				carNumber : carNumber
			},
			loadMsg : '数据载入中,请稍等！',
			remoteSort : false,
			pagination : true,
			columns : [ [ 
			{
				field : "parkingName",
				title : "停车场名称",
				width : 100,
				align : "center",
				sortable : true
			}, {
				field : "carNumber",
				title : "车牌",
				width : 100,
				align : "center",
				sortable : true
			}, {
				field : "carType",
				title : "车牌类型",
				width : 100,
				align : "center",
				sortable : true,
				formatter:function(value,row,index){
		          	if(value == 1){
		          		return '小型车';
		          	}else if(value == 2){
		          		return '中型车';
		          	}else if(value == 3){
		          		return '大型车';
		          	}else if(value == 4){
		          		return '摩托车';
		          	}else if(value == 5){
		          		return '其他';
		          	}else{
		          		return '未知';
		          	}
		        }
			}, {
				field : "inTime",
				title : "入场时间",
				width : 120,
				align : "center",
			}, {
				field : "lane",
				title : "入场车道",
				width : 80,
				align : "center",
				sortable : true
			}, {
				field : "outTime",
				title : "出场时间",
				width : 120,
				align : "center",
			}, {
				field : "lane",
				title : "车场车道",
				width : 80,
				align : "center",
			}, {
				field : "inDuration",
				title : "停车时长（分）",
				width : 130,
				align : "center",
			}, {
				field : "paidMoney",
				title : "应收停车费",
				width : 110,
				align : "center",
			}, {
				field : "orderSynStatus",
				title : "是否缴费",
				width : 100,
				align : "center",
				formatter:function(value,row,index){
		          	if(value == '0'){
		          		return '未支付';
		          	}else if(value == '1'){
		          		return '已支付';
		          	}
				}
			}, {
				field : "billingTyper",
				title : "缴费类型",
				width : 150,
				align : "center",
				sortable : true,
				formatter:function(value,row,index){
		          	if(value == 'M'){
		          		return '月卡';
		          	}else if(value == 'L'){
		          		return '临时';
		          	}else if(value == 'F'){
		          		return '免费';
		          	}else if(value == 'N'){
		          		return '无牌车';
		          	}else if(value == 'A'){
		          		return '支付宝';
		          	}else if(value == 'W'){
		          		return '微信';
		          	}else if(value == 'C'){
		          		return '现金';
		          	}else if(value == 'G'){
		          		return '强制放行';
		          	}
		        }
			}, {
				field : "paidMoney",
				title : "缴费金额",
				width : 100,
				align : "center",
			} ] ],
			hideColumn : [ [ {
				field : "timeOut"
			} ] ],
			pagination : true,
			rownumbers : true,
			showFooter : true
		});
		$('#btnsave').hide();
		var p = $('#viewOrder').datagrid('getPager');
		$(p).pagination({
			pageList : [ 20 ],
			beforePageText : '第',
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		});
	};
	
	function resetOrder(){
		$('#carNumber').val('');
	}
</script>
</head>
<body id="indexd">
	<table>
		<tr>
			<td>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				车牌：
			</td>
			<td>
			<input type="text" id="carNumber" name="carNumber" style="width:150px"></input>
			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="$.viewOrder()">查询</a></td>
			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" onclick="resetOrder()">重置</a></td>
		</tr>
	</table>
	<table id="viewOrder"></table>
</body>
