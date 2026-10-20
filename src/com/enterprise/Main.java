package com.enterprise;

import com.enterprise.billing.*;
import com.enterprise.model.UserRegistration;
import com.enterprise.geometry.ShippingPackageGeometry;

/**
 * Main application entrypoint for the Enterprise Billing & Settlement Engine.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   Enterprise Billing & Ledger System v3.1");
        System.out.println("==================================================");

        // 1. User profile onboarding
        UserRegistration reg = new UserRegistration();
        reg.signup();

        // 2. Packaging geometry
        ShippingPackageGeometry geo = new ShippingPackageGeometry();
        System.out.println("Cylindrical packaging base: " + geo.calculateArea(6.0));

        // 3. Batch settlements
        BatchProcessor bp = new BatchProcessor();
        int[] settlements = {120, 350, 480, 90};
        System.out.println("Settlement total: " + bp.processBatch(settlements));

        // 4. Invoicing
        InvoiceService invoiceService = new InvoiceService();
        System.out.println("Client invoice: $" + invoiceService.generateInvoice());
        System.out.println("==================================================");
    }
}
