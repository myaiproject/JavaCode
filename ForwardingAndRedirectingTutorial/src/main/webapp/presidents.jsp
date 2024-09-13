<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 7/9/2024
  Time: 11:12 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Presidents</title>

    <style>
        .group{
            border: solid blue 2px;
            padding: 10px;
            float: left;
            margin: 10px;
        }
        .group img {
            width: 150px; /* Set a fixed width */
            height: 150px; /* Set a fixed height */
            object-fit: cover; /* Ensure image maintains aspect ratio and fits the box */
        }
    </style>
</head>
<body>
<h1>Here are some of the swaggiest US presidents:</h1>

<div class="group" style="">
    <img src="images/rigan.png">
    <h3>Ronald Reagan</h3>
</div>

<div class="group" style=" ">
    <img src="images/Richard.webp">
    <h3>Richard Nixon</h3>
</div>

<div class="group" style=" ">
    <img src="images/lingkon.png">
    <h3>Abraham Lincoln</h3>
</div>

<div class="group">
    <img src="images/trump.png" style=" ">
    <h3>Donald Trump</h3>
</div>
<div class="group">
    <img src="images/roosevelt.png" style=" ">
    <h3>Theodore Roosevelt</h3>
</div>

</body>
</html>
