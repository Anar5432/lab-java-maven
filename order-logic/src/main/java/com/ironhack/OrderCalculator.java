package com.ironhack;
import java.util.List;

public class OrderCalculator {
    public double calculateTotalRevenue(List<Order> orders){
        double totalRevenue = 0;
        for (Order order: orders){
            totalRevenue += order.getTotal();
        }
        return totalRevenue;
    }

    public int countAllItems(List<Order> orders){
        int totalItems = 0;
        for (Order order : orders){
            totalItems += order.getItems().size();
        }
        return totalItems;
    }
}
