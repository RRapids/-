package com.soft1841.oop.week2;

public class Cube extends Rectangle {
    private double height;

    public Cube(double x, double y, double height) {
        super(x, y);
        this.height = height;
    }

    @Override
    public void show() {
        System.out.println("立方体体积为：");
    }

    @Override
    public double getArea() {
        return super.x * super.y * height;
    }
}
