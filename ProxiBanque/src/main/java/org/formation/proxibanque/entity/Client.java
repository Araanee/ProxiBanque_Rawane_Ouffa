package org.formation.proxibanque.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String postal_code;
    private String city;
    private String phoneNumber;
    // persist the accounts directly when creating a client
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "current_account_id")
    private Account currentAccount;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "savings_account_id")
    private Account savingsAccount;

}
