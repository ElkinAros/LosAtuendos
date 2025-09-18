package model;

public abstract class Garment {
    protected String reference;
    protected String color;
    protected String brand;
    protected String size;
    protected double rentalPrice;

    public Garment(String reference, String color, String brand, String size, double rentalPrice) {
        this.reference = reference;
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.rentalPrice = rentalPrice;
    }

    public String getReference() { return reference; }
    public double getRentalPrice() { return rentalPrice; }
    public abstract String getDescription();
}
