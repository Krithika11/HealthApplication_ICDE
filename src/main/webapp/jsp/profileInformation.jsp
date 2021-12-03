<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Search Symptom</title>
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
<form:form id="searchForm" modelAttribute="login" action="search" method="post" >
    <table border="0">
        <tr>
            <td colspan="2" align="center"><h2>Welcome to the home page, ${login.username}</h2></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <h4>Your profile details are below:</h4>
            </td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>${login.age}</td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>${login.gender}</td>
        </tr>

        <tr>
            <td>Please enter your symptom:</td>
            <td><form:input path="symptom" name="symptom" id="symptom" /></td>
<%--            <td><form:select path="symptom" name="symptom" id="symptom" items="${symptomList}" /></td>--%>
        </tr>

        <tr>
<%--            <td colspan="2" align="center"><input type="submit" value="Search" /></td>--%>
            <td align="center"><form:button id="searchForm" name="search">SEARCH</form:button></td>

        </tr>

    </table>
</form:form>
    <table align = "center">
        <tr>
            <td style="font-style: oblique; color: darkred;">${message}</td>
        </tr>
    </table>
</div>

<p><a class="login_button" href="login">Logout</a></p>


</body>
</html>
