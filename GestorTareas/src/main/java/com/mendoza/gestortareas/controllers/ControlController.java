package com.mendoza.gestortareas.controllers;

import javafx.application.Platform;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.mendoza.gestortareas.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ControlController {

    @FXML
    private BottomNavigationButton bookButton;

    @FXML
    private Button cerrarButton;

    @FXML
    private BottomNavigationButton eliminarButton;


    @FXML
    void onClickBookButton(MouseEvent event) {
        App.newStage("task-view","App - View Task");
    }

    @FXML
    void onClickEliminarButton(MouseEvent event) {
        App.newStage("eliminarTareas-view", "App - View Categoria");
    }
    @FXML
    void onClickCerrarButton(MouseEvent event) {
        Platform.exit();
    }
}
