<%@page import="com.imweiwei.ssh.entities.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
<%
User user=new User();
request.setAttribute("user", user);
%>
<form:form modelAttribute="user" action="user_add" method="post">
用户名：<form:input path="user_name"/>
密码<form:password path="user_password"/>
手机号：<form:input path="user_phone"/>
e-mail：<form:input path="user_email"/>
地址：<form:input path="user_address"/>
<input type="submit" value="注册">
</form:form>
</body>
</html>