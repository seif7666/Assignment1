package com.company;

import static org.junit.Assert.*;

public class MainTest {
    private Main main=new Main();
    private int x;
    private float y;

    @org.junit.Test
    public void add() {
        x=main.add(Integer.MAX_VALUE,8);
        assertEquals(-1,x);
        x=main.add(89,11);
        assertEquals(100,x);
        x=main.add(65,-65);
        assertEquals(0,x);
        x=main.add(Integer.MIN_VALUE,-1);
        assertEquals(-1,x);
    }

    @org.junit.Test
    public void divide() {
        y=main.divide(5,3);
        assertEquals((float)5/3,y,0);
        y=main.divide(2,5);
        assertEquals((2f/5),y,0.00);
        y=main.divide(0,56);
        assertEquals(0,y,0.00);
        y=main.divide(0,-36);
        assertEquals(0,y,0.00);
        try{
            y=main.divide(10,0);
        }catch(RuntimeException r){
            System.out.println("It tests right!");
            System.out.println(r.toString());
        }
    }
}