package com.enterprise.billing;

public class OrderStatusValidator {
    public boolean isPending(String status) {
        return "PENDING".equals(status);
    }

    public static void main(String[] args) {
        OrderStatusValidator validator = new OrderStatusValidator();
        System.out.println("Is pending: " + validator.isPending("PENDING"));
    }
}
