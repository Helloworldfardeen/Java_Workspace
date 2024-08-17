<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loginform</title>
<style>
body {
	background-color: red;
	font-family: Arial, sans-serif;
}

.container {
	width: 50%;
	margin: 0 auto;
	padding: 50px 0;
	text-align: center;
}

h1 {
	color: white;
}

table {
	margin: 0 auto;
}

input[type="text"], input[type="password"], input[type="submit"] {
	padding: 10px;
	margin: 5px;
	border-radius: 5px;
	border: 1px solid #ccc;
	font-size: 16px;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to Login Page</h1>
		<form action="dologin" method="post">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Login" name="button"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
