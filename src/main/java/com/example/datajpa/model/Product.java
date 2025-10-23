package com.example.datajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id; }
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name; }
    public double getPrice() {
        return price; }
    public void setPrice(double price) {
        this.price = price; }
}
