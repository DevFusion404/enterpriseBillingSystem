package com.enterprise.billing;

public class BatchProcessor {
    public int processBatch(int[] numbers) {
        int total = 0;
        int count = 0;
        for (int n : numbers) {
            int squared = n * n;
            total += squared;
            count++;
        }
        return total;
    }

    public static void main(String[] args) {
        BatchProcessor bp = new BatchProcessor();
        int[] data = {1, 2, 3, 4};
        System.out.println("Batch result: " + bp.processBatch(data));
    }
}
