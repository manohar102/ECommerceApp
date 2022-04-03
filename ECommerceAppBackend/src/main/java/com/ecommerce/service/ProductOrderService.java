package com.ecommerce.service;

import com.ecommerce.dto.ProductOrderDto;

import java.util.Set;

public interface ProductOrderService {

    ProductOrderDto orderProduct(int userId, ProductOrderDto productOrderDto) throws Exception;
    void cancelOrder(int userid, int orderId) throws Exception;
    ProductOrderDto updateOrder (int userid, ProductOrderDto productOrderDto) throws Exception;
    Set<ProductOrderDto> getOrders(int userId) throws Exception;
}
