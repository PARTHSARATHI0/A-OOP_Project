<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AlgoAirways - Login</title>
    <link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
    <div class="form-container">
        <h2>Login to AlgoAirways</h2>
        <form action="booking.jsp" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <button type="submit">Login</button>
        </form>
        <p>Don't have an account? <a href="register.jsp">Register here</a></p>
    </div>
</body>
</html>
