package com.lmdsio.projetbiblio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AboutController {
    @FXML
    private Label textAbout;

    @FXML
    private void aproposClick(){
        textAbout.setText("K.Ilker - BTS SIO - La martiniere duchere");
        textAbout.setStyle("-fx-text-fill: black");
    }

}
