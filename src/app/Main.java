package app;

import facade.RentalFacade;
import model.*;
import factory.GarmentFactory;
import repository.*;

public class Main {
    public static void main(String[] args) {
        RentalFacade facade = new RentalFacade();

        // Crear clientes y empleados
        facade.registerClient(new Client("101", "Juan Perez"));
        facade.registerEmployee(new Employee("E01", "Maria Lopez"));

        // Crear prendas con Factory
        Garment d1 = GarmentFactory.createDress("D001", "Rojo", "BrandX", "M", 120.0, true, "Largo");
        Garment s1 = GarmentFactory.createSuit("S001", "Negro", "BrandY", "L", 200.0, "Frac", "Corbata");
        Garment c1 = GarmentFactory.createCostume("C001", "Azul", "BrandZ", "S", 80.0, "Superman");

        facade.registerGarment(d1);
        facade.registerGarment(s1);
        facade.registerGarment(c1);

        // Mostrar prendas registradas
        for (Garment g : facade.listGarments()) {
            System.out.println(g.getDescription());
        }
    }
}
