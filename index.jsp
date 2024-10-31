<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AlgoAirways-Current Offers & Discounts</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="main-section">
        <h1 class="main-title">Welcome to AlgoAirways</h1>
        <div class="offers-section">
        <h2>Welcome to AlgoAirways</h2>
            <h3>Current Offers & Discounts</h3>
            <div class="offers-container">
                <%
                    ArrayList<HashMap<String, String>> offers = new ArrayList<>();
                    HashMap<String, String> offer1 = new HashMap<>();
                    offer1.put("title", "Summer Sale");
                    offer1.put("description", "Get a great discount on summer flights.");
                    offer1.put("discount", "15%");
                    offer1.put("validUntil", "2024-12-31");
                    offers.add(offer1);

                    HashMap<String, String> offer2 = new HashMap<>();
                    offer2.put("title", "Festive Season Special");
                    offer2.put("description", "Special discounts for the festive season.");
                    offer2.put("discount", "20%");
                    offer2.put("validUntil", "2024-11-30");
                    offers.add(offer2);

                    HashMap<String, String> offer3 = new HashMap<>();
                    offer3.put("title", "Student Discount");
                    offer3.put("description", "Students get extra 10% off.");
                    offer3.put("discount", "10%");
                    offer3.put("validUntil", "2025-01-15");
                    offers.add(offer3);

                    for (HashMap<String, String> offer : offers) {
                %>
                <div class="offer-card">
                    <h3><%= offer.get("title") %></h3>
                    <p><%= offer.get("description") %></p>
                    <p><strong>Discount:</strong> <%= offer.get("discount") %></p>
                    <p><strong>Valid Until:</strong> <%= offer.get("validUntil") %></p>
                    <a href="login.jsp" class="offer-link">Book Now</a>
                </div>
                <% } %>
            </div>
        </div>
    </div>
</body>
</html>
