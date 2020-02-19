package com.company;

public class Main implements ICalculator {
    public static final  int max=Integer.MAX_VALUE;
    public static final  int min=Integer.MIN_VALUE;
    @Override
    public int add(int x, int y) {
        long sum=(long)x+y;
        if(sum<=max&&sum>=min)
        return x + y;
        System.out.println("The sum is out of bounds!");
        return -1;
    }

    @Override
    public float divide(int x, int y) {
        try {
            float z=x/y;
            return (float) x /(float) y;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Error .\nDivision by zero is undefined.");
        }

    }
}


