package guessinggame.assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;


public class Gamecontroller extends END  {


    int number;

    String name="";

    @FXML
    private Label Label2;

    @FXML
    private Label Label1;

    @FXML
    private Label attemptcount;

    @FXML
    private Text attemptstext;

    @FXML
    private Circle b1;

    @FXML
    private Circle b2;

    @FXML
    private Circle b3;

    @FXML
    private Text genaratetext;

    @FXML
    private Button genaretedbutton;

    @FXML
    private Button namebutton;

    @FXML
    private TextField namefield;

    @FXML
    private Text nametext;

    private  int a=2;

    @FXML
    void b1clicked(MouseEvent event) throws IOException {
        try {
            int b1 = 1;

            if (a == 2) {
                attemptcount.setText("1");
                a--;
            } else {
                attemptcount.setText("0");
                a--;
            }

            if (b1 == number) {


                Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("END.fxml")));
                Scene scene2 = new Scene(parent);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
                static_label.setText(name + " YOU WIN");


            } else {


                if (a == 0) {
                    Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("END.fxml")));
                    Scene scene2 = new Scene(parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(scene2);
                    window.show();
                    static_label.setText(name + " YOU LOST");


                }
            }
            }

        catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void b2clicked(MouseEvent event) throws IOException {
        try {
            int b2 = 2;

            if (a == 2) {
                attemptcount.setText("1");
                a--;
            } else {

                attemptcount.setText("0");
                a--;

            }

            if (b2 == number) {
                Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("END.fxml")));
                Scene scene2 = new Scene(parent);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
                static_label.setText(name + " YOU WIN");
            } else {


                if (a == 0) {
                    Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("END.fxml")));
                    Scene scene2 = new Scene(parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(scene2);
                    window.show();
                    static_label.setText(name + " YOU LOST");


                }
            }
        }
        catch (Exception cr){
            cr.printStackTrace();
        }

    }

    @FXML
    void b3clicked(MouseEvent event) throws IOException {
        try{
            int b3 = 3;
            if (a == 2) {
                attemptcount.setText("1");
                a--;
            } else {
                attemptcount.setText("0");
                a--;
            }

            if (b3 == number) {
                Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("END.fxml")));
                Scene scene2 = new Scene(parent);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
                static_label.setText(name + " YOU WIN");
            }
            else {


                if (a == 0) {
                    Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("END.fxml")));
                    Scene scene2 = new Scene(parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(scene2);
                    window.show();
                    static_label.setText(name + " YOU LOST");


                }
            }
        }
        catch (Exception ab){
            ab.printStackTrace();
        }



    }

    @FXML
    void genaratedclick(MouseEvent event)  {

        Random random =new Random();

        number=random.nextInt(1,4);
        Label1.setText("Your Number is Generated. Guess the Number and Select the Proper Circle.");
        System.out.println("FOR TEST GENARETED NUMBER IS: "+number);

    }

    @FXML
    void namesave(ActionEvent event) {

        name= namefield.getText();


    }

}