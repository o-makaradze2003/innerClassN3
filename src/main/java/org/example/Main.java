package org.example;

public class Main {
    public static void main(String[] args) {
        MAthOperations obj = new MAthOperations();
        obj.displaySum(new Calculator() {
            public int calculate(int a, int b) {
                return a + b;
            }
        });

    }
}