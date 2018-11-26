package com.soft1841.oop.week2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Triangle(3.0,4.0);
        System.out.println("三角形的面积是：" + shape.getArea());

        Shape shape1 = new Rectangle(4.0,5.0);
        System.out.println("矩形面积是：" + shape1.getArea());

        Cube cube = new Cube(4.0,4.0,5.0);
        System.out.println("立方体的体积是：" + cube.getArea() );
    }
}
