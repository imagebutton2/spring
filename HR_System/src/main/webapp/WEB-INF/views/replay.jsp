
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>回复</title>
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
                            培训反馈：<select>
                            <c:forEach var="student" items="${student}">
                                <option value="${student.name}">${student.name}</option>
                            </c:forEach>
                        </select>
                            培训总结：<input type="text">
                            <br/>
                            考核结果：
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
