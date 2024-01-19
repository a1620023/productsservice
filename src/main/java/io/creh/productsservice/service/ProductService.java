package io.creh.productsservice.service;


import io.creh.productsserive.model.Product;
import io.creh.productsservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ArrayList<Product> listProducts() {
        return (ArrayList<Product>) productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
