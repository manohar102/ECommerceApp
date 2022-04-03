package com.mano.projects.dto.mapper;

import com.mano.projects.dto.ProductOrderDto;
import com.mano.projects.model.ProductOrder;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ProductOrderMappper {
    ProductOrderDto productOrderToDto(ProductOrder productOrder);
    ProductOrder dtoToProductOrder(ProductOrderDto productOrderDto);
//    List<ProductOrderDto> productOrdersToDtos(Set<ProductOrder> productOrderSet);
    Set<ProductOrderDto> productOrdersToDtos(Set<ProductOrder> productOrders);
}
