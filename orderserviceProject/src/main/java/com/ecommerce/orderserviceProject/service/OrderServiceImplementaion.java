package com.ecommerce.orderserviceProject.service;
import java.util.*;
import com.ecommerce.orderserviceProject.*;
@Service
public class OrderServiceImplementaion implements OrderService{

    @Autowired
    private OrdersJPARepository ordersRepo;

    public void createOrder(Order order){

    }
    public void cancelOrder(Integer id){

    }
    public Collection<Order> getOrders(){
        return ordersRepo.findAll();
    }

}