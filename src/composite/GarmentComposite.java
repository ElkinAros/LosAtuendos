package composite;

import java.util.ArrayList;
import java.util.List;

public class GarmentComposite implements GarmentComponent {
    private List<GarmentComponent> components = new ArrayList<>();

    public void add(GarmentComponent component) {
        components.add(component);
    }

    public void remove(GarmentComponent component) {
        components.remove(component);
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder("Composite [");
        for (GarmentComponent gc : components) {
            sb.append(gc.getDescription()).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public double getPrice() {
        return components.stream().mapToDouble(GarmentComponent::getPrice).sum();
    }
}
