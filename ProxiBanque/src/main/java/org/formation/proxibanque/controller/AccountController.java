package org.formation.proxibanque.controller;

import lombok.RequiredArgsConstructor;
import org.formation.proxibanque.entity.Account;
import org.formation.proxibanque.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService service;

    @GetMapping("accounts")
    List<Account> getAccounts() {
        return service.getAccounts();
    }

    @PostMapping("accounts")
    Account createAccount(@RequestBody Account Account) {
        return service.createAccount(Account);
    }

    @GetMapping("accounts/{id}")
    ResponseEntity<Account> getAccount(@PathVariable Long id) {
        return service.getAccount(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("accounts/update")
    ResponseEntity<Account> updateAccount(@RequestBody Account Account) {
        return service.update(Account).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("account/delete/{id}")
    void deleteAccount(@PathVariable Long id) {
        service.deleteAccount(id);
    }
}
