package airLineProject;

public class Booking {
    private String from;
    private String to;
    private String departureDate;
    private String time;
    private String paymentMethod;

    public Booking(String from, String to, String departureDate, String time, String paymentMethod) {
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.time = time;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
