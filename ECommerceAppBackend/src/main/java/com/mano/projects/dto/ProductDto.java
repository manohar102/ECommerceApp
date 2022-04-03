package com.mano.projects.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Integer productId;
    private String productName;
    private String productDescription;
    private String productCategory;
    private Integer productPrice;
    private String productImage;
}
