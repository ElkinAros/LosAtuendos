package model;

public class Suit extends Garment {
    private String suitType;
    private String accessory;

    public Suit(String reference, String color, String brand, String size, double rentalPrice, String suitType, String accessory) {
        super(reference, color, brand, size, rentalPrice);
        this.suitType = suitType;
        this.accessory = accessory;
    }

    @Override
    public String getDescription() {
        return "Suit [" + reference + ", " + suitType + ", " + accessory + "]";
    }
}
