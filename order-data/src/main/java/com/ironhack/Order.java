package com.ironhack;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Order {
    private String orderId;
    private String customer;
    private List<OrderItem> items = new ArrayList<>();
    private double total;

    public Order(String orderId, String customer, double total) {
        this.orderId = orderId;
        this.customer = customer;
        this.total = total;
    }


    public String getOrderId() {
        return orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + "for" + customer + " | Total: $" + total + " | Item: " + items;
    }
}
