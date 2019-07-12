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
						<form action="/common/select" method="post">
							培训名称：<input type="text" name="selectName"/>
							审核状态： <select name="status">
							<option value="1" selected="selected">起草</option>
							<option value="2" selected="selected">审核中</option>
							<option value="3" selected="selected">审核通过</option>
							<option value="4" selected="selected">驳回</option>
						</select>
							培训时间： <input type="text" name="tStart"  >至
							<input type="text" name="tStart" >
							<input type="submit" value="查询"/>
						</form>
						<br/>
                        <form action="/ChangPlan/setPlan">
                            <input type="submit" value="新增培训计划"/>
                        </form>
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
										<c:if test="${trains.sId==1}">
											<form action="/ChangPlan/set" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<input type="submit" class="btn btn-info btn-sm" value="修改"/>
											</form>
											<form action="/common/deleteAll" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<button type="submit" class="btn btn-danger btn-xs" onclick="return user_del();">删除</button>
											</form>
										</c:if>
										<c:if test="${trains.sId==2}">
											<form action="/TrainCheck/getTrainCheck1" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<input type="submit" class="btn btn-info btn-sm" value="复核"/>
											</form>
											<form action="/TrainCheck/getTrainCheck2" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<input type="submit" class="btn btn-info btn-sm" value="驳回"/>
											</form>
										</c:if>
										<c:if test="${trains.sId==3}">
											<form action="/CheckAndResponse/getCheckAndResponse" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<input type="submit" class="btn btn-info btn-sm" value="培训反馈"/>
											</form>
											<form action="/common/getDetail" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<input type="submit" class="btn btn-info btn-sm" value="培训明细"/>
											</form>

										</c:if>
										<c:if test="${trains.sId==4}">
											<form action="/ChangPlan/set" method="post">
												<input type="hidden" name="pid" value="${trains.tPid}">
												<input type="submit" class="btn btn-info btn-sm" value="修改"/>
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

    function user_del() {
        var msg = "您真的确定要删除该培训吗？\n\n删除后不能复原！";
        if (confirm(msg)==true){
            return true;
        }else{
            return false;
        }
    }
</script>
</body>
</html>
