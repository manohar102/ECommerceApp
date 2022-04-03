package com.mano.projects.model;

import lombok.Data;

import javax.persistence.*;

@Entity @Table(name="cart") @Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_generator")
    @SequenceGenerator(name = "cart_generator", sequenceName = "cart_seq")
    private Integer cartid;
    private Integer userId;
    private Integer productId;

}
