package bridge;

public class RentalPricing extends GarmentPricing {
    public RentalPricing(PricingImplementor implementor) {
        super(implementor);
    }

    @Override
    public double getFinalPrice(double basePrice) {
        return implementor.calculatePrice(basePrice);
    }
}
