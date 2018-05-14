<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家信息</title>
</head>
<body>

	<form action="show_shop" method="post">
		商家店名：<input type="text" name="shop_name"><br>
		密码：<input type="text" name="shop_password"><br>
		<input type="submit" value="登录">
	</form>
	<script type="text/javascript">alert("商店名或密码错误");</script>
</body>
</html>