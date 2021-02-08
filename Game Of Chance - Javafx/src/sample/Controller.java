package sample;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Button submit;
    @FXML
    Button startOver;
    @FXML
    Label chances;
    @FXML
    TextField textBox;
    @FXML
    Label Wins;

    int randomNum;
    int life = 3;
    Alert info = new Alert(Alert.AlertType.INFORMATION);
    int wins = 0;

    public Controller() {
        rand();
    }

    public void rand() {
        randomNum = new Random().nextInt((10 - 1) + 1) + 1;
    }

    public void submitAnswer() {
        life--;
        String userGuess = textBox.getText();
        int number = Integer.parseInt(userGuess);
        labelChange();
        winsChange();
        if (life >= 0) {
            if (number == randomNum) {
                info.setTitle("Congratulations");
                info.setHeaderText("You Won, Good Guess");
                info.setContentText("");
                info.show();
            } else if (number > randomNum) {
                info.setTitle("HINT");
                info.setHeaderText("The Number Is Less Than " + number);
                info.setContentText("");
                info.show();
            } else {
                info.setTitle("HINT");
                info.setHeaderText("The Number Is Greater Than " + number);
                info.setContentText("");
                info.show();
            }
        }
        if (number == randomNum){
            startOver();
            wins++;
        }
        else if (life == 0) {
            info.setTitle("Sorry");
            info.setHeaderText("You Lost");
            info.setContentText("");
            info.show();
            startOver();
        }
    }
    public void startOver() {
        rand();
        life = 3;
        labelChange();
    }
    public void labelChange() {
        chances.setText("You Have " + life + " Chances Left");
        textBox.setText("");
    }
    public void winsChange() {
        Wins.setText("Wins: " + wins);
        textBox.setText("");
    }

}


