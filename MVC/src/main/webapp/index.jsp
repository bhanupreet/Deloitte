<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<form action="validateLogin" method="post">
		<table>
			<tr>
				<th>Username</th>
				<td><input type="text" name=uid></td>
			</tr>
			<tr>
				<th>password</th>
				<td><input type=password name=pwd></td>
			<tr>
				<td><input type=submit value=login></td>
				<td><input type=reset value=cancel></td>
		</table>
	</form>
</body>
</html>