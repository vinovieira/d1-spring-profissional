package com.silvinovieira.d1_spring_profissional.entities;

public class Order {
    private int code;
    private double price;
    private double discount;

    public Order() {
    }

    public Order(int code, double price, double discount) {
        this.code = code;
        this.discount = discount;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
