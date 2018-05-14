<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户修改</title>
</head>
<body>
<form:form commandName="user" role="form" action="user_update" method="post"> 
<!-- 
用户名：<form:input path="user.user_name"/><br>
密码：<form:password  path="user.user_password"/><br>
手机号：<form:input path="user.user_phone"/><br>
e-mail：<form:input path="user.user_email"/><br>
地址：<form:input path="user.user_address"/><br>
 -->

<input type="submit" value="修改"/>
</form:form>
</body>
</html>