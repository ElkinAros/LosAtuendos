package bridge;

public class SeasonalPricing implements PricingImplementor {
    private double discountRate;

    public SeasonalPricing(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * (1 - discountRate); // aplica descuento
    }
}
