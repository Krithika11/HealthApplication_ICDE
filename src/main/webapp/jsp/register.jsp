<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<head>
		<title>Register page</title>
		<style type="text/css">
			.error {
				color: darkred;
			}
		</style>
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

	<h2>Welcome to Health App. Please register below.</h2>

	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">

		<table align="center" border="0">
			<tr>
				<td colspan="2" align="center">ENTER YOUR DETAILS</td>
			</tr>
			<tr>
				<td><form:label path="username">Name</form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			<td><form:errors path="username" cssClass="error"/></td>
<%--				<td th:if="${registerProcessfields.hasErrors('username')}" th:errors="*{username}">Name Error</td>--%>

			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password" id="password" /></td>
				<td><form:errors path="password" cssClass="error"/></td>

			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td>
					<form:radiobutton path="gender" value="Female"/>Female
					<form:radiobutton path="gender" value="Male"/>Male
					<form:radiobutton path="gender" value="Others"/>Others
				</td>
				<td><form:errors path="gender" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" name="age" id="age" /></td>
				<td><form:errors path="age" cssClass="error"/></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><form:button id="register" name="register">REGISTER</form:button></td>
			</tr>
		</table>
	</form:form>
			<p> Please click <a href="login">HERE</a> to Login </p>
	<table align = "center">
	<tr>
		<td style="font-style: oblique; color: darkred;">${message}</td>
	</tr>
</table>
</div>
</body>
</html>