<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AlgoAirways - Register</title>
    <link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
    <div class="form-container">
        <h2>Register with AlgoAirways</h2>
        <form action="booking.jsp" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
