<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Test</title>

</head>
<body>
<%--<div>--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><h3>id</h3></td>--%>
            <%--<td><h3>name</h3></td>--%>
        <%--</tr>--%>
        <%--<c:forEach var="student" items="${student}">--%>
            <%--<tr>--%>
                <%--<td>${student.id}</td>--%>
                <%--<td>${student.name}</td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
<%--</div>--%>
<%--<select>--%>

    <c:forEach var="showt" items="${showt}">
        <h3> ${showt.tName}</h3>
        <h3> ${showt.tMember}</h3>
    </c:forEach>
<%--</select>--%>
<br/><br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div>


</div>



</body>

</html>