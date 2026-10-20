package com.enterprise.geometry;

public class ShippingPackageGeometry {
    public double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        ShippingPackageGeometry geo = new ShippingPackageGeometry();
        System.out.println("Base Area: " + geo.calculateArea(5.0));
    }
}
