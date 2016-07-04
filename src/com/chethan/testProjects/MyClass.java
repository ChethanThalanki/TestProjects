package com.chethan.testProjects;

public class MyClass{
    int x;
    MyClass(int y){
        this.x = y ++ ;
    }
    int method(MyClass mc){
        if(mc.x == 5){
            mc.x += 6;
            method(mc);
        }
        if(mc.x == 6){
            mc.x += 9;
            method(mc);
        }
        return ++ mc.x;
    }
    public static void main(String[] args){
        MyClass mc = new MyClass(5);
        System.out.println(mc.method(mc));
    }
}