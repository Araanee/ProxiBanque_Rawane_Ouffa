package org.formation.proxibanque.service;

import org.formation.proxibanque.entity.Account;
import org.formation.proxibanque.entity.Client;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAccounts();

    Account createAccount(Account account);

    Optional<Account> getAccount(Long id);

    Optional<Account> update(Account account);

    void deleteAccount(Long id);
}
