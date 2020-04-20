package mediator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MediatorApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MediatorFrame.fxml"));

        Scene scene = new Scene(root, 500, 275);

        primaryStage.setTitle("Mediator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
