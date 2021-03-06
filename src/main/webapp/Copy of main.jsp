<%@page import="java.util.ArrayList"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ include file="/commons/taglibs.jsp"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
.colors {
	font-size: 12px;
	color: #ffffff;
	font-weight: bold;
	line-height: 25px;
	padding: 2px;
	background-image: -moz-linear-gradient(top, #ffffff, #F2F2F2); /* Firefox */
	background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #ffffff), color-stop(1, #F2F2F2)); /* Saf4+, Chrome */
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#84909c', endColorstr='#c7ccd1', GradientType='0');
} /* IE*/
</style>
<script type="text/javascript" src="${ctx}/commons/js/tab.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>云停风驰管理系统</title>
<script type="text/javascript">
	var flag = "${initpwd}";
	var userPhone = "${userPhone}";
	var pwdRegularity = "${pwdRegularity}";
	var systemLogIpAddress = "${systemLogIpAddress}";
	var operateTime="${perateTime}";
	$(function() {

		$("#detailTree").tree({
			onlyLeafCheck : true,
			checkbox : false,
			url : "${ctx}/users/users.do?method=getMenuTree",
			onSelect : function() {

				var row = $("#detailTree").tree('getSelected');
				var url = row.attributes.url;
				if (url != '' && url != null) {
					addTab(row.text, url, '123');
				}

			}
		});
		
		$('#agencyApprove').click(function() {
			$('#sendMessage').window('open');
		});
		
		
		
		
<%
String username = (String)request.getSession().getAttribute("username");
String agencyId = (String) request.getSession().getAttribute("agencyId");
if(username.equals(agencyId)){
%>	
		
		$.post("${ctx}/agency/agency.do?method=getAgencyObj", {
		}, function(data) {
			getAgencyDate(data);
		}, "json");
		
		
		$.post('${ctx}/agency/agency.do?method=getAgencyObject',
				function(data) {
					if (data.success == "true") {
						$('#resert').window('close');
					} else {
						$('#resert').window('open');
					}
	    }, "json");

<%
}
%>	
	
	});
	
	
	function getAgencyDate(data){
		if(data){
			$("#companyName").val(data.companyName);
			$("#renameCompanyName").val(data.renameCompanyName);
			$("#contactsName").val(data.contactsName);
			$("#companyPhone").val(data.companyPhone);
			$("#companyEmail").val(data.companyEmail);
		}
	}
	
	//设置登录窗口
	function openPwd() {
		$('#w').window({
			title : '修改密码',
			width : 300,
			modal : true,
			shadow : true,
			closable : false,
			height : 210,
			resizable : false
		});
		/* $('#sendMessage').window({
		    title: '验证码校验',
		    width: 320,
		    modal: true,
		    shadow: true,
		    closable: true,
		    height: 210,
		    resizable:false,
		    onBeforeClose:function(){ 
		    	$.post('${ctx}/users/users.do?method=destroySession',{       
				}, function(data) {
					location.href = '${ctx}/login/login.jsp';	
				}, "json");
		        }
		}); */
		$('#txtNewPass').val('');
		$('#txtRePass').val('');
		$('#txtOldPass').val('');
	}
	//关闭登录窗口
	function closePwd() {
		if ("1" == flag || "2" == flag) {
			$.messager.alert("提示 ", "请修改密码!");
			return;
		}

		$('#w').window('close');
		$('#txtNewPass').val('');
		$('#txtRePass').val('');
		$('#txtOldPass').val('');
	};

	//发送验证码
	function sendMessage() {
		var phone = $("#messageText").val();
		if (!phone) {
			phone = "";
		} else {
			var regMobile = /^1[3578][01379]\d{8}|1[34578][01256]\d{8}|134[012345678]\d{7}|1[34578][012356789]\d{8}$/g;//手机号码有效判断电信|联通|移动|移动
			if (!regMobile.test(phone)) {
				$.messager.alert("提示 ", "请输入有效的手机号码!");
				return false;
			}
		}
		$.post('${ctx}/message/message.do?method=sendMessage', {
			phone : phone
		}, function(data) {
			if (data.success == "true") {
				$("#getCheckCode").attr("disabled", true);
				$.messager.alert("提示", data.message);
			} else {
				$.messager.alert("提示", data.message);
			}
		}, "json");

	}
	//修改密码
	function serverLogin() {
		var newPwd = $('#txtNewPass').val();
		var rePass = $('#txtRePass').val();
		var oldPwd = $('#txtOldPass').val();
		if (newPwd.length < 6) {
			msgShow('系统提示', '密码长度必须大于6！', 'warning');
			return false;
		}

		var regg = eval(pwdRegularity);
		if (!regg.test($('#txtNewPass').val().trim())) {
			msgShow('系统提示', '您的密码强度较低，请设置长度8~16位并且数字、字母、字符至少包含两种的密码', 'warning');
			$("#txtNewPass").focus();
			return false;
		}

		newPwd = hex_md5(newPwd);
		rePass = hex_md5(rePass);
		oldPwd = hex_md5(oldPwd);

		if (oldPwd == '') {
			msgShow('系统提示', '请输入原始密码！', 'warning');
			return false;
		}

		if (newPwd == '') {
			msgShow('系统提示', '请输入新密码！', 'warning');
			return false;
		}
		if (rePass == '') {
			msgShow('系统提示', '请再一次输入密码！', 'warning');
			return false;
		}

		if (newPwd != rePass) {
			msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
			return false;
		}

		if (newPwd == oldPwd) {
			msgShow('系统提示', '不可以为初始密码！', 'warning');
			return false;
		}
		$.post('${ctx}/users/users.do?method=updateUserPwd', {
			newPwd : newPwd,
			oldPwd : oldPwd
		}, function(data) {
			if(data.success=="true"){
				$.messager.alert("提示", data.message);
				$('#w').window('close');
			}else{
				$.messager.alert("提示", data.message);
	   		 }
			
			
		}, "json");

	}

	$(function() {
		$.post('${ctx}/systemlog/systemlog.do?method=getOpenLoginShowFlag',
				function(data) {
					if (data == "1") {
						$('#hint').window('open');
					} else if (data == "0") {
						$('#hint').window('close');
					}
				}, "json");
		openPwd();
		$('#editpass').click(function() {
			$('#w').window('open');
		});

		$('#btnEp').click(function() {
			serverLogin();
		});

		$('#btnCancel').click(function() {
			closePwd();
		});

		$('#btnCancelhint').click(function() {
			closeHint();
		});

		$('#hint').window({
			onBeforeClose : function() {
				 $.post('${ctx}/systemlog/systemlog.do?method=getCloseLoginShowFlag',
								function(data) {
									if (data.success == "true") {
									} else {
									}
								}, "json"); 
							}
		});

		/*	$("#btnMsg").click(function(){
				var checkCode=$("#checkCode").val();
				$.post('${ctx}/message/message.do?method=checkCode',{
					checkCode:checkCode
				}, function(data) {
					if(data.success=="true"){
					 $('#sendMessage').window('close',true);
					}else{
						$.messager.alert("提示", data.message);
					}
				}, "json");
			}); */
		$('#loginOut').click(function() {
							$.messager.confirm('系统提示','您确定要退出本次登录吗?',
							function(r) {
								if (r) {
									$.post('${ctx}/users/users.do?method=destroySession',{},
													function(data) {
														location.href = '${ctx}/login/login.jsp';
													}, "json");
								}
							});
						});
		if ("1" == flag) {
			$("#warnID").text("您的密码的初始密码,请修改修改！");
			$('#w').window('open');
		} else {
			$("#warnID").text("");
			closePwd();
		}

		if ("2" == flag) {
			$("#warnID").text("您的密码超出有效期,请修改！");
			$('#w').window('open');
		} else {
			$("#warnID").text("");
			closePwd();
		}

		$('#btnEpResert').click(function() {
			btnEpResert();
		});
		
		$('#editAgency').click(function() {
			$('#resert').window('open');
			$.post("${ctx}/agency/agency.do?method=getAgencyObj", {
			}, function(data) {
				getAgencyDate(data);
			}, "json");
			
			
			
		});
		
		$('#loginRemind').click(function() {
			$('#hint').window('open');
		});
		
		
		

	});

	$.success = function(message, data) {
		flag = "0";
		closePwd();
	};

	$.failed = function(message, data) {
		$.messager.alert("提示 ", message);
	};

	$.checkLength = function(a) {
		alert(a);
		alert(a.length());
	}

	//设置登录提示窗口
	function openhint() {
		$('#hint').window({
			title : '  ',
			width : 750,
			modal : true,
			shadow : true,
			closable : false,
			height : 120,
			resizable : false
		});
	}

	//设置用户登录修改资料窗口
	function openResert() {
		$('#resert').window({
			title : '修改个人信息',
			width : 750,
			modal : true,
			shadow : true,
			closable : false,
			height : 120,
			resizable : false
		});
	}

	//用户登录修改资料
	function btnEpResert() {
		var contactsName = $("#contactsName").val(); //联系人
		var renameCompanyName = $("#renameCompanyName").val(); //企业名称
		var companyPhone = $("#companyPhone").val(); //公司电话
		var companyEmail = $("#companyEmail").val(); //企业邮箱

		if ($.trim(contactsName) == "") {
			$.messager.alert("提示 ", "请输入联系人");
			return false;
		}
		if ($.trim(renameCompanyName) == "") {
			$.messager.alert("提示 ", "请输入公司名称");
			return false;
		}

		if ($.trim(companyEmail) == "") {
			$.messager.alert("提示 ", "请输入电子邮箱");
			return false;
		}

		if (!(/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/)
				.test($.trim(companyEmail))) {
			$.messager.alert("提示 ", "邮箱格式不正确");
			return false;
		}
		$.post('${ctx}/agency/agency.do?method=updateAgency', {
			renameCompanyName : renameCompanyName,
			companyPhone : companyPhone,
			companyEmail : companyEmail,
			contactsName : contactsName
		}, function(data) {
			if (data.success == "true") {
				$.messager.alert("提示", data.message);
				$('#resert').window('close');
			} else {
				$.messager.alert("提示", data.message);
			}
		}, "json");

	}
</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden" fit="true" scroll="no">
	<div data-options="region:'north',title:'',split:false"
		style="overflow: true; height: 65%; background: url('') repeat-x center 50%; line-height: 20px; font-family: Verdana, 微软雅黑, 黑体" class='colors'>
		<table width="100%">
			<tr>
				<td><img height="50px" width="463px" src="${ctx}/commons/images/logo.png" alt="" /></td>
				<td align="right" style="font-size: 12px; font-weight: bold;"><span style="float: right; padding-right: 20px; padding-top: 15px">
				<a>欢迎${username}<a />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<%
				if(username.equals(agencyId)){
				%>
				<a href="#" id="editAgency">修改代理商信息</a>
				<%
				}
				%>
				&nbsp;&nbsp;&nbsp;&nbsp; <a href="#" id="loginRemind">登录提示</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" id="editpass">修改密码</a>&nbsp;&nbsp;<a href="#" id="agencyApprove">代理商认证</a>&nbsp;&nbsp; <a href="#" id="loginOut">安全退出</a></span></td>
			</tr>
		</table>
	</div>

	<div data-options="region:'west',title:'导航菜单',split:true" style="width: 180px;">
		<div id="nav">
			<!--  导航内容 -->
			<ul id="detailTree" name="detailTree" data-options="checkbox:true,animate:true,lines:true"></ul>
		</div>
	</div>
	<div id="mainPanle" data-options="region:'center',title:''" style="padding: 0px; background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false"></div>
	</div>

	<!--修改密码窗口-->
	<div id="w" class="easyui-window" title="修改密码" collapsible="false" minimizable="false" maximizable="false" icon="icon-save"
		style="width: 350px; height: 250px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<span id="warnID"></span>
				<table cellpadding=3>
					<tr>
						<td>原始密码：</td>
						<td><input id="txtOldPass" class="txt01" type="password" maxlength="16" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" /></td>
					</tr>
					<tr>
						<td>新密码：</td>
						<td><input id="txtNewPass" class="txt01" type="password" maxlength="16" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')"
								data-errormessage="密码长度最少6位" minlength="6" placeholder="密码长度最少6位" /></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input id="txtRePass" class="txt01" type="password" maxlength="16" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')"
								data-errormessage="密码长度最少6位" minlength="6" placeholder="密码长度最少6位" /></td>
					</tr>
				</table>
			</div>
			<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
				<a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)">确定</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel"
					href="javascript:void(0);">取消</a>

			</div>
		</div>
	</div>


	<!--登录提示窗口-->
	<div id="hint" class="easyui-window" title="登录提示" closed="true" style="width: 500px; height: 180px; padding: 5px; background: #fafafa;"
		collapsible="false" minimizable="false" maximizable="false" icon="icon-save">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<table cellpadding=3>
					<tr>
						<td>尊敬的用户，您上次登录的时间为：<a>${perateTime}<a />（IP地址为<a> ${systemLogIpAddress}<a />）</td>
					</tr>
					<tr>
						<td>如上次登录时间与您实际操作时间不符，请警惕平台安全。</td>
					</tr>
				</table>
			</div>
		</div>
	</div>

