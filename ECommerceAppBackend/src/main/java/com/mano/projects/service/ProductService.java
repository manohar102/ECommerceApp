package com.mano.projects.service;

import com.mano.projects.dto.ProductDto;
import com.mano.projects.model.Product;

import java.util.List;

public interface ProductService {

    ProductDto createProduct(Product product) throws Exception;

    ProductDto updateProduct(int id, Product product) throws Exception;

    ProductDto getProduct(int id) throws Exception;

    void deleteProduct(int id) throws Exception;

    List<ProductDto> getAllProducts() throws Exception;
}