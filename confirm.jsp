<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>AlgoAirways - Payment Confirmation</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="main-section">
        <h2>Payment Successful</h2>
        <p>Thank you for your payment! Your booking is confirmed.</p>
        
        <h3>Flight Details:</h3>
        <p>From: <%= request.getParameter("from") %></p>
        <p>To: <%= request.getParameter("to") %></p>
        <p>Date: <%= request.getParameter("date") %></p>
        <p>Departure Time: <%= request.getParameter("time") %></p>
        <p>Flight Number: <%= request.getParameter("flightNumber") %></p>

        <p>Confirmation Date: <%= new java.util.Date() %></p>
    </div>
</body>
</html>
