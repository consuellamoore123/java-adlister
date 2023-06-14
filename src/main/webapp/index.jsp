<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>

<h1>Login</h1>

<%--<form method="post" action="/login.jsp">--%>
<%--    <label for="username">Username:</label>--%>
<%--    <input type="text" id="username" name="username" required>--%>

<%--    <label for="password">Password:</label>--%>
<%--    <input type="password" id="password" name="password" required>--%>

<%--    <button type="submit">Login</button>--%>
<%--</form>--%>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
