<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 13/9/2024
  Time: 12:52 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<H1>Register Account</H1>
<form method="post" action="/register">

    <label for="email"> </label>
    <input type="email" id="email" name="email">

    <label for="name"></label>
    <input type="text" id="name" name="name">

    <label for="age"></label>
    <input type="number" id="age" name="age">

    <label for="password"></label>
    <input type="password" id="password" name="password">

    <label for="conformPassword"></label>
    <input type="password" id="conformPassword" name="conformPassword">

    <button type="submit">Create Account</button>

</form>

</body>
</html>
