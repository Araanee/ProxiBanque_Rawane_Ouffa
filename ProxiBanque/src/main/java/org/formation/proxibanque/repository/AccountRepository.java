package org.formation.proxibanque.repository;

import org.formation.proxibanque.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
