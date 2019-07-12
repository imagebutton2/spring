<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>suggestion</title>
</head>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
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
                            <tr>
                                <td>
                                    培训名称：
                                </td>
                                <td>${train.tName}</td>
                            </tr>
                            <tr>
                                <td>
                                    培训教师：
                                </td>
                                <td>${train.tTeacher}</td>
                                <td>
                                    培训时间：
                                </td>
                                <td>
                                   ${train.tStart}
                                </td>
                                <td>
                                    至
                                </td>
                                <td>
                                   ${train.tEnd}
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    培训目的：
                                </td>
                                <td>${train.tGoal}</td>
                            </tr>

                            <tr>
                                <td>
                                    参训人员：
                                </td>
                                <td>${train.tMember}</td>
                            </tr>

                            <tr>
                                <td>
                                    培训简介：
                                </td>
                                <td>${train.tIntroduction}</td>
                            </tr>

                            <tr>
                                <td>
                                    培训资料：
                                </td>
                                <td>培训资料</td>
                            </tr>

                            <tr>
                                <td>
                                   审核意见：
                                </td>
                                <td></td>
                            </tr>

                        </table>
                        <table class="table table-bordered tb-hover">
                            审核意见结果：
                            <input type="text"><br/>
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
