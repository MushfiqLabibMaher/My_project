package guessinggame.assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MAIN extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MAIN.class.getResource("Gamecontroller.fxml"));
        Scene s1 = new Scene(fxmlLoader.load());
        stage.setTitle("Guess the Number");
        stage.setScene(s1);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
