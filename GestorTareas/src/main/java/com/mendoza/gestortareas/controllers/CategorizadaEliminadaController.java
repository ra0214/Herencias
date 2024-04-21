package com.mendoza.gestortareas.controllers;

import com.mendoza.gestortareas.App;
import com.mendoza.gestortareas.models.TareaCategorizada;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class CategorizadaEliminadaController {

    @FXML
    private Button eliminarBtn;

    @FXML
    private Button salirBtn;

    @FXML
    private TextField tituloTxt;

    @FXML
    void OnMouseClickEliminarBtn(MouseEvent event) {
        String titulo = tituloTxt.getText();

        ArrayList<TareaCategorizada> listaCategorizada = App.getTarea().getListaCategorizada();

        TareaCategorizada tareaEliminada = null;
        for (TareaCategorizada tareaCategorizada : listaCategorizada) {
            if (tareaCategorizada.getTitulo().equals(titulo)) {
                tareaEliminada = tareaCategorizada;
                break;
            }
        }

        if (tareaEliminada != null) {
            listaCategorizada.remove(tareaEliminada);
            mostrarAlerta("Éxito", "Se ha eliminado la tarea correctamente.");
        } else {
            mostrarAlerta("Error", "No se encontró ninguna tarea con ese titulo.");
        }
    }

    @FXML
    void OnMouseClickSalirBtn(MouseEvent event) {
        App.getStageView().close();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
