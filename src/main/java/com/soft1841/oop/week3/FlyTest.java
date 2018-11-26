package com.soft1841.oop.week3;

public class FlyTest {
    public static void main(String[] args) {
        Fly fly = new Plane("波音747", 940.0);
        System.out.println(fly.fly());

        Fly fly1 = new Bird("老鹰", 80.8);
        System.out.println(fly1.fly());
    }
}
