package org.example;

interface Calculator {
    int calculate(int a, int b);
}

public class MAthOperations {
    void displaySum(Calculator cal) {
        System.out.println(cal.calculate(5, 6) +
                ", This is sum");
    }
}



