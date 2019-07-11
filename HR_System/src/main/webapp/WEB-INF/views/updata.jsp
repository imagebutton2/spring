<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>update</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
</head>
<jsp:include page="${APP_PATH }/WEB-INF/views/head.jsp"></jsp:include>
<body>
<div class="container">
    <div class="row">

        <!--右边板块-->
        <div class="main-right  col-md-10 col-md-offset-2">
            <!--  -->
            <div class="col-md-12 yhgl">
                <div class="panel panel-default ">
                    <div class="panel-heading">培训计划</div>
                    <%--    可以增加的部分--%>
                    <div class="panel-body">
                        <form action="/ChangPlan/upData">
                        <table class="table table-bordered tb-hover">
                            <tr>
                                <td>
                                    培训名称：
                                </td>
                                <td><input type="text" name="tName"></td>
                            </tr>
                            <tr>
                                <td>
                                    培训教师：
                                </td>
                                <td><input type="text" name="tTeacher"></td>
                                <td>
                                    培训时间：
                                </td>
                                <td>
                                    <input type="text" name="tStart">
                                </td>
                                <td>
                                    至
                                </td>
                                <td>
                                    <input type="text" name="tEnd">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    培训目的：
                                </td>
                                <td><input type="text" name="tGoal"></td>
                            </tr>

                            <tr>
                                <td>
                                    参训人员：
                                </td>
                                <td><input type="text" name="tMember"></td>
                            </tr>

                            <tr>
                                <td>
                                    培训简介：
                                </td>
                                <td><input type="text" name="tIntroduction"></td>
                            </tr>

                            <tr>
                                <td>
                                    培训资料：
                                </td>
                                <td><input type="text" value="5"></td>
                            </tr>

                        </table>

                        <br/>
                            <input type="hidden" name="pid" value="${trains.tPid}">
                            <input type="submit" value="保存">
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