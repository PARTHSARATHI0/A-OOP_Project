<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>AlgoAirways - Book a Flight</title>
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
        <h2>Book Your Flight</h2>
        <form action="payment.jsp" method="post">
            <label for="from">From:</label>
            <select name="from" id="from" required>
                <option value="Hyderabad">Hyderabad</option>
                <option value="Bangalore">Bangalore</option>
                <option value="Mumbai">Mumbai</option>
                <option value="Delhi">Delhi</option>
                <!-- Add more cities as needed -->
            </select><br><br>

            <label for="to">To:</label>
            <select name="to" id="to" required>
                <option value="Hyderabad">Hyderabad</option>
                <option value="Bangalore">Bangalore</option>
                <option value="Mumbai">Mumbai</option>
                <option value="Delhi">Delhi</option>
                <!-- Add more cities as needed -->
            </select><br><br>

            <label for="date">Date:</label>
            <input type="date" name="date" required><br><br>

            <label for="time">Departure Time:</label>
            <input type="time" name="time" required><br><br>

            <!-- Display available flights as clickable links -->
            <div id="flightDetails">
                <h3>Available Flights:</h3>
                <a href="#" onclick="selectFlight('AI101', '09:00 AM')" class="flight-option">Flight Number: AI101 - Departure: 09:00 AM - Arrival: 12:00 PM</a><br>
                <a href="#" onclick="selectFlight('AI202', '01:00 PM')" class="flight-option">Flight Number: AI202 - Departure: 01:00 PM - Arrival: 04:00 PM</a><br>
            </div><br>

            <input type="hidden" name="flightNumber" id="flightNumber">
            <input type="hidden" name="flightTime" id="flightTime">
            <input type="submit" value="Proceed to Payment" class="blue-button">
        </form>
    </div>

    <script>
        function selectFlight(flightNumber, flightTime) {
            document.getElementById("flightNumber").value = flightNumber;
            document.getElementById("flightTime").value = flightTime;
            alert("Flight " + flightNumber + " selected!");
        }
    </script>
</body>
</html>
