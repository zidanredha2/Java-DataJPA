package com.example.datajpa.Service;

import com.example.datajpa.Repository.ProductRepo;
import com.example.datajpa.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    public List<Product> getProducts(){
        return repo.findAll();
    }
    public void addProduct(Product product){
        repo.save(product);
    }
    public void deleteProduct(Product product){
        repo.delete(product);
    }
    public void updateProduct(Product product) {
        repo.save(product);
    }
}
