<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
</head>
<body>
<div class="container">
	<div class="row">

		<!--右边板块-->
		<div class="main-right  col-md-10 col-md-offset-2">
			<!--  -->
			<div class="col-md-12 yhgl">
				<div class="panel panel-default ">
					<div class="panel-heading"></div>
					<%--    可以增加的部分--%>
					<div class="panel-body">
						<table class="table table-bordered tb-hover">
							培训名称：<input type="text" value="1" readonly="readonly"><br/>
							培训教师：<input type="text" value="2" readonly="readonly">【】【】【】
							培训时间：
							<br/>
							培训目的：
							<input type="text" value="3" ><br/>
							参训人员：
							<input type="text" value="4" ><br/>
							培训简介：
							<input type="text" value="5" ><br/>
							培训资料：
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="${APP_PATH }/static/js/admin.js"></script>
<script src="${APP_PATH }/static/js/delete.js"></script>
</body>
</html>