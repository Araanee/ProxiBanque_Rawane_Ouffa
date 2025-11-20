package org.formation.proxibanque.service;

import org.formation.proxibanque.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> getClients();

    Client createClient(Client client);

    Optional<Client> getClient(Long id);

    Optional<Client> update(Client client);
}
