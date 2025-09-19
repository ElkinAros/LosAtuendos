package app;

import adapter.*;
import factory.GarmentFactory;
import model.Garment;

public class MainAdapter {
    public static void main(String[] args) {
        // Crear prenda
        Garment dress = GarmentFactory.createDress("D003", "Azul", "BrandC", "M", 150.0, true, "Corto");

        // Usar servicio externo de lavandería a través de un Adapter
        ExternalLaundryService externalService = new ExternalLaundryService();
        LaundryAdapter adapter = new LaundryAdapter(externalService);

        adapter.sendGarment(dress);
    }
}
