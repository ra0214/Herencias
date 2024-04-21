package com.mendoza.gestortareas.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.mendoza.gestortareas.models.TareaCategorizada;
import javafx.scene.control.*;

import com.mendoza.gestortareas.App;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class CategorizedTaskController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField categoriaTxt;

    @FXML
    private Button cerrarButton;

    @FXML
    private TextField creacionTxt;

    @FXML
    private TextField descripcionTxt;

    @FXML
    private Label confirmationLabel;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField prioridadTxt;

    @FXML
    private TextField tituloTxt;

    @FXML
    private DatePicker vencimientoTxt;

    @FXML
    void onClickCerrarButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event) {
        ArrayList<TareaCategorizada> tareasCategorizadas = App.getTarea().getListaCategorizada();

        String titulo = tituloTxt.getText();
        String descripcion = descripcionTxt.getText();
        String vencimiento = "";
        if (vencimientoTxt.getValue() != null) {
            vencimiento = vencimientoTxt.getValue().toString();
        }
        String prioridad = prioridadTxt.getText();
        String categoria = categoriaTxt.getText();

        TareaCategorizada tareaCategorizada = new TareaCategorizada(titulo,descripcion,vencimiento,prioridad,categoria);

        if (tareasCategorizadas.add(tareaCategorizada)) {
            mostrarAlerta("Éxito", "Se ha agregado una nueva tarea con categoria.");

            System.out.println("Tarea categorizada agregada: ");
            System.out.println("Título: "+tareaCategorizada.getTitulo());
            System.out.println("Fecha de vencimiento: "+tareaCategorizada.getFechaVencimiento());
            System.out.println("Prioridad: "+tareaCategorizada.getPrioridad());
            System.out.println("Categoría: "+tareaCategorizada.getCategoria());
            System.out.println("Descripción: "+tareaCategorizada.getDescripcion());
        }
    }

    @FXML
    void initialize() {
        cerrarButton.getStyleClass().setAll("btn", "btn-success");
        cerrarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");

        guardarButton.getStyleClass().setAll("btn", "btn-success");
        guardarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}