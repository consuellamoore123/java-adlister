<%--
  Created by IntelliJ IDEA.
  User: consuellamoore
  Date: 6/13/23
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Title</title>

  </head>
  <body>

  <%@ include file="/partials/navbar.jsp" %>

  <h1>Login</h1>

  <form method="post" action="/login.jsp">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" required>

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>

      <button type="submit">Login</button>
  </form>


  <c:if test="${param.username.equals('admin') && param.password.equals('password')}">
      <meta http-equiv="Refresh" content="0; url='/profile.jsp'" />
  </c:if>
  </body>
</html>

<%--<%--%>
<%--    String username = request.getParameter("username");--%>
<%--    String password = request.getParameter("password");--%>

<%--    if (username != null && password != null && username.equals("admin") && password.equals("password")) {--%>
<%--        response.sendRedirect("profile.jsp");--%>
<%--    } else {--%>
<%--        response.sendRedirect("login.jsp");--%>
<%--    }--%>
<%--%>--%>


