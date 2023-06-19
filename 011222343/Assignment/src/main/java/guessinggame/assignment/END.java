package guessinggame.assignment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class END implements Initializable {

    @FXML
    private Label Label2;
    public  static  Label static_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        static_label= Label2;

    }
}