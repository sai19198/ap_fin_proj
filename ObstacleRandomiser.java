package sample;

import javafx.scene.Group;
import javafx.scene.shape.Circle;

import java.util.Random;


public class ObstacleRandomiser {
    Group random_obstacle(){
//        String[] Obstacle = new String[]{"Con","Circ","Pin","DoubPin","Square"};
        Group obstacleshown = new Group();
        Random random = new Random();
        int i= random.nextInt(5);
        if(i==0){
            ConcentricCircleob concentricCircleob = new ConcentricCircleob();
            obstacleshown.getChildren().add(concentricCircleob.ConcentricCircleob());
        }
        else if(i==1){
            CircleOb circleOb = new CircleOb();
            obstacleshown.getChildren().add(circleOb.CircleOb());
        }
        else if(i==2){
            Pinwheelob pinwheelob = new Pinwheelob();
            obstacleshown.getChildren().add(pinwheelob.Pinwheelob());
        }
        else if(i==3){
            DoublePinwheelOb doublePinwheelOb = new DoublePinwheelOb();
            obstacleshown.getChildren().add(doublePinwheelOb.DoublePinwheelob());
        }
        else{
            SquareOb squareOb = new SquareOb();
            obstacleshown.getChildren().add(squareOb.Squareob());
        }

        return obstacleshown;

    }
}
