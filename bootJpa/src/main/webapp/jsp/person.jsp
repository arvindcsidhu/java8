<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addPerson">
<label>id:</label><input type="number" name="id"/><br/>
<label>Person Name:</label><input type="text" name="personName"/>
<input type="submit">
</form>

<form action="getPerson">
<label>id:</label><input type="number" name="id"/><br/>
<input type="submit">
</form>

</body>
</html>