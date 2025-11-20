package org.formation.proxibanque.service;

import org.formation.proxibanque.entity.Client;

import java.util.Optional;

public interface ClientService {
    Client createClient(Client client);

    Optional<Client> getClient(Long id);

    Optional<Client> update(Client client);
}
