module guessinggame.assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens guessinggame.assignment to javafx.fxml;
    exports guessinggame.assignment;
}