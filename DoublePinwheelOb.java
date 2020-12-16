package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class DoublePinwheelOb extends Obstacle {
    Group DoublePinwheelob(){

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

        Line secondl1 = new Line(320,100,370,75);
        secondl1.setStrokeWidth(10);
        secondl1.setStroke(Color.YELLOW);

        Line secondl2 = new Line(320,100,270,125);
        secondl2.setStrokeWidth(10);
        secondl2.setStroke(Color.BLUE);

        Line secondl3 = new Line(320,100,347,150);
        secondl3.setStrokeWidth(10);
        secondl3.setStroke(Color.RED);

        Line secondl4 = new Line(320,100,293,50);
        secondl4.setStrokeWidth(10);
        secondl4.setStroke(Color.PINK);

        Group firstpin = new Group(l1,l2,l3,l4);
        Group secondpin = new Group(secondl1,secondl2,secondl3,secondl4);

        RotateTransition rotateout = new RotateTransition();
        rotateout.setAxis(Rotate.Z_AXIS);
        rotateout.setByAngle(360);
        rotateout.setCycleCount(RotateTransition.INDEFINITE);
        rotateout.setDuration(Duration.seconds(3));
        rotateout.setNode(firstpin);
        rotateout.play();

        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setDuration(Duration.seconds(2));
        rotate.setNode(secondpin);
        rotate.play();

        Group finalob = new Group(firstpin,secondpin);
        return finalob;
    }
}
