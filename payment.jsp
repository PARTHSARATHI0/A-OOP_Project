<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>AlgoAirways - Payment</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
        .blue-button {
            background-color: #007BFF;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="main-section">
        <h2>Payment Information</h2>
        <form action="confirm.jsp" method="post">
            <label for="bank">Select Bank:</label>
            <select name="bank" id="bank" required>
                <option value="ICICI">ICICI</option>
                <option value="HDFC">HDFC</option>
                <option value="SBI">SBI</option>
                <option value="Axis">Axis</option>
                <!-- Additional banks can be added here -->
            </select><br><br>

            <label for="userId">User ID:</label>
            <input type="text" name="userId" required><br><br>

            <label for="password">Password:</label>
            <input type="password" name="password" required><br><br>

            <!-- OTP Button and Prompt -->
            <button type="button" onclick="sendOTP()" class="blue-button">Send OTP</button><br><br>

            <label for="otp">OTP:</label>
            <input type="text" name="otp" required><br><br>

            <input type="submit" value="Confirm Payment" class="blue-button">
        </form>

        <!-- Display current date as confirmation date -->
        <div id="confirmationDate">
            <p>Confirmation Date: <%= new java.util.Date() %></p>
        </div>
    </div>

    <script>
        function sendOTP() {
            alert("OTP sent!");
        }
    </script>
</body>
</html>
