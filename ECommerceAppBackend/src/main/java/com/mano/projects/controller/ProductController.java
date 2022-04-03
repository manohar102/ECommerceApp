package com.mano.projects.controller;

import com.mano.projects.dto.ProductDto;
import com.mano.projects.dto.mapper.ProductMapper;
import com.mano.projects.model.Product;
import com.mano.projects.repository.ProductRepository;
import com.mano.projects.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("product")
@RestController @RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private final ProductService productService;

    @PostMapping(path = "/", consumes = {"application/json"},produces= {"application/json"})
    public ResponseEntity<ProductDto> saveProduct(@RequestBody Product product) {
        ProductDto productDtoRes = null;
        try{
            productDtoRes = productService.createProduct(product);
        }
        catch (Exception error){
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productDtoRes, HttpStatus.CREATED);
    }

    @GetMapping(path = "/products",produces= {"application/json"})
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        List<ProductDto> productDtoRes = null;
        try{
            productDtoRes = productService.getAllProducts();
        }
        catch (Exception error){
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productDtoRes, HttpStatus.OK);
    }

    @GetMapping(path = "{productId}", produces= {"application/json"})
    public ResponseEntity<ProductDto> getProduct(@PathVariable(value="productId") Integer productId){
        ProductDto productDtoRes = null;
        try{
            productDtoRes = productService.getProduct(productId);
        }
        catch (Exception error){
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productDtoRes, HttpStatus.OK);
    }

    @PutMapping(path = "{productId}", produces= {"application/json"})
    public ResponseEntity<ProductDto> updateProduct(@PathVariable(value="productId") Integer productId, @RequestBody Product product){
        ProductDto productDtoRes = null;
        try{
            productDtoRes = productService.updateProduct(productId,product);
        }
        catch (Exception error){
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(productDtoRes, HttpStatus.OK);
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable(value="productId") Integer productId){
        try{
            productService.deleteProduct(productId);
        }
        catch (Exception error){
            return new ResponseEntity(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity("Deleted Successfully", HttpStatus.OK);
    }
}