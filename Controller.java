package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    double y;
    @FXML
    private Pane pane;

    @FXML
    private Text NewGame,LoadGame,Exit;



    @FXML
    private Label label1;
    @FXML
    void StartGame() throws IOException {
        Stage stage;
        Player obj = new Player();

        Circle player = obj.show_player();
        Group root = new Group(player);
        ObstacleRandomiser obstacleRandomiser = new ObstacleRandomiser();


//        Bounds bounds = root.getChildren().get(0).localToScene(root.getChildren().get(0).getBoundsInLocal());


        stage = (Stage) NewGame.getScene().getWindow();


        System.out.println("Clicked");

        Scene scene = new Scene(root, 800, 400);

        root.getChildren().add(obstacleRandomiser.random_obstacle());

        int a=0;
        scene.setFill(Paint.valueOf("#272727"));
        stage.setScene(scene);
//        final double[] y = new double[1];

        scene.setOnMouseClicked(e->{ System.out.println(e.getX()+" "+e.getY());});
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode() == KeyCode.SPACE){
                    moveUp(player,root);
                    obj.setY((int) y-60);
//                    System.out.println("oklol="+y+" objy=" +obj.getY());
//                    System.out.println(player.getCenterY()+" bounds:"+ bounds.getCenterY());
                    System.out.println("oknicepls="+root.getChildren().get(1).localToScene(root.getChildren().get(1).getBoundsInLocal()).getCenterY());
                    if(root.getChildren().get(1).localToScene(root.getChildren().get(1).getBoundsInLocal()).getCenterY()>=400){
                        root.getChildren().remove(1);
                        root.getChildren().add(obstacleRandomiser.random_obstacle());
                    }
                }

            }

        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                moveDown(player,root);
                obj.setY((int)y);
            }
        });
//        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent keyEvent) {
////                KeyEvent keyEvent1 = new KeyEvent(Event.ANY, 'c', "nice", KeyCode.SPACE, false,false,false);
//                String newevent = keyEvent.getEventType().toString();
////                System.out.println(newevent);
//                if (){
//
//
//                }
//            }
//        }));
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();

//        System.out.println(player.getCenterY()+" "+ player.layoutYProperty());
//
//
//
//        scene.setOnKeyPressed(e->{
//;
//
//            System.out.println("pressed");
//
//            player.setCenterY(player.getCenterY()+(player.getRadius()-50));
//
//            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(500),
//                    new KeyValue(player.translateYProperty(), player.getCenterY())));
//            timeline.setCycleCount(Animation.INDEFINITE);
//
////            timeline.setAutoReverse(true);
//            timeline.play();
//
//            System.out.println("player:" + player.getCenterY()+" object"+obj.getY());
//
//            });
//        scene.setOnKeyReleased(e-> {
//
//        });

        stage.show();
    }

    public void moveUp(Circle player,Group root){
        TranslateTransition goUp = new TranslateTransition(Duration.millis(500),player);
        goUp.setByY(-60);
//        System.out.println(player.getCenterY()+ " "+ player.getCenterX());
        goUp.play();
        Bounds bounds = root.getChildren().get(0).localToScene(root.getChildren().get(0).getBoundsInLocal());
        y= bounds.getCenterY();
        TranslateTransition goUpob = new TranslateTransition(Duration.millis(500),root.getChildren().get(1));
        goUpob.setByY(20);
        goUpob.play();
//         System.out.println("y="+y);
    }

    public void moveDown(Circle player,Group root){
        TranslateTransition goDown = new TranslateTransition(Duration.millis(500),player);
        goDown.setToY(0);
//        goDown.setCycleCount(Animation.INDEFINITE);
        goDown.play();
        Bounds bounds = root.getChildren().get(0).localToScene(root.getChildren().get(0).getBoundsInLocal());
        y= bounds.getCenterY();
        System.out.println(y);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
