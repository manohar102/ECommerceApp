package com.ecommerce.service.impl;

import com.ecommerce.dto.mapper.CartMapper;
import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;
import com.ecommerce.dto.CartDto;
import com.ecommerce.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service @RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CartSeviceImpl implements CartService {

    private final CartRepository cartRepository;
    private final CartMapper cartMapper;
    @Override
    public List<CartDto> getCart() throws Exception {
        try{
            List<Cart> carts = cartRepository.findAll();
            List<CartDto> cartDtoList = cartMapper.cartsToDtos(carts);
            return cartDtoList;
        } catch (Exception e) {
            System.out.println("Exception " + e);
            throw new Exception("Failed getting cart.");
        }
    }

    @Override
    public CartDto addToCart(CartDto cartDto) throws Exception {
        try{
            Cart cart = cartMapper.dtoTocart(cartDto);
            System.out.println(cart);
            cart = cartRepository.save(cart);
            cartDto = cartMapper.cartToDTo(cart);
            return cartDto;
        } catch (Exception e) {
            System.out.println("Exception " + e);
            throw new Exception("Failed adding item to cart.");
        }
    }

    @Override
    public void removeItem(CartDto cartDto) throws Exception {
        try{
            cartRepository.removeCartByUserIdAndProductId(cartDto.getUserId(),cartDto.getProductId());
        } catch (Exception e) {
            System.out.println("Exception " + e);
            throw new Exception("Failed adding item to cart.");
        }
    }
}
