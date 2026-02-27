package com.ironhack;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderCalculator calculator = new OrderCalculator();
        List<Order> orders = new ArrayList<>();


        Order elonOrder = new Order("2 tackobel order" , "Elon" , 24.99);


        elonOrder.getItems().add(new OrderItem("takobel"));
        elonOrder.getItems().add(new OrderItem("cola"));
        elonOrder.getItems().add(new OrderItem("rench sose"));


        orders.add(elonOrder);

        System.out.println("Logic Module Results");
        int count = calculator.countAllItems(orders);
        System.out.println("Total items across all orders: " + count);
    }
}
