<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>回复</title>
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
                    <div class="panel-heading">培训反馈</div>
                    <%--    可以增加的部分--%>
                    <div class="panel-body">
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
                                        <td>
                                            ${respon.view}
                                        </td>
                                    </tr>

                                </table>
                              
                            </div>
                        </div>
                    </div>
                    <form action="/CheckAndResponse/setReplay" method="post">
                        <table class="table table-bordered tb-hover">
                            <tr>
                                <td>
                                    培训反馈：
                                </td>
                                <td>
                                    <select name="response">
                                        <option value="优" selected="selected">优</option>
                                        <option value="良" selected="selected">良</option>
                                        <option value="差" selected="selected">差</option>
                                    </select>
                                </td>
                            </tr>

                          <tr>
                              <td>
                                  培训总结：
                              </td>
                              <td>
                                  <input type="text" name="summary">
                              </td>
                          </tr>
                        <tr>
                            <td>
                                考核结果：
                            </td>
                            <td>
                                <input type="text" name="result">
                            </td>
                        </tr>

                        </table>

                        <table class="table table-bordered tb-hover">
                            <input type="hidden" name="pid" value="${train.tPid}">
                            <input type="submit" value="保存"><br/>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="${APP_PATH }/static/js/admin.js"></script>

</body>
</html>
