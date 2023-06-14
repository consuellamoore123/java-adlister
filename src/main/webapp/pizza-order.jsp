<%--
  Created by IntelliJ IDEA.
  User: consuellamoore
  Date: 6/14/23
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="pizza-order" method="post">
    <label for="crust">Select Crust:</label>
    <select name="crust" id="crust">
        <option value="thin">Thin Crust</option>
        <option value="thick">Thick Crust</option>
        <option value="pan">Pan Crust</option>
    </select>
    <br><br>

    <label for="sauce">Select Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
        <option value="buffalo">Buffalo Sauce</option>
    </select>
    <br><br>

    <label for="size">Select Size:</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br><br>

    <h4>Toppings:</h4>

    <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
    <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
    <input type="checkbox" name="toppings" value="olives">Olives<br>
    <input type="checkbox" name="toppings" value="onions">Onions<br>
    <input type="checkbox" name="toppings" value="sausage">Sausage<br>
    <input type="checkbox" name="toppings" value="green-Peppers">Green Peppers<br>
    <br>

    <label for="address">Delivery Address:</label>
    <input type="text" name="address" id="address" required>
    <br><br>

    <input type="submit" value="Place Order">
</form>
</body>
</html>
