package repository;

import model.Garment;
import java.util.*;

public class GarmentRepository {
    private List<Garment> garments = new ArrayList<>();

    public void add(Garment g) { garments.add(g); }
    public Garment findByReference(String ref) {
        return garments.stream().filter(g -> g.getReference().equals(ref)).findFirst().orElse(null);
    }
    public List<Garment> getAll() { return garments; }
}
