package model;

public class Costume extends Garment {
    private String name;

    public Costume(String reference, String color, String brand, String size, double rentalPrice, String name) {
        super(reference, color, brand, size, rentalPrice);
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Costume [" + reference + ", " + name + "]";
    }
}
