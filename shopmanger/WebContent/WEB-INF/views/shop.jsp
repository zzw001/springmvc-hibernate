<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>"${shop_name }商店"</title>
</head>
<body>
<h3>"${shop_name }"商店商品</h3>
<table class='itable' border='1' cellspacing='0' width='400px' height='150'>
	<tr>
		<td>商品名称</td>
		<td>品牌商</td>
		<td>生产商</td>
		<td>代理商</td>
		<td>生产日期</td>
		<td>商品类型</td>
		<td>价格</td>
	</tr>
	<c:forEach items="${pro_lists }" var="pro">
		<tr>
			<td>${pro.pro_name}</td>
			<td>${pro.pro_brand}</td>
			<td>${pro.pro_factory}</td>
			<td>${pro.pro_dealer}</td>
			<td>${pro.pro_date}</td>
			<td>${pro.pro_type}</td>
			<td>${pro.pro_price}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>