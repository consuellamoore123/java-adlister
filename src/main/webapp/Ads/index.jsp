<%--
  Created by IntelliJ IDEA.
  User: consuellamoore
  Date: 6/16/23
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<%--   <% @ include file="partials/head.jsp";%>--%>

    <title>All Ads</title>
</head>
<body>
<%--<% @ include file="partials/head.jsp";%>--%>
<h1>All Ads</h1>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>UserId</th>
        <th>Title</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach var="ads" items="${ad}">
        <tr>
            <td>${ad.id}</td>
            <td>${ad.userId}</td>
            <td>${ad.title}</td>
            <td>${ad.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>









