package com.ecommerce.orderserviceProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.ecommerce.orderserviceProject.*;
@Repository
public interface OrdersJPARepository extends JpaRepository<Order, Integer>{

}