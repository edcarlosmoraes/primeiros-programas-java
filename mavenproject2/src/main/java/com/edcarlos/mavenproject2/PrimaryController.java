package com.edcarlos.mavenproject2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    
    @FXML
    private Label lblMensagem;
    private Button btnClick;

    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá; Mundo!");
    }
}
