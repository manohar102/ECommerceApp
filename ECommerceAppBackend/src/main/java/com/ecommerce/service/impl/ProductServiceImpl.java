package com.ecommerce.service.impl;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.dto.mapper.ProductMapper;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import com.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> getAllProducts() throws Exception {
        try{
            return productMapper.modelsToDtos(productRepository.findAll());
        }
        catch(Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Failed getting products.");
        }
    }

    @Override
    public ProductDto createProduct(Product product) throws Exception {
        ProductDto productDto = null;
        try{
            Product product1 = productRepository.save(product);
            productDto = productMapper.modelToDto(product1);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Product failed uploading.");
        }

        return productDto;
    }

    @Override
    public ProductDto updateProduct(int id, Product product) throws Exception {
        ProductDto productDto = null;
        try{
            product = productRepository.save(product);
            productDto = productMapper.modelToDto(product);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Product updation failed.");
        }

        return productDto;
    }

    @Override
    public ProductDto getProduct(int id) throws Exception {

        ProductDto productDto = null;
        try {
            Optional<Product> product = productRepository.findById(id);
            if (product.isPresent()) {
                productDto = productMapper.modelToDto(product.get());
            }
        }
        catch(Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Geting product failed.");
        }
        return productDto;
    }

    @Override
    public void deleteProduct(int id) throws Exception {
        try{
            productRepository.deleteById(id);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
            throw new Exception("Product deletion failed.");
        }

    }




}
