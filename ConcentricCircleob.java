package sample;

import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class ConcentricCircleob extends Obstacle {
    Group ConcentricCircleob(){
        Arc arc = new Arc();
        arc.setCenterX(400.0f);
        arc.setCenterY(100.0f);
        arc.setRadiusX(80.0f);
        arc.setRadiusY(80.0f);
        arc.setStartAngle(0.0f);
        arc.setLength(90.0f);
        arc.setStroke(Color.PURPLE);
        arc.setStrokeWidth(10);
        arc.setFill(Color.TRANSPARENT);
        Arc innerarc = new Arc();
        innerarc.setCenterX(400.0f);
        innerarc.setCenterY(100.0f);
        innerarc.setRadiusX(65.0f);
        innerarc.setRadiusY(65.0f);
        innerarc.setStartAngle(0.0f);
        innerarc.setLength(90.0f);
        innerarc.setStroke(Color.DARKSALMON);
        innerarc.setStrokeWidth(10);
        innerarc.setFill(Color.TRANSPARENT);

        Arc arc2 = new Arc(400, 100, 80, 80, 90, 90);
        arc2.setStroke(Color.DARKSALMON);
        arc2.setStrokeWidth(10);
        arc2.setFill(Color.TRANSPARENT);

        Arc innerarc2 = new Arc(400,100,65,65,90,80);
        innerarc2.setStroke(Color.PURPLE);
        innerarc2.setStrokeWidth(10);
        innerarc2.setFill(Color.TRANSPARENT);

        Arc arc3 = new Arc(400, 100, 80, 80, 180, 90);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(10);
        arc3.setFill(Color.TRANSPARENT);

        Arc innerarc3 = new Arc(400,100,65,65,180,80);
        innerarc3.setStroke(Color.ORANGE);
        innerarc3.setStrokeWidth(10);
        innerarc3.setFill(Color.TRANSPARENT);

        Arc arc4 = new Arc(400, 100, 80, 80, 270, 90);
        arc4.setStroke(Color.ORANGE);
        arc4.setStrokeWidth(10);
        arc4.setFill(Color.TRANSPARENT);

        Arc innerarc4 = new Arc(400,100,65,65,270,80);
        innerarc4.setStroke(Color.BLUE);
        innerarc4.setStrokeWidth(10);
        innerarc4.setFill(Color.TRANSPARENT);


        Group circleout = new Group(arc, arc2, arc3, arc4);
        Group circlein = new Group(innerarc,innerarc2,innerarc3,innerarc4);
        RotateTransition rotateout = new RotateTransition();
        rotateout.setAxis(Rotate.Z_AXIS);
        rotateout.setByAngle(360);
        rotateout.setCycleCount(RotateTransition.INDEFINITE);
        rotateout.setDuration(Duration.seconds(3));
        rotateout.setNode(circleout);
        rotateout.play();

        RotateTransition rotatein = new RotateTransition();
        rotatein.setAxis(Rotate.Z_AXIS);
        rotatein.setByAngle(360);
        rotatein.setCycleCount(RotateTransition.INDEFINITE);
        rotatein.setDuration(Duration.seconds(2));
        rotatein.setNode(circlein);
        rotatein.play();
        Group finalcirc = new Group(circleout,circlein);


        return finalcirc;
    }
}
