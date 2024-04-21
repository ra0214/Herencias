package com.mendoza.gestortareas.controllers;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.mendoza.gestortareas.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class EliminarTareasController {

    @FXML
    private BottomNavigationButton atrasadasButton;

    @FXML
    private Button cerrarButton;

    @FXML
    private BottomNavigationButton eliminarButton;

    @FXML
    void onClickAtrasadasButton(MouseEvent event) {
        App.newStage("atrasadaEliminada-view","App - View Task");
    }

    @FXML
    void onClickCerrarButton(MouseEvent event) {
        Stage stage = (Stage) cerrarButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickEliminarButton(MouseEvent event) {
        App.newStage("categorizadaEliminada-view","App - View Task");
    }

}
