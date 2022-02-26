package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order newOrder = new Order();
        newOrder.setOrderId(1);
        newOrder.setOrderDate(LocalDate.now());
        newOrder.setOrderTime(LocalTime.now());
        Product newProduct = new Product();
        newProduct.setName("Тойбосс");
        newProduct.setType(ProductType.MEAT);
        newOrder.setProducts(new ArrayList<>());
        newOrder.getProducts().add(newProduct);
        orders.add(newOrder);
        Order newOrder1 = new Order();
        newOrder1.setOrderId(2);
        newOrder1.setOrderDate(LocalDate.now());
        newOrder1.setOrderTime(LocalTime.now());
        Product newProduct1 = new Product();
        newProduct1.setName("Герой");
        newProduct1.setType(ProductType.BREAD);
        newOrder1.setProducts(new ArrayList<>());
        newOrder1.getProducts().add(newProduct1);
        orders.add(newOrder1);
        Order newOrder2 = new Order();
        newOrder2.setOrderId(2);
        newOrder2.setOrderDate(LocalDate.now());
        newOrder2.setOrderTime(LocalTime.now());
        Product newProduct2 = new Product();
        newProduct2.setName("Белая река");
        newProduct2.setType(ProductType.MILK);
        newOrder2.setProducts(new ArrayList<>());
        newOrder2.getProducts().add(newProduct2);
        orders.add(newOrder2);
        System.out.println(orders);
    }
}
