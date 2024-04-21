package com.mendoza.gestortareas.controllers;

import com.mendoza.gestortareas.App;
import com.mendoza.gestortareas.models.TareaAtrasada;
import com.mendoza.gestortareas.models.TareaCategorizada;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class TareaAtrasadaController {

    @FXML
    private Button cerrarButton;

    @FXML
    private TextField descripcionTxt;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField prioridadTxt;

    @FXML
    private TextField retrasoTxt;

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
        ArrayList<TareaAtrasada> tareasAtrasada = App.getTarea().getListaAtrasada();

        String titulo = tituloTxt.getText();
        String descripcion = descripcionTxt.getText();
        String vencimiento = "";
        if (vencimientoTxt.getValue() != null) {
            vencimiento = vencimientoTxt.getValue().toString();
        }
        String prioridad = prioridadTxt.getText();
        String atraso = retrasoTxt.getText();

        TareaAtrasada tareaAtrasada = new TareaAtrasada(titulo,descripcion,vencimiento,prioridad,atraso);

        if (tareasAtrasada.add(tareaAtrasada)) {
            mostrarAlerta("Éxito", "Se ha agregado una nueva tarea con categoria.");

            System.out.println("Tarea categorizada agregada: ");
            System.out.println("Título: "+tareaAtrasada.getTitulo());
            System.out.println("Fecha de vencimiento: "+tareaAtrasada.getFechaVencimiento());
            System.out.println("Prioridad: "+tareaAtrasada.getPrioridad());
            System.out.println("Días con atraso: "+tareaAtrasada.getAtraso());
            System.out.println("Descripción: "+tareaAtrasada.getDescripcion());
        }
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