<%
if(username.equals(agencyId)){
%>
   <!--可登陆用户修改资料窗口-->
	<div id="resert" class="easyui-window" closed="true" title="修改代理商信息" collapsible="false" minimizable="false" maximizable="false" icon="icon-save"
		style="width: 350px; height: 350px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<span id="warnID"></span>
				<table cellpadding=3 style="padding-left: 30px; padding-top: 10px;">
					<tr>
						<td>历史公司名称：</td>
						<td><input type="text" name="companyName" id="companyName" maxlength="50"  disabled="disabled"/></td>
					</tr>
					<tr>
						<td>公司名称：</td>
						<td><input type="text" name="renameCompanyName" id="renameCompanyName" maxlength="50" /></td>
					</tr>
					<tr>
						<td>联系人：</td>
						<td><input type="text" id="contactsName" name="contactsName" maxlength="50" /></td>
					</tr>
					<tr>
						<td>手机号码：</td>
						<td><input type="text" name="companyPhone" id="companyPhone" maxlength="11" onkeyup="value=this.value.replace(/\D+/g,'')" /></td>
					</tr>
					<tr>
						<td>电子邮箱：</td>
						<td><input type="text" name="companyEmail" id="companyEmail" maxlength="50" /></td>
					</tr>
				</table>
				<p><font color="red">为不影响您本人的平台正常使用，请于2017年3月15日前完成以上资料的更改，谢谢。</font></p>
			</div>
			<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
				<a id="btnEpResert" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)">修改</a>
			</div>
		</div>
	</div>
   
