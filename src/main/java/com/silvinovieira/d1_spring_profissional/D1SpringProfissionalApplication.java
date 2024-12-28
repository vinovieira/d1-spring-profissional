package com.silvinovieira.d1_spring_profissional;

import com.silvinovieira.d1_spring_profissional.entities.Order;
import com.silvinovieira.d1_spring_profissional.services.OrderService;
import com.silvinovieira.d1_spring_profissional.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D1SpringProfissionalApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(D1SpringProfissionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order;
		int[] orders = new int[]{1034, 2282, 1309};
		double[] prices = new double[]{150, 800, 95.90};
		double[] discount = new double[]{20, 10, 0};
		for (int i = 0; i < orders.length; i++) {
			order = new Order(orders[i], prices[i], discount[i]);
			System.out.println("=====================");
			System.out.println("Pedido código: " + order.getCode());
			System.out.println("Valor total: R$" + orderService.total(order));
			System.out.println("=====================");
		}
	}
}

