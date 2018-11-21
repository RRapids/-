package com.soft1841.oop.week1;

public class Rectangle extends Shape {
    @Override
    public void getArea() {
        super.getArea();
        int wight = 10;
        int height = 10;
        System.out.println(wight * height);
    }
}
