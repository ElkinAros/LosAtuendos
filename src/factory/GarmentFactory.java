package factory;

import model.*;

public class GarmentFactory {
    public static Garment createDress(String reference, String color, String brand, String size, double rentalPrice, boolean hasPedreria, String length) {
        return new Dress(reference, color, brand, size, rentalPrice, hasPedreria, length);
    }

    public static Garment createSuit(String reference, String color, String brand, String size, double rentalPrice, String suitType, String accessory) {
        return new Suit(reference, color, brand, size, rentalPrice, suitType, accessory);
    }

    public static Garment createCostume(String reference, String color, String brand, String size, double rentalPrice, String name) {
        return new Costume(reference, color, brand, size, rentalPrice, name);
    }
}
