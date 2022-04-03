package com.ecommerce.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE  , generator = "product_generator")
    @SequenceGenerator(name = "product_generator", sequenceName = "product_seq")
    private Integer productId;
    private String productName;
    private String productDescription;
    private String productCategory;
    private Integer productPrice;
    private String productImage;
}
