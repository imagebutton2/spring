<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 1046509851
  Date: 2019/7/18
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>test</title>
</head>
<body>
<div>
    <table>
        <tr>
            <td>sn</td>
            <td>密码</td>
            <td>姓名</td>
            <td>部门号</td>
            <td>职位</td>
        </tr>
        <c:forEach var="employeeBizlist" items="${employeeBizlist}">
           <tr>
               <td>${employeeBizlist.sn}</td>
               <td>${employeeBizlist.password}</td>
               <td>${employeeBizlist.name}</td>
               <td>${employeeBizlist.departmentSn}</td>
               <td>${employeeBizlist.post}</td>
           </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
