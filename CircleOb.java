package sample;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CircleOb extends Obstacle {
    @FXML
    private Text NewGame;

    Group CircleOb(){
//        Stage stage;
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

        Arc arc2 = new Arc(400, 100, 80, 80, 90, 90);
        arc2.setStroke(Color.DARKSALMON);
        arc2.setStrokeWidth(10);
        arc2.setFill(Color.TRANSPARENT);

        Arc arc3 = new Arc(400, 100, 80, 80, 180, 90);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(10);
        arc3.setFill(Color.TRANSPARENT);

        Arc arc4 = new Arc(400, 100, 80, 80, 270, 90);
        arc4.setStroke(Color.ORANGE);
        arc4.setStrokeWidth(10);
        arc4.setFill(Color.TRANSPARENT);
//        Group rootmain = new Group();

        Group root = new Group(arc, arc2, arc3, arc4);
//        Scene scene = new Scene(root);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setDuration(Duration.seconds(3));
        rotate.setNode(root);
        rotate.play();
//        stage = (Stage) NewGame.getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
        return root;
    }

}
