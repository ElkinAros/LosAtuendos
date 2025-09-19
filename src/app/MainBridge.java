package app;

import bridge.*;

public class MainBridge {
    public static void main(String[] args) {
        double basePrice = 200.0;

        // Estrategia de precio normal
        GarmentPricing normalPricing = new RentalPricing(new NormalPricing());
        System.out.println("Precio normal: $" + normalPricing.getFinalPrice(basePrice));

        // Estrategia de precio con descuento de temporada (20%)
        GarmentPricing seasonalPricing = new RentalPricing(new SeasonalPricing(0.2));
        System.out.println("Precio con descuento de temporada: $" + seasonalPricing.getFinalPrice(basePrice));
    }
}
