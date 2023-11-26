package com.example.Account_Service.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;


    @NotNull(message="CustomerId is not null")
    private int customerId;
    @NotNull(message = "Account Balance can not be done")
    private double accountBalance;
    private boolean isActive;
}
