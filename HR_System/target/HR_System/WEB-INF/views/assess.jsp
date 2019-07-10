<%--
  Created by IntelliJ IDEA.
  User: 1046509851
  Date: 2019/7/9
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考核</title>
</head>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<body>
<jsp:include page="${APP_PATH }/WEB-INF/views/head.jsp"></jsp:include>
<jsp:include page="${APP_PATH }/WEB-INF/views/text.jsp"></jsp:include>
<jsp:include page="${APP_PATH }/WEB-INF/views/replay.jsp"></jsp:include>
</body>
</html>
