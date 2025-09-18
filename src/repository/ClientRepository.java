package repository;

import java.util.*;

public class ClientRepository {
    private List<Client> clients = new ArrayList<>();

    public void add(Client c) { clients.add(c); }
    public Client findById(String id) {
        return clients.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }
}
