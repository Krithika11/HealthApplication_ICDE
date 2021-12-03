<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
	<style><%@include file="/css/index.css"%></style>
	<script type="text/javascript">
	</script>
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

	<h2>Please Login here</h2>

	<form:form id="loginForm" modelAttribute="login" action="loginProcess"
		method="post">
		<table align="center" border="0">
			<tr>
				<td colspan="2" align="center">ENTER YOUR DETAILS</td>
			</tr>
			<tr>
				<td><form:label path="username">Name: </form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">LOGIN</form:button></td>
			</tr>

			<tr></tr>
		</table>
	</form:form>
	<p> New user? Please click <a href="register">HERE</a> to register </p>
	<table align="center">
		<tr>
			<td style="font-style: oblique; color: darkred;">${message}</td>
		</tr>
	</table>
</div>
</div>
</body>
</html>