package composite;

import model.Garment;

public class GarmentLeaf implements GarmentComponent {
    private Garment garment;

    public GarmentLeaf(Garment garment) {
        this.garment = garment;
    }

    @Override
    public String getDescription() {
        return garment.getDescription();
    }

    @Override
    public double getPrice() {
        return garment.getRentalPrice();
    }
}
