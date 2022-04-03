package com.ecommerce.controller;

import com.ecommerce.dto.CartDto;
import com.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("cart")
@RestController @RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CartController {

    private final CartService cartService;

    @PostMapping(path = "/", consumes = {"application/json"}, produces = {"application/json"})
    private ResponseEntity<CartDto> addtoCart(@RequestBody CartDto cartDto) {
        CartDto cartDtores = null;
        try {
            cartDtores = cartService.addToCart(cartDto);
        } catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(cartDtores, HttpStatus.OK);
    }

    @GetMapping(path = "/", produces = {"application/json"})
    private ResponseEntity<List<CartDto>> getCart() {
        List<CartDto> cartDtoSet = null;
        try {
            cartDtoSet = cartService.getCart();
        } catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(cartDtoSet, HttpStatus.OK);
    }

    @DeleteMapping(path="/",consumes = {"application/json"})
    private ResponseEntity<String> removeItem(@RequestBody CartDto cartDto){
        try {
            cartService.removeItem(cartDto);
        } catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Removed Successfully", HttpStatus.OK);
    }
}