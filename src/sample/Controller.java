package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    @FXML
    public TextField textFieled;
    @FXML
    public TextArea winChat;
    @FXML
    public void clickSend(ActionEvent actionEvent) {
        winChat.appendText(textFieled.getText() + "\n");
        textFieled.clear();
        textFieled.requestFocus();
    }
}
