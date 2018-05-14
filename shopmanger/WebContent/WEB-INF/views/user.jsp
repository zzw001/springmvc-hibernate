<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>浏览商品</title>
</head>
<body>
<a href="user_info?user_id=${user.user_id}">欢迎${user.user_name}</a>
<div>

<table class='itable' border='1' cellspacing='0' width='400px' height='150'>
	<tr>
		<td>商店名</td>
		<td>商品名字</td>
		<td>品牌商</td>
		<td>生产商</td>
		<td>代理商</td>
		<td>生产日期</td>
		<td>商品类型</td>
		<td>价格</td>
	</tr>
	<c:forEach items="${pro_lists }" var="shop">
		
			<c:set value="${shop.item}" var="product"/>
			<c:forEach items="${product }" var="pro">
			<tr>
			    <td>${shop.shop_name}</td>
				<td>${pro.pro_name}</td>
				<td>${pro.pro_brand}</td>
				<td>${pro.pro_factory}</td>
				<td>${pro.pro_dealer}</td>
				<td>${pro.pro_date}</td>
				<td>${pro.pro_type}</td>
				<td>${pro.pro_price}</td>
			</tr>
			</c:forEach>
		
	</c:forEach>
</table>
</div>
</body>
</html>