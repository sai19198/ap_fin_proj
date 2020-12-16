package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {
    private int x,y;

    public Player(){
        x = 400;
        y = 300;
    }
    public Circle show_player(){
        Circle circle = new Circle();
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setRadius(10.0f);
        circle.setFill(Color.PURPLE);
        return circle;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = this.y + y;
    }
}
