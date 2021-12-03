<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Completed</title>
    <style><%@include file="/css/index.css"%></style>
</head>
<body>
<div class="left_container"></div>
<%--<div class="right_container"></div>--%>
<!-- ===== STRIPS ===== -->
<div class="strips">
    <div class="left_strip"></div>
    <div class="right_strip"></div>
</div>

<div align="center" class="login_url">
    <table border="0">
        <tr>
            <td colspan="2" align="center"><h2>Congratulations! Thank you for registering.</h2></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <h3>Here's the summary of your details:</h3>
            </td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>${user.username}</td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>${user.age}</td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>${user.gender}</td>
        </tr>
    </table>

    <p> Please click <a href="login">here</a> to Login</p>
</div>

</body>
</html>
