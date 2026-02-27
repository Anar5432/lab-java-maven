package com.ironhack;
import com.google.gson.Gson;

public class OrderProcessor {
    public static void main(String[] args) {
        // 1. A sample JSON string (The "Receipt")
        String jsonInput = "{"
                + "\"orderId\": 101,"
                + "\"customer\": \"Alex Ironhack\","
                + "\"total\": 55.50,"
                + "\"items\": ["
                + "  {\"name\": \"Laptop Case\", \"price\": 25.50, \"quantity\": 1},"
                + "  {\"name\": \"Mouse\", \"price\": 15.00, \"quantity\": 2}"
                + "]"
                + "}";

        // 2. Initialize Gson
        Gson gson = new Gson();

        // 3. Convert JSON string to our Java Order object
        Order myOrder = gson.fromJson(jsonInput, Order.class);

        // 4. Print the result to verify it works
        System.out.println("Parsed Order");
        System.out.println(myOrder);
    }
}