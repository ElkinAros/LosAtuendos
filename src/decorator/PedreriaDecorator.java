package decorator;

import composite.GarmentComponent;

public class PedreriaDecorator extends GarmentDecorator {
    public PedreriaDecorator(GarmentComponent decoratedGarment) {
        super(decoratedGarment);
    }

    @Override
    public String getDescription() {
        return decoratedGarment.getDescription() + " + Pedrería";
    }

    @Override
    public double getPrice() {
        return decoratedGarment.getPrice() + 50.0; // costo adicional por pedrería
    }
}
