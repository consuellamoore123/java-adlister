<%--
  Created by IntelliJ IDEA.
  User: consuellamoore
  Date: 6/14/23
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<form action="colorServlet" method="POST">
    <label for="color">Enter your favorite color:</label>
    <input type="text" id="color" name="color">
    <button type="submit">Submit</button>
</form>
</body>
</html>

