package com.example.datajpa.Repository;

import com.example.datajpa.Service.ProductService;
import com.example.datajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
