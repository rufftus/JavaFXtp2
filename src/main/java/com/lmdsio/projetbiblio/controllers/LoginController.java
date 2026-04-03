package com.lmdsio.projetbiblio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import com.lmdsio.projetbiblio.services.UtilisateurService;

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

        UtilisateurService service= new UtilisateurService();
        try{
            if(service.signIn(login,password)){
                loginText.setText("Hello "+service.getUser().getLogin()+" !");
                loginText.setStyle("-fx-text-fill: green");
            } else{
                loginText.setText("identifants incorrects !");
                loginText.setStyle("-fx-text-fill: red");
            }

        }
        catch (Exception e){
            loginText.setText(e.getMessage());
            loginText.setStyle("-fx-text-fill: orange");
        }

    }
}
