package com.umakant.JavaLearning;

public class PerformBasicArthimeticOperationOnTwoNumber {
    public static void main(String[] args)
    {
        BasicArthimeticOperation operation=new BasicArthimeticOperation();
        System.out.println("Sum of two number :"+operation.sum(10,3));
        System.out.println("Substraction of two number :"+operation.substraction(10,3));
        System.out.println("Multiplication of two number :"+operation.multiply(10,3));
        System.out.println("Division of two number :"+operation.divide(10,3));
    }
}
