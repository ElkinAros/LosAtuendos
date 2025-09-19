package bridge;

public abstract class GarmentPricing {
    protected PricingImplementor implementor;

    public GarmentPricing(PricingImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract double getFinalPrice(double basePrice);
}
