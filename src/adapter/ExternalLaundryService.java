package adapter;

// Simula un servicio externo de lavandería con una interfaz distinta
public class ExternalLaundryService {
    public void sendToLaundry(String garmentInfo) {
        System.out.println("Enviando a lavandería externa: " + garmentInfo);
    }
}
