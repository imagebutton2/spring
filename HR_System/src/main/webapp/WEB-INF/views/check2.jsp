<%--
  Created by IntelliJ IDEA.
  User: 1046509851
  Date: 2019/7/11
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>驳回</title>
</head>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<jsp:include page="${APP_PATH }/WEB-INF/views/head.jsp"></jsp:include>
<body>
<div class="container">
    <div class="row">
        <!--右边板块-->
        <div class="main-right  col-md-10 col-md-offset-2">
            <!--  -->
            <div class="col-md-12 yhgl">

                <div class="panel panel-default ">
                    <div class="panel-heading">培训复核</div>
                    <%--    可以增加的部分--%>
                    <div class="panel-body">
                        <table class="table table-bordered tb-hover">
                            <tr>
                                <td>
                                    培训名称：
                                </td>
                                <td><input type="text" name="tName" value="${train.tName}"></td>
                            </tr>
                            <tr>
                                <td>
                                    培训教师：
                                </td>
                                <td><input type="text" name="tTeacher" value="${train.tTeacher}"></td>
                                <td>
                                    培训时间：
                                </td>
                                <td>
                                    <input type="text" name="tStart" value="${train.tStart}">
                                </td>
                                <td>
                                    至
                                </td>
                                <td>
                                    <input type="text" name="tEnd" value="${train.tEnd}">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    培训目的：
                                </td>
                                <td><input type="text" name="tGoal" value="${train.tGoal}"></td>
                            </tr>

                            <tr>
                                <td>
                                    参训人员：
                                </td>
                                <td><input type="text" name="tMember" value="${train.tMember}"></td>
                            </tr>
                            <tr>
                                <td>
                                    培训简介：
                                </td>
                                <td><input type="text" name="tIntroduction" value="${train.tIntroduction}"></td>
                            </tr>

                            <tr>
                                <td>
                                    培训资料：
                                </td>
                                <td><input type="text" value="培训资料"></td>
                            </tr>

                        </table>
                        <form action="/TrainCheck/refuse" method="post">
                            <table>
                                <tr>
                                    <td>
                                        审核意见：
                                    </td>
                                    <td>
                                        <input type="text" value="${respon.view}" name="view">
                                    </td>
                                </tr>
                            </table>
                            <input type="hidden" name="pid" value="${train.tPid}">
                            <input type="submit" value="驳回">
                        </form>
                        <br/>
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
