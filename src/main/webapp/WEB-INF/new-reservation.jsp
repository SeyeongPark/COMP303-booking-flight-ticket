<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
    xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8" />
<title>Create New Flight information</title>
</head>
<body>
    <div align="center">
        <h1>Create New Flight information</h1>
        <br />
       <form action="save" method="POST">
      flightCode : <input type="number" name="flightcode"/> </br>
      airlneName : <input type="text" name="airlinename"/></br>
      fare : <input type="text" name="fare"/></br>
      departureDate :  <input type="date" name="departuredate"/></br>
      departureCity :  <input type="text" name="departurecity"/></br>
      arrivalDate :  <input type="date" name="arrivaldate"/></br>
      destination :  <input type="text" name="destination"/></br>
      num adult :  <input type="number" name="numadult"/></br>
      num child :  <input type="number" name="numchild"/></br>
     
      <input type="submit" name="Add Flight"/>
   </form>
    </div>
</body>
</html>