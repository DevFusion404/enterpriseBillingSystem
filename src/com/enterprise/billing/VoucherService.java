package com.enterprise.billing;

public class VoucherService {
    public double applyDiscount(double totalAmount) {
        if (totalAmount > 1000) {
            return totalAmount * 0.85;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        VoucherService service = new VoucherService();
        System.out.println("Discounted: " + service.applyDiscount(1500));
    }
}
