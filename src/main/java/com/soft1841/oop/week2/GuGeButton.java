package com.soft1841.oop.week2;

import javafx.scene.control.Button;

public class GuGeButton extends Button {
    public GuGeButton(){
        this.setPrefSize(50,50);
        this.setStyle("-fx-background-image:url(/img/jia.png);" +
                "-fx-border-radius: 100;" +
                "-fx-background-radius: 100;" +
                "-fx-padding: 6 6 6 6");
    }
}
