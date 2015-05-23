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
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/res/css/easyui/default/easyui.css">  
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/res/css/easyui/icon.css">  
	  
	<script type="text/javascript" src="<%=basePath%>/res/js/jquery.min.js"></script>  
	<script type="text/javascript" src="<%=basePath%>/res/js/jquery.easyui.min.js"></script>  
	<script type="text/javascript" src="<%=basePath%>/res/js/easyui-lang-zh_CN.js"></script>
  	<script type="text/javascript">
  		$(function(){
  			$('#tabs').tabs('add',{
  				title:'首页',
  				href:'main.jsp',
  				closable:false
  			});
  			$('.easyui-tree').tree({
  				onClick:function(node){
  		        	if (node.attributes.url != '' && node.attributes.url != null)
  		            {
  		                if ($('.easyui-tabs').tabs('exists', node.text))
  		                {
  		                    $('.easyui-tabs').tabs('select', node.text);
  		                }
  		                else
  		                {
  		                    $('.easyui-tabs').tabs('add',{   
  		                        title:node.text,   
  		                        href:node.attributes.url,   
  		                        closable:true  
  		                    });
  		                }
  		            }
  		        }
  			});
  		});
  	</script>
  
  </head>
  
  <body class="easyui-layout">
  	<div data-options="region:'north',noheader:true,split:false" style="height:66px;background:#FFFFCC">
  		<h1>家庭财务管理系统</h1> 
  	</div>
  	<div data-options="region:'west',title:'菜单',split:true" style="width:200px;">  
        <div class="easyui-accordion"  border="false" id='menu'>  
            ${menus}  
        </div>  
    </div>
    <div data-options="region:'center'," style="padding:1px;">  
        <div id='tabs' class="easyui-tabs" data-options="fit:true,border:false">  
    </div>
  </body>
</html>














