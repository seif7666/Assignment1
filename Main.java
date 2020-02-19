package com.company;

public class Main implements ICalculator {
    public static final  int max=Integer.MAX_VALUE;
    public static final  int min=Integer.MIN_VALUE;
    @Override
    public int add(int x, int y) {
        long sum=(long)x+y;
        if(sum<=max&&sum>=min)//To avoid a false result.
        return x + y;
        System.out.println("The sum is out of bounds!");
        return -1;//-1 means error.
    }

       @Override
    public float divide(int x, int y) {
        if(y!=0)
            return (float) x /(float) y;
        throw new RuntimeException("Error .\nDivision by zero is undefined.");
        }

    }


