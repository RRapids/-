package com.soft1841.oop.week2;

public class Triangle extends Shape {

    public Triangle() {
        super();
    }

    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("三角形面积是：");
    }

    @Override
    public double getArea() {
     return this.x * this.y * 0.5;
    }
}
