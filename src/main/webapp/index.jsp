<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎来到你群语录计划</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h2>传说中的测试登陆注册页面</h2> <br>
    <form action="userLogin.action" method="post">
	    <input type="text" name="username" placeholder="请输入用户名">
	    <input type="password" name="password" placeholder="请输入密码">
	    <input type="reset" value="重置">
	    <input type="submit" value="登陆">
    </form>
    <form action="userRegister.action" method="post">
	    <input type="text" name="username" placeholder="请输入用户名">
	    <input type="password" name="password" placeholder="请输入密码">
	    <input type="text" name="displayname" placeholder="请输入昵称">
	    <input type="reset" value="重置">
	    <input type="submit" value="注册">
    </form>
  </body>
</html>
