
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>复核</title>
</head>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<body>
<jsp:include page="${APP_PATH }/WEB-INF/views/head.jsp"></jsp:include>
<jsp:include page="${APP_PATH }/WEB-INF/views/doc.jsp"></jsp:include>
<jsp:include page="${APP_PATH }/WEB-INF/views/suggestion.jsp"></jsp:include>
</body>
</html>
