package com.soft1841.oop.week3;

public class FlyObject implements Fly {
    //飞机名字
    protected String name;
    //飞行时速
    protected double speed;
    //给飞机起名字，和时速
    public FlyObject(String name,double speed){
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String fly() {
        return null;
    }
}
