package com.umakant.JavaLearning;

public class BasicArthimeticOperation {

    int sum(int a, int b) {
        return a + b;
    }

    int substraction(int a, int b) {
        if (a > b)
            return a - b;
        else
            return b - a;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (a > b)
            return a / b;
        else
            return b / a;
    }
}
