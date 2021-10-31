<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Passenger Details</title>
</head>
<body>

<h1>Passengers List</h1> 
<table border="2" width="70%" cellpadding="2"> 
<tr><th>userName</th><th>password</th></tr> 
<c:forEach var="psg" items="${passengers}"> 
<tr> 
<td>${psg.userName}</td> 
<td>${psg.password}</td> 
</tr> 
</c:forEach> 
</table> 
<br/>
<a href="index">Add More Passenger</a>
<a href="edit">Edit</a>

</body>
</html>