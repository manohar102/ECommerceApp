package com.ecommerce.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductOrderDto {
    private int orderId;
    private int quantity;
    private Date orderDate;
    private int productId;
}

