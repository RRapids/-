package com.soft1841.oop.week1;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class MyButton extends Button {
    //自定义构造方法，
    public MyButton(){
        //给当前按钮对象设置格式的尺寸
        this.setPrefSize(436,44);
        //给当前按钮设置背景色
        this.setStyle("-fx-background-color: rgb(0, 132, 255);-fx-border-radius: 10;-fx-text-fill: #FFFFFF");
    }
}
