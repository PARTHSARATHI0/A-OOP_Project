package project;

public class Main {
    public static void main(String[] args) {
        RealEstateListingManager manager = new RealEstateListingManager();

        manager.addListing(new RealEstateListing("Green Acres", "New York", 120000, 1500));
        manager.addListing(new RealEstateListing("Ocean View", "Los Angeles", 350000, 2200));
        manager.addListing(new RealEstateListing("Mountain Retreat", "Denver", 250000, 1800));

        System.out.println("Listings sorted by price:");
        manager.sortByPrice();
        manager.displayListings();

        System.out.println("\nListings sorted by area:");
        manager.sortByArea();
        manager.displayListings();

        System.out.println("\nListings sorted by location:");
        manager.sortByLocation();
        manager.displayListings();

        try {
            RealEstateListing clonedListing = manager.cloneListing(manager.iterator().next());
            System.out.println("\nCloned listing: " + clonedListing);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
