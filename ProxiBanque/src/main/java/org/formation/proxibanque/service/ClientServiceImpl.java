package org.formation.proxibanque.service;

import lombok.RequiredArgsConstructor;
import org.formation.proxibanque.entity.Client;
import org.formation.proxibanque.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repo;

    @Override
    public Client createClient(Client client) {
        return repo.save(client);
    }

    @Override
    public Optional<Client> getClient(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Client> update(Client client) {
        return Optional.of(repo.save(client));
    }
}
