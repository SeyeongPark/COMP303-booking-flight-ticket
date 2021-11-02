<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
    xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8" />
<title>Update Flight information</title>
</head>
<body>
    <div align="center">
        <h1>Update Flight information</h1>
        <br />
       <form action="update-reservation" method="POST">
      flightCode : <input type="number" name="flightcode"/> </br>
      airlneName : <input type="text" name="airlinename"/></br>
      fare :
        <select name="fare" id="fare">
		  <option value="One Way">One Way</option>
		  <option value="Round Trip">Round Trip</option>	  
		</select>
		</br>
      departureDate :  <input type="date" name="departuredate"/></br>
      departureCity :  <input type="text" name="departurecity"/></br>
      arrivalDate :  <input type="date" name="arrivaldate"/></br>
      destination :  <input type="text" name="destination"/></br>
      num adult :  <input type="number" name="numadult"/></br>
      num child :  <input type="number" name="numchild"/></br>
     
      <input type="submit" name="Update Reservation"/>
   </form>
    </div>
</body>
</html>