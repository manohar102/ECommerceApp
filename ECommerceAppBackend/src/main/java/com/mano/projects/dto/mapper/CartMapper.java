package com.mano.projects.dto.mapper;

import com.mano.projects.dto.CartDto;
import com.mano.projects.model.Cart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto cartToDTo(Cart cart);
    Cart dtoTocart(CartDto cartDto);
    List<CartDto> cartsToDtos (List<Cart> cartSet);
}
