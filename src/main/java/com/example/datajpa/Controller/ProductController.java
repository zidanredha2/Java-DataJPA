package com.example.datajpa.Controller;

import com.example.datajpa.Service.ProductService;
import com.example.datajpa.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @DeleteMapping
    public void deleteProduct(@RequestBody Product product){
        // Implementation for deleting a product would go here
        productService.deleteProduct(product);
    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        productService.updateProduct(product);
    }
}
