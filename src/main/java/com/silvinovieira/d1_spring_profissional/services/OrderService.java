package com.silvinovieira.d1_spring_profissional.services;

import com.silvinovieira.d1_spring_profissional.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getPrice() * (1 - order.getDiscount()/100) + shippingService.shipment(order);
    }

}
