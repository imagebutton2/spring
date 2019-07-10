
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doc</title>
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
