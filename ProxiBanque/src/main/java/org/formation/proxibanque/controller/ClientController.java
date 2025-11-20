package org.formation.proxibanque.controller;

import lombok.RequiredArgsConstructor;
import org.formation.proxibanque.entity.Client;
import org.formation.proxibanque.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService service;

    @PostMapping("clients")
    Client createClient(@RequestBody Client client) {
        return service.createClient(client);
    }

    @GetMapping("clients/{id}")
    ResponseEntity<Client> getClient(@PathVariable Long id) {
        return service.getClient(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("clients/update")
    ResponseEntity<Client> updateClient(@RequestBody Client client) {
        return service.update(client).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
