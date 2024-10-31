package airLineProject;


import airLineProject.Offer;
import java.util.ArrayList;
import java.util.List;

public class OfferService {
    public List<Offer> getCurrentOffers() {
        List<Offer> offers = new ArrayList<>();
        
        offers.add(new Offer("Summer Sale", "Get a great discount on summer flights.", "15%", "2024-12-31"));
        offers.add(new Offer("Festive Season Special", "Special discounts for the festive season.", "20%", "2024-11-30"));
        offers.add(new Offer("Student Discount", "Students get an extra 10% off.", "10%", "2025-01-15"));

        return offers;
    }
}
