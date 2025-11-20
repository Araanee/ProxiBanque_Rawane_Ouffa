package org.formation.proxibanque.service;

import lombok.RequiredArgsConstructor;
import org.formation.proxibanque.entity.Account;
import org.formation.proxibanque.entity.Client;
import org.formation.proxibanque.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repo;

    @Override
    public List<Account> getAccounts() {
        return repo.findAll();
    }

    @Override
    public Account createAccount(Account account) {
        return repo.save(account);
    }

    @Override
    public Optional<Account> getAccount(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Account> update(Account account) {
        return Optional.of(repo.save(account));
    }

    @Override
    public void deleteAccount(Long id) {
        repo.deleteById(id);
    }
}
