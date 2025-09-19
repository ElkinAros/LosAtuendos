package adapter;

import model.Garment;

// Adapter que permite usar ExternalLaundryService con objetos Garment
public class LaundryAdapter {
    private ExternalLaundryService externalService;

    public LaundryAdapter(ExternalLaundryService externalService) {
        this.externalService = externalService;
    }

    public void sendGarment(Garment garment) {
        String info = garment.getReference() + " - " + garment.getDescription();
        externalService.sendToLaundry(info);
    }
}
