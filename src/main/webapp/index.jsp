<%--
  Created by IntelliJ IDEA.
  User: dinht
  Date: 5/21/2024
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="CalculatorServlet" method="post">
  <label for="numberOne" > Number 1:</label>
  <input type="number" id="numberOne" name="numberOne" required><br>
    <label for="numberTwo" > Number 2:</label>
    <input type="number" id="numberTwo" name="numberTwo" required><br>
    <label for="operator">Operator:</label>
    <select id="operator" name="operator">
        <option value="+">Add</option>
        <option value="-">Subtract</option>
        <option value="*">Multiply</option>
        <option value="/">Divide</option>
    </select><br>
    <input type="submit" value="Calculate">
</form>

</body>
</html>
