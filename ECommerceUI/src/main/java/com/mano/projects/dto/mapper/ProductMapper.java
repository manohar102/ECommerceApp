package com.mano.projects.dto.mapper;

import com.mano.projects.dto.ProductDto;
import com.mano.projects.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product dtoToModel(ProductDto productDto);
    ProductDto modelToDto(Product product);
    List<ProductDto> modelsToDtos(List<Product> products);
}
