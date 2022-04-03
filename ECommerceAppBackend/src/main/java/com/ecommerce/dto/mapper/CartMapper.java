package com.ecommerce.dto.mapper;

import com.ecommerce.dto.CartDto;
import com.ecommerce.model.Cart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto cartToDTo(Cart cart);
    Cart dtoTocart(CartDto cartDto);
    List<CartDto> cartsToDtos (List<Cart> cartSet);
}
