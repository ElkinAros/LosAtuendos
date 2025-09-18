package decorator;

import composite.GarmentComponent;

public abstract class GarmentDecorator implements GarmentComponent {
    protected GarmentComponent decoratedGarment;

    public GarmentDecorator(GarmentComponent decoratedGarment) {
        this.decoratedGarment = decoratedGarment;
    }

    @Override
    public String getDescription() {
        return decoratedGarment.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedGarment.getPrice();
    }
}
