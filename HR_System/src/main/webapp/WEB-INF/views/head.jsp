<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>企业人力资源系统</title>
	<%
		pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
	<link href="${APP_PATH }/static/bootstrap/css/bootstrap.css" rel="stylesheet" />
	<link href="${APP_PATH }/static/css/base.css" rel="stylesheet" />
</head>
<body>
<div class="container-fluid">
	<nav class="navbar navbar-default row no-yj  navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#nav-list-left"
						aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${APP_PATH }/common/getAll_Admin">企业人力资源系统</a>
			</div>
		</div>
	</nav>

	<div class="row" style="margin-top: 70px">
		<!--左边部分-->
		<div class="  nav-left col-md-2 no-padding" id="nav-list-left">
			<div class="nav-list">
				<ul>
					<li><a id="yhgl" href="#">培训管理</a></li>
					<li><a id="tzgl" href="/common/getAll">培训计划</a></li>
					<li><a id="bkgl" href="#">培训复核</a></li>
					<li><a id="fwjl" href="#">培训考核与反馈</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>


<script src="${APP_PATH }/static/js/jquery-3.3.1.min.js"></script>
<script src="${APP_PATH }/static/bootstrap/js/bootstrap.js"></script>
<script src="${APP_PATH }/static/bootstrap/js/npm.js"></script>
</body>
</html>