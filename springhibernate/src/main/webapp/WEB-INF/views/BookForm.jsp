<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Book</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <div class="container">
        <h2>Add Book</h2>
        <form action="book" method="post">
            <label for="title">Title:</label>
            <input type="text" id="title" name="title"/><br/>
            <label for="author">Author:</label>
            <input type="text" id="author" name="author"/><br/>
            <input type="submit" value="Submit"/>
        </form>
    </div>
</body>
</html>