package model;

public class Dress extends Garment {
    private boolean hasPedreria;
    private String length;

    public Dress(String reference, String color, String brand, String size, double rentalPrice, boolean hasPedreria, String length) {
        super(reference, color, brand, size, rentalPrice);
        this.hasPedreria = hasPedreria;
        this.length = length;
    }

    @Override
    public String getDescription() {
        return "Dress [" + reference + ", " + color + ", " + brand + ", " + size + ", $" + rentalPrice + "]";
    }
}
