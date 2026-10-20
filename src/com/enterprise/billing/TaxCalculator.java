package com.enterprise.billing;

public class TaxCalculator {
    public double calculateNetIncome(double grossIncome) {
        return grossIncome - (grossIncome * 0.15);
    }

    public static void main(String[] args) {
        TaxCalculator calc = new TaxCalculator();
        System.out.println("Net income: " + calc.calculateNetIncome(100000.0));
    }
}
