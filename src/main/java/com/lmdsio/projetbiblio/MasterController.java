package com.lmdsio.projetbiblio;

import com.lmdsio.projetbiblio.BiblioApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;

public class MasterController {

    @FXML
    private ScrollPane contentPane;

    protected void showContent(String fxmlName){
        Node contentNode;
        try {
            FXMLLoader fxmlLoader =
                    new FXMLLoader(BiblioApplication.class.getResource("views/"+fxmlName+".fxml"));
            contentNode=fxmlLoader.load();
        } catch (Exception e) {
            contentNode=null;
        }
        contentPane.setContent(contentNode);
    }

}