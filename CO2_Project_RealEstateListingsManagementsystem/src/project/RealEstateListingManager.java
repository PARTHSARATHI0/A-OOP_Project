package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class RealEstateListingManager implements Iterable<RealEstateListing> {
    private List<RealEstateListing> listings;

    public RealEstateListingManager() {
        listings = new ArrayList<>();
    }

    public void addListing(RealEstateListing listing) {
        listings.add(listing);
    }

    public void sortByPrice() {
        Collections.sort(listings);
    }

    public void sortByArea() {
        listings.sort(Comparator.comparingDouble(RealEstateListing::getArea));
    }

    public void sortByLocation() {
        listings.sort(Comparator.comparing(RealEstateListing::getLocation));
    }

    public RealEstateListing cloneListing(RealEstateListing listing) throws CloneNotSupportedException {
        return listing.clone();
    }

    @Override
    public Iterator<RealEstateListing> iterator() {
        return listings.iterator();
    }

    public void displayListings() {
        for (RealEstateListing listing : listings) {
            System.out.println(listing);
        }
    }
}
