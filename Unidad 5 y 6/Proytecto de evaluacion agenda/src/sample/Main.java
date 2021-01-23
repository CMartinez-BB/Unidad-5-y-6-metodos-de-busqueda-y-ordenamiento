package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
public static  Stage stage;
public static String DatosUsuarios="";
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Agenda Técnologico 2020-2021");
        primaryStage.setScene(new Scene(root, 920, 499));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
