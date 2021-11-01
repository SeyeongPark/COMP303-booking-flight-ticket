<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Reservation List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>flightCode</th><th>airlneName</th><th>fare</th><th>departureDate</th><th>departureCity</th><th>arrivalDate</th><th>destination</th><th>numAdult</th><th>numChild</th></tr>  
   <c:forEach var="rev" items="${reservations}">   
   <tr>  
   <td>${rev.flightCode}</td>  
   <td>${rev.airlineName}</td>  
   <td>${rev.fare}</td>  
   <td>${rev.departureDate}</td>  
   <td>${rev.departureCity}</td>  
   <td>${rev.arrivalDate}</td>  
   <td>${rev.destination}</td>  
   <td>${rev.numAdult}</td>  
   <td>${rev.numChild}</td>        
   </tr>  
   </c:forEach>  
   </table>  
   <br/>
   
</body>
</html>