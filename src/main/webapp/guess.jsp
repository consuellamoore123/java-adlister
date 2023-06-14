<%--
  Created by IntelliJ IDEA.
  User: consuellamoore
  Date: 6/14/23
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a Number</title>
</head>
<body>
<h1>Guess a Number between 1 and 3</h1>
<form  action="/guess" method="POST">
    <input type="number" name="guess" min="1" max="3" required>
    <button type="submit">Submit</button>
</form>
</body>
</html>

