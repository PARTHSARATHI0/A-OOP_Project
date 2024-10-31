package airLineProject;


public class Offer {
    private String title;
    private String description;
    private String discount;
    private String validUntil;

    public Offer(String title, String description, String discount, String validUntil) {
        this.title = title;
        this.description = description;
        this.discount = discount;
        this.validUntil = validUntil;
    }

  

	



	// Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}

