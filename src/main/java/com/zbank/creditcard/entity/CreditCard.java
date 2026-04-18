package com.zbank.creditcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CreditCard {

    @Id
    @GeneratedValue
    private Long id;
    private String cardNumber;
    private Double credit_limit;
    private String cardType;
    private Integer pin;
}
