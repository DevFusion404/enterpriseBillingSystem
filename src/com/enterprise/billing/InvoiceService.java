package com.enterprise.billing;

public class InvoiceService {
    public double calcTot(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public double generateInvoice() {
        return calcTot(29.99, 3);
    }

    public static void main(String[] args) {
        InvoiceService service = new InvoiceService();
        System.out.println("Invoice Total: " + service.generateInvoice());
    }
}
