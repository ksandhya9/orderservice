package com.ecommerce.orderserviceProject.contoller;

import java.util.*;
import com.ecommerce.orderserviceProject.*;

@RestController
public class OrdersRestController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/api/orders/{id}")
    public Object retrieveAllUsers() {

        return orderService.getOrders();
    }
}