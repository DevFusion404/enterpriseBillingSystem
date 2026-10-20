package com.enterprise.util;

public class DataFormatter {
    public int calcDat(int value) {
        return value * 2;
    }

    public int process(int num) {
        return calcDat(num);
    }

    public static void main(String[] args) {
        DataFormatter df = new DataFormatter();
        System.out.println("Result: " + df.process(10));
    }
}
