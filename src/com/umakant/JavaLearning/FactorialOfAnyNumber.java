package com.umakant.JavaLearning;

public class FactorialOfAnyNumber {

    public int factorialOfGivenNumber(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }
}
