package com.mckc.array.practice;


class A1 {
    public int i;
    protected int j;
}  


class B2 extends A1 {
    int j;

    void display() {
        super.j = 3;
        super.i = 10;
        System.out.println(i + " " + j);
    }
}

public class demo2 {

    public static void main(String args[]){

        B2 obj = new B2();
        obj.i = 1;
        obj.j = 2;   
        obj.display();     
    }
}