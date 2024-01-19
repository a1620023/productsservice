package io.creh.productsserive.controller;

import io.creh.productsserive.model.Product;
import io.creh.productsservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<Product> getAllProducts() {
        return productService.listProducts();
    }

    @PostMapping()
    public Product saveProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
}
