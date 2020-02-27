package XO;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        /*Field field = new Field();
        field.print();
        field.toggleTiles(3);  //12
        field.print();
        field.toggleTiles(0);
        field.print();
        field.toggleTiles(12); // 3
        field.print();
        field.toggleTiles(15);
        field.print();*/
        launch(args);


    }
}
