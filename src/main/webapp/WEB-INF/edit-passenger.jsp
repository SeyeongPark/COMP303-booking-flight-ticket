<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Passenger</title>
</head>
<body>

<form action="update" method="POST">
Customer Id : <input type="text" name="custId"/> </br>
UserName : <input type="text" name="userName"/></br>
Password : <input type="text" name="password"/></br>
First name : <input type="text" name="firstname"/></br>
Last name : <input type="text" name="lastname"/></br>
Phone Number : <input type="text" name="phoneNumber"/></br>
Address : <input type="text" name="address"/></br>
City : <input type="text" name="city"/></br>
Postal Code : <input type="text" name="postalCode"/></br>
Country : <input type="text" name="country"/></br>


<input type="submit" name="Edit Passenger"/>
</form>

</body>
</html>