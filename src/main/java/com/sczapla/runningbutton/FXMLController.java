package com.sczapla.runningbutton;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {

    @FXML
    private Button button;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onMouseEntered(MouseEvent event) {
         Random r = new Random();
        button.setLayoutX(r.nextDouble() * 700);
        button.setLayoutY(r.nextDouble() * 700);
    }
}
