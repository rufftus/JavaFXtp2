module com.lmdsio.projetbiblio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lmdsio.projetbiblio to javafx.fxml;
    exports com.lmdsio.projetbiblio;
    exports com.lmdsio.projetbiblio.controllers;
    opens com.lmdsio.projetbiblio.controllers to javafx.fxml;
}