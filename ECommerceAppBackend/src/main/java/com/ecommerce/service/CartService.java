package com.ecommerce.service;


import com.ecommerce.dto.CartDto;

import java.util.List;

public interface CartService {
    List<CartDto> getCart() throws Exception;
    CartDto addToCart(CartDto cartDto) throws Exception;
    void removeItem(CartDto cartDto) throws Exception;
}
