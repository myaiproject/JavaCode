<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 13/9/2024
  Time: 2:20 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<H1>Register Account</H1>

<p>${error}</p>

<form method="post" action="/register">

    <label for="email">Email </label>
    <input type="email" id="email" name="email"><br>

    <label for="name">Name</label>
    <input type="text" id="name" name="name"><br>

    <label for="age">Age</label>
    <input type="number" id="age" name="age"><br>

    <label for="password">Password</label>
    <input type="password" id="password" name="password"><br>

    <label for="conformPassword">Conform Password</label>
    <input type="password" id="conformPassword" name="conformPassword"><br>

    <button type="submit">Create Account</button>

</form>

</body>
</html>
