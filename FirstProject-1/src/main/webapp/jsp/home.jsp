<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome ${obj.name} , ${obj.empNo} , ${obj.company};
</body>
</html>


request obj : http://localhost:8080/home?name=sidhu&empNo=10&company=brillio