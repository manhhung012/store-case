package com.example.storecase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "checkout")
@Entity
public class CheckoutEntity {
    @EmbeddedId
    private CheckoutId id;

    @Column
    private Long price;

    @Column
    private Integer amount;
}
