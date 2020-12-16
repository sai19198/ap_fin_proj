package sample;

import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Pinwheelob extends Obstacle {
    Group Pinwheelob(){
        Line l1 = new Line(450,100,500,75);
        l1.setStroke(Color.YELLOW);
        l1.setStrokeWidth(10);
        Line l2 = new Line(450, 100, 400,125);
        l2.setStroke(Color.BLUE);
        l2.setStrokeWidth(10);
        Line l3 = new Line(450,100,477,150);
        l3.setStrokeWidth(10);
        l3.setStroke(Color.RED);
        Line l4 = new Line(450,100,423,50);
        l4.setStroke(Color.PINK);
        l4.setStrokeWidth(10);

        Group g1 = new Group(l1,l2,l3,l4);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setDuration(Duration.seconds(3));
        rotate.setNode(g1);
        rotate.play();

        return g1;
    }

}

