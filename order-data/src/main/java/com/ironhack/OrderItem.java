package com.ironhack;


public class OrderItem {
     private String itemName;
     public OrderItem(String itemName) {
         this.itemName = itemName; }

     @Override
     public String toString() {
         return itemName; }
}
