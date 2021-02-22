package com.ecommerce.orderserviceProject.service;

import com.ecommerce.orderserviceProject.entity;
import java.util.*;
import com.ecommerce.orderserviceProject.*;

public interface OrderService {
    public abstract void createOrder(Order order);
    public abstract void cancelOrder(Integer id);
    public abstract Collection<Order> getProducts();
}