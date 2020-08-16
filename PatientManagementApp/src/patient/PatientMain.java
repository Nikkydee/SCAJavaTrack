package patient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class PatientMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        primaryStage.setTitle("patient App");
        primaryStage.setScene(new Scene (root, 800, 600));
        primaryStage.show();



}

    public static void main(String[] args) {
        launch(args);
    }








    }



