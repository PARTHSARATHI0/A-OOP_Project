package project;

import java.util.Objects;

public class RealEstateListing implements Comparable<RealEstateListing>, Cloneable {
    private String propertyName;
    private String location;
    private double price;
    private double area;

    public RealEstateListing(String propertyName, String location, double price, double area) {
        this.propertyName = propertyName;
        this.location = location;
        this.price = price;
        this.area = area;
    }

    public String getPropertyName() { return propertyName; }
    public void setPropertyName(String propertyName) { this.propertyName = propertyName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

    @Override
    public int compareTo(RealEstateListing other) {
        return Double.compare(this.price, other.price);
    }

    // Cloneable: Deep cloning
    @Override
    public RealEstateListing clone() throws CloneNotSupportedException {
        return (RealEstateListing) super.clone();
    }

    @Override
    public String toString() {
        return propertyName + " located in " + location + " with price $" + price + " and area " + area + " sqft.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealEstateListing)) return false;
        RealEstateListing that = (RealEstateListing) o;
        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.area, area) == 0 &&
                Objects.equals(propertyName, that.propertyName) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName, location, price, area);
    }
}
