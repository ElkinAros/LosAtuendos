package bridge;

public class NormalPricing implements PricingImplementor {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice; // sin cambios
    }
}
