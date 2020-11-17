package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        GridPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Color switch");
        Gameplay obj1 = new Gameplay();
        obj1.mainmenu(primaryStage);
//        pane.getChildren().add(new Polygon(10,20,30,10,20,30));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
class Obstacle{
    private int x,y;
    private final Paint cyan = Paint.valueOf("#00FFFF");
    private final Paint yellow = Paint.valueOf("#FFFF00");
    private final Paint purple = Paint.valueOf("#800080");
    private final Paint orange = Paint.valueOf("#FFA500");

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Paint getCyan() {
        return cyan;
    }

    public Paint getOrange() {
        return orange;
    }

    public Paint getPurple() {
        return purple;
    }

    public Paint getYellow() {
        return yellow;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}


class Gameplay{
    private Obstacle ob;

    void mainmenu(Stage prim){
        Pane pane = new StackPane();
        Button newgame = new Button("New Game");
        Button loadgame = new Button("Load game");
        Button Exit = new Button("Exit");
        VBox vert =  new VBox(newgame,loadgame,Exit);
        vert.setAlignment(Pos.CENTER);
        vert.setSpacing(15);
        pane.getChildren().add(vert);
        Scene mainmenus = new Scene(pane,800,400, Color.BLACK);
        newgame.setOnAction(e -> prim.setScene(newgame()));
        prim.setScene(mainmenus);
        prim.show();

    }
    Scene newgame(){
        CirclOob obj = new CirclOob();
        Pane ok = new Pane();
//        ok.getChildren().add(obj);
        Scene scene2 = obj.CirclOob();
        return scene2;
    }

}
class CirclOob extends Obstacle{
    Scene CirclOob(){
        Arc arc = new Arc();
        arc.setCenterX(400.0f);
        arc.setCenterY(100.0f);
        arc.setRadiusX(80.0f);
        arc.setRadiusY(80.0f);
        arc.setStartAngle(0.0f);
        arc.setLength(90.0f);
        arc.setStroke(getCyan());
        arc.setStrokeWidth(10);
        arc.setFill(Color.TRANSPARENT);

        Arc arc2 = new Arc(400, 100, 80, 80, 90, 90);
        arc2.setStroke(getPurple());
        arc2.setStrokeWidth(10);
        arc2.setFill(Color.TRANSPARENT);

        Arc arc3 = new Arc(400, 100, 80, 80, 180, 90);
        arc3.setStroke(getYellow());
        arc3.setStrokeWidth(10);
        arc3.setFill(Color.TRANSPARENT);

        Arc arc4 = new Arc(400, 100, 80, 80, 270, 90);
        arc4.setStroke(getOrange());
        arc4.setStrokeWidth(10);
        arc4.setFill(Color.TRANSPARENT);

        Group root = new Group(arc, arc2, arc3, arc4);
        Scene scene = new Scene(root,800,400);
        scene.setFill(Color.BLACK);
        return scene;
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

}
