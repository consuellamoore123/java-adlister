<%--
  Created by IntelliJ IDEA.
  User: consuellamoore
  Date: 6/13/23
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>

  </body>
</html>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null && username.equals("admin") && password.equals("password")) {
        response.sendRedirect("profile.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>

