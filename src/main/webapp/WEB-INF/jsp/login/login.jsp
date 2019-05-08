<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form name="LoginForm" action= "<c:url value='j_spring_security_check' />" method="POST">
	<table>
		<tr>
			<td colspan="2">Login</td>
		</tr>
		<tr>
		<td colspan="2" style="color: red"><c:if test="${not empty error }">${error }</c:if></td>
			<td>UserName: </td>
			<td><input type="text" name="username"/> </td>
			</tr>
				<td>Password</td>
				<td><input type="password" name="password"/> </td>
			</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Login" />
			</tr>
			
	
	</table>

</form>
</body>
</html>