<%
}
%>

<!--可登陆用户修改资料窗口-->



	<!-- 发送验证码   -->
    <div id="sendMessage" class="easyui-window" title="发送验证码" collapsible="false" minimizable="false" 
        maximizable="false" icon="icon-save"  style="width: 350px; height: 250px; padding: 5px;
        background: #fafafa;">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
                
               <c:if test="${empty sessionScope.userPhone  }">
               <span id="warnID1">为了您的账号安全，请绑定手机号码</span><br/><br>
                请输入手机号码<input id="messageText" type="text" maxlength="11" >
                <input id="checkCode" onkeyup="value=this.value.replace(/\D+/g,'')" type="text" maxlength="6" ><input id="getCheckCode" onclick="sendMessage()" type="button" value="发送验证码"></input><br/>
               </c:if>
               <%-- <c:if test="${!empty sessionScope.userPhone}">
               <span id="warnID1">为了您的账号安全，请输入验证码</span><br/><br>
                <input id="checkCode" onkeyup="value=this.value.replace(/\D+/g,'')" type="text" maxlength="6" ><input id="getCheckCode"  type="button" onclick="sendMessage()" value="发送验证码"></input><br/>
                <span>验证码将发送到您绑定的手机号码${fn:substring(sessionScope.userPhone,0,3)}****${fn:substring(sessionScope.userPhone,fn:length(sessionScope.userPhone)-4,fn:length(sessionScope.userPhone))}</span>
               </c:if> --%>

            </div>
            <div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
                <a id="btnMsg" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)">确定</a>
               </div>
        </div>
    </div>
   

	<div align="center" data-options="region:'south',title:'',split:true"
		style="overflow: true; height: 30%; line-height: 20px; font-family: Verdana, 微软雅黑, 黑体" class='colors'>
		<img align="middle" src="${ctx}/commons/images/bottom.png" alt="" />
	</div>

	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="close">关闭</div>
		<div id="closeall">全部关闭</div>
		<div id="closeother">除此之外全部关闭</div>
	</div>

</body>
</html>