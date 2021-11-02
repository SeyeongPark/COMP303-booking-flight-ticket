<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
  <form action="confirmation" method="post">
		Card Holder Name : <input type="text" name="cardName"/></br>
		Card Number : <input type="number" name="cardNum"/></br>
		Card Expiry Date : <input type="number" name="cardExpiryMM" placeholder="MM"/>/<input type="number" name="cardExpiryYY" placeholder="YY"/></br>
		Card CVV : <input type="number" name="cardCvv"/></br>
      <input type="submit" name="Pay Now"/>
   </form>
</body>
</html>