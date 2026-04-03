package com.lmdsio.projetbiblio.controllers;

import com.lmdsio.projetbiblio.BiblioApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import com.lmdsio.projetbiblio.services.UtilisateurService;

public class LoginController extends MasterController{
    @FXML
    private Label loginText;
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label textBienvenue;


    @FXML
    private ScrollPane contentPane;


    @FXML
    private void onLoginClick(){
        String login = loginField.getText();
        String password = passwordField.getText();

        UtilisateurService service= new UtilisateurService();
        try{
            if(service.signIn(login,password)){
                showContent("welcome");
                textBienvenue.setText("Hello "+service.getUser().getLogin()+" !");
                textBienvenue.setStyle("-fx-text-fill: green");
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
