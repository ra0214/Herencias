package com.mendoza.gestortareas.controllers;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.mendoza.gestortareas.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TaskController {

    @FXML
    private BottomNavigationButton categorizedBtn;

    @FXML
    private Button salirBtn;

    @FXML
    private BottomNavigationButton tareaBtn;

    @FXML
    void OnMouseClickCategorizedBtn(MouseEvent event) {
        App.newStage("categorizedTask-view","App - View Task");
    }

    @FXML
    void OnMouseClickSalirBtn(MouseEvent event) {
        Stage stage = (Stage) salirBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickTareaBtn(MouseEvent event) {
        App.newStage("tareaAtrasada-view","App - View Task");
    }
}
