package com.mano.projects.service;

import com.mano.projects.dto.ProductOrderDto;
import com.mano.projects.model.Product;
import com.mano.projects.model.ProductOrder;

import java.util.List;
import java.util.Set;

public interface ProductOrderService {

    ProductOrderDto orderProduct(int userId, ProductOrderDto productOrderDto) throws Exception;
    void cancelOrder(int userid, int orderId) throws Exception;
    ProductOrderDto updateOrder (int userid, ProductOrderDto productOrderDto) throws Exception;
    Set<ProductOrderDto> getOrders(int userId) throws Exception;
}
