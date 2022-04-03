package com.ecommerce.service.impl;

import com.ecommerce.dto.ProductOrderDto;
import com.ecommerce.dto.mapper.ProductOrderMappper;
import com.ecommerce.model.ProductOrder;
import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.ProductOrderService;
import com.ecommerce.repository.ProductOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service @RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductOrderServiceImpl implements ProductOrderService {

    private final ProductOrderRepository productOrderRepository;
    private final UserRepository userRepository;
    private final ProductOrderMappper productOrderMappper;

    @Override
    public ProductOrderDto orderProduct(int userId, ProductOrderDto productOrderDto) throws Exception {
        try{
            User user = userRepository.getById(userId);
            ProductOrder productOrder = productOrderMappper.dtoToProductOrder(productOrderDto);
            productOrder.setUser(user);
            productOrderRepository.save(productOrder);
            return productOrderMappper.productOrderToDto(productOrder);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Order doesnot placed try again");
        }
    }

    @Override
    public ProductOrderDto updateOrder(int userId, ProductOrderDto productOrderDto) throws Exception {
        try{
            User user = userRepository.getById(userId);
            ProductOrder productOrder = productOrderMappper.dtoToProductOrder(productOrderDto);
            productOrder.setUser(user);
            productOrderRepository.save(productOrder);
            return productOrderMappper.productOrderToDto(productOrder);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Order doesnot placed try again");
        }
    }

    @Override
    public void cancelOrder(int userId, int orderId) throws Exception {
        try{
            productOrderRepository.deleteById(orderId);
        } catch (Exception e) {
            System.out.println("Exception " + e);
            throw new Exception("Removing order failed.");
        }
    }

    @Override
    public Set<ProductOrderDto> getOrders(int userId) throws Exception {
        try {
            User user = userRepository.findById(userId).get();
            if(user==null) {
                throw new Exception("user not found");
            }
            System.out.println(user.getEmail());
            Set<ProductOrder> productOrders = user.getOrders();
            Set<ProductOrderDto> productOrderDtos = productOrderMappper.productOrdersToDtos(productOrders);
            return productOrderDtos;
        } catch (Exception e) {
            System.out.println("Exception " + e);
            throw new Exception("Order getting failed.");
        }
    }
}
