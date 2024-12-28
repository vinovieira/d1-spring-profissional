package com.silvinovieira.d1_spring_profissional.services;

import com.silvinovieira.d1_spring_profissional.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getPrice() < 100.00) return 20.00;
        if (order.getPrice() >= 100.00 && order.getPrice() <= 200.00 ) return 12.00;
        return 0;
    }
}
