package com.ecommerce.dto.mapper;

import com.ecommerce.dto.ProductOrderDto;
import com.ecommerce.model.ProductOrder;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface ProductOrderMappper {
    ProductOrderDto productOrderToDto(ProductOrder productOrder);
    ProductOrder dtoToProductOrder(ProductOrderDto productOrderDto);
//    List<ProductOrderDto> productOrdersToDtos(Set<ProductOrder> productOrderSet);
    Set<ProductOrderDto> productOrdersToDtos(Set<ProductOrder> productOrders);
}
