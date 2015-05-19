<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>家庭财务管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"  
    href="<%=basePath%>/res/css/easyui/default/easyui.css">  
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/res/css/easyui/icon.css">  
	  
	<script type="text/javascript" src="<%=basePath%>/res/js/jquery.min.js"></script>  
	<script type="text/javascript" src="<%=basePath%>/res/js/jquery.easyui.min.js"></script>  
	<script type="text/javascript" src="<%=basePath%>/res/js/easyui-lang-zh_CN.js"></script>  
	<script>  
		$(function(){
			$('#dg').datagrid({
				url:'<%=basePath%>/userController/list.do',
				columns:[[
				 {field:'id', title:'id', width:100},   
				 {field:'username', title:'username', width:100},
				 {field:'password', title:'password', width:100}
				]],
				onLoadSuccess:function(data){
					
				}
			});	
		});
	</script>
  </head>
  
  <body>
    <table id="dg"></table>
  </body>
</html>
