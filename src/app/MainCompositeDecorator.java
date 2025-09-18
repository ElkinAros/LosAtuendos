package app;

import composite.*;
import decorator.*;
import model.*;
import factory.GarmentFactory;

public class MainCompositeDecorator {
    public static void main(String[] args) {
        // Crear prendas individuales con Factory
        Garment d1 = GarmentFactory.createDress("D002", "Verde", "BrandA", "S", 100.0, false, "Corto");
        Garment s1 = GarmentFactory.createSuit("S002", "Gris", "BrandB", "M", 180.0, "Convencional", "Corbatín");

        // Usar Composite para agrupar prendas en un alquiler
        GarmentComponent leaf1 = new GarmentLeaf(d1);
        GarmentComponent leaf2 = new GarmentLeaf(s1);

        GarmentComposite composite = new GarmentComposite();
        composite.add(leaf1);
        composite.add(leaf2);

        System.out.println("Alquiler grupal: " + composite.getDescription());
        System.out.println("Precio total: $" + composite.getPrice());

        // Usar Decorator para añadir pedrería al vestido
        GarmentComponent decoratedDress = new PedreriaDecorator(leaf1);
        System.out.println("Vestido decorado: " + decoratedDress.getDescription());
        System.out.println("Precio decorado: $" + decoratedDress.getPrice());
    }
}
