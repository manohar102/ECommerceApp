package com.ecommerce.controller;

import com.ecommerce.dto.ProductOrderDto;
import com.ecommerce.service.ProductOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RequestMapping("order")
@RestController @RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductOrderController {

    private final ProductOrderService productOrderService;

    @PostMapping(path = "{userId}", consumes = {"application/json"}, produces= {"application/json"})
    private ResponseEntity<ProductOrderDto> orderProduct(@PathVariable(value="userId") Integer userId, @RequestBody ProductOrderDto productOrderDto){
        try{
           productOrderDto =  productOrderService.orderProduct(userId, productOrderDto);
        }
        catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productOrderDto, HttpStatus.OK);
    }

    @PutMapping(path = "{userId}", consumes = {"application/json"}, produces= {"application/json"})
    private ResponseEntity<ProductOrderDto> updateOrder(@PathVariable(value="userId") Integer userId, @RequestBody ProductOrderDto productOrderDto){
        try{
            productOrderDto =  productOrderService.updateOrder(userId, productOrderDto);
        }
        catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productOrderDto, HttpStatus.OK);
    }

    @GetMapping(path = "{userId}", produces= {"application/json"})
    private ResponseEntity<Set<ProductOrderDto>> getOrders(@PathVariable(value="userId") int userId){
        Set<ProductOrderDto> productOrderDtoList = null;
        try{
            productOrderDtoList = productOrderService.getOrders(userId);
        }
        catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productOrderDtoList, HttpStatus.OK);
    }

    @DeleteMapping("{userId}/{orderId}")
    private ResponseEntity<String> deleteOrder(@PathVariable(value = "userId") int userId, @PathVariable(value = "orderId") int orderId){
        try{
            productOrderService.cancelOrder(userId,orderId);
        }
        catch (Exception error) {
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Porduct Removed Successfully", HttpStatus.OK);
    }

}
