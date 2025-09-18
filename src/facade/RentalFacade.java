package facade;

import model.*;
import repository.*;

import java.util.*;

public class RentalFacade {
    private ClientRepository clients = new ClientRepository();
    private EmployeeRepository employees = new EmployeeRepository();
    private GarmentRepository garments = new GarmentRepository();

    public void registerClient(Client c) { clients.add(c); }
    public void registerEmployee(Employee e) { employees.add(e); }
    public void registerGarment(Garment g) { garments.add(g); }

    public Garment findGarment(String ref) { return garments.findByReference(ref); }
    public List<Garment> listGarments() { return garments.getAll(); }
}
