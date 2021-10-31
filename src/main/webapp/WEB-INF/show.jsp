<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Employee Details</title>
</head>
<body>

<h1>Employees List</h1> 
<table border="2" width="70%" cellpadding="2"> 
<tr><th>Id</th><th>Name</th><th>Job</th><th>Salary</th></tr> 
<c:forEach var="emp" items="${employees}"> 
<tr> 
<td>${emp.empId}</td> 
<td>${emp.empName}</td> 
<td>${emp.jobTitle}</td> 
<td> <fmt:formatNumber value="${emp.salary}" type="currency"/></td>
<td>${emp.deptNo}</td> 
</tr> 
</c:forEach> 
</table> 
<br/>
<a href="index">Add More Employee</a>
<a href="edit">Edit</a>

</body>
</html>