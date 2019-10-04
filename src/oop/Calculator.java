package oop;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    //Polymorphism
    //
    public int addition(int a,int b){
        return a+b;
    }
    public int addition(int a,int b,int c) {
        return a + b + c;
    }
    //psvm
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int x = calculator.addition(10,20);
        int y = calculator.addition(10,20,30);

        //sout
        System.out.println(x);
        System.out.println(y);

    }

}
