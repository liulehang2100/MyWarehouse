<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<style type="text/css">
	body{text-aglin:center;}
	table{margin:0px auto;}
</style>
</head>
<body>
	<table border="1">
		<tr><th colspan="4">阳光幼儿园学生列表</th></tr>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
		<c:forEach items="${stus}" var="stu">
			<tr>
				<td>${stu.sid}</td>
				<td>${stu.sname}</td>
				<td>${stu.age}</td>
				<td>${stu.sex==0?'女':'男'}</td>
			<tr/>
		</c:forEach>
	</table>
</body>
</html>