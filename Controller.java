package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private Text NewGame,LoadGame,Exit;

    @FXML
    private Label label1;
    @FXML
    void StartGame() throws IOException {
        Stage stage;
        Parent root;
        CircleOb ob = new CircleOb();
        stage = (Stage) NewGame.getScene().getWindow();
        System.out.println("Clicked");
//        FXMLLoader obj = new FXMLLoader(getClass().getResource("StartGame.fxml"));
        Scene scene = new Scene(ob.CircleOb(),800,400);
        scene.setFill(Paint.valueOf("#272727"));
        stage.setScene(scene);

        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
