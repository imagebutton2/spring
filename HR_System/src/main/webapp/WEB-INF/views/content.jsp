<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>

<body>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<jsp:include page="${APP_PATH }/WEB-INF/views/head.jsp"></jsp:include>
<!--主体（下）-->
<div class="container">
	<div class="row">
		<!--右边板块-->
		<div class="main-right  col-md-10 col-md-offset-2">
			<div class="col-md-12 yhgl">
				<div class="panel panel-default ">
					<div class="panel-heading">培训计划</div>
					<div>
						<form action="">
							培训名称：<input type="text"/>
							审核状态：<select>
							<c:forEach var="statuses" items="${statuses}">
								<option >${statuses.sName}</option>
							</c:forEach>
						</select>
							培训时间：<input type="checkbox"/>
							<input type="submit" value="查询"/>
						</form>
						<br/>
						<input type="button" value="新增培训计划"/>
					</div>
					<%--    可以增加的部分--%>
					<div class="panel-body">
						<table class="table table-bordered tb-hover">
							<thead>
							<tr>
								<td>培训名称</td>
								<td>培训教师</td>
								<td>培训时间</td>
								<td>培训反馈</td>
								<td>审核状态</td>
								<td class="text-center">操作</td>
							</tr>
							</thead>
							<tbody>
							<!-- 循环开始 -->
							<c:forEach var="trains" items="${trains}" >
								<tr>
									<td>${trains.tName}</td>
									<td>${trains.tTeacher}</td>
									<td>${trains.tStart}</td>
									<td>${trains.resp.response}</td>
									<td>
										<c:if test="${trains.sId==1}">起草</c:if>
										<c:if test="${trains.sId==2}">审核中</c:if>
										<c:if test="${trains.sId==3}">审核通过</c:if>
										<c:if test="${trains.sId==4}">驳回</c:if>
									</td>
									<td class=" text-center">
										<c:if test="${empty adminList}">
											<span class="glyphicon glyphicon-ban-circle"></span>
										</c:if>
										<c:if test="${!empty adminList}">
											<form action="${APP_PATH}/userController/deleteUser" method="post">
												<input type="hidden" name="userid" value="${trainshow.userid}">
												<button type="submit" class="btn btn-danger btn-xs" onclick="return user_del();">删除</button>
											</form>
										</c:if>
									</td>
								</tr>
							</c:forEach>
							<!-- 循环结束 -->
							</tbody>
						</table>
					</div>
				</div>
			</div>



		</div>
	</div>
</div>
<script src="${APP_PATH }/static/js/admin.js"></script>
<script src="${APP_PATH }/static/js/delete.js"></script>
<script>
    /**
     * 用户删除确认框
     * @returns
     */
    function user_del() {
        var msg = "您真的确定要删除该用户吗？\n\n删除后不能复原！";
        if (confirm(msg)==true){
            return true;
        }else{
            return false;
        }
    }
</script>
</body>
</html>
