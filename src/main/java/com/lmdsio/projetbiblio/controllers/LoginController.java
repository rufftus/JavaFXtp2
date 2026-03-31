package com.lmdsio.projetbiblio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML
    private Label loginText;
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private void onLoginClick(){
        String login = loginField.getText();
        String password = passwordField.getText();
        if(password.equals("mdp")){
            loginText.setText("Hello "+login+" !");
            loginText.setStyle("-fx-text-fill: green");
        }
        else {
        loginText.setText("identifiants incorrects !");
        loginText.setStyle("-fx-text-fill: red");
        }

    }
}
