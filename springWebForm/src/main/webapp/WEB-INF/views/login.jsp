<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="container">
		<h2>Login Form</h2>
		<form action="login-success" method="post">
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" /><br /> <label for="password">Password:</label>
			<input type="password" id="password" name="password" /><br /> <input
				type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>