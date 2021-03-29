package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    String name;

    @FXML
    TextArea namesArea;

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;


    @FXML
    void sendMsg() {
        if (!textField.getText().isEmpty()) {
            if (textField.getText(0, 1).contains("@")) {
                this.name = textField.getText(1, textField.getLength());
                namesArea.appendText("\n" + textField.getText(1, textField.getLength()));
                textField.clear();
                textField.requestFocus();
            } else {
                textArea.appendText("" + name + " say: " + textField.getText() + "\n");
                textField.clear();
                textField.requestFocus();
            }
        }

        textField.requestFocus();
    }
}

