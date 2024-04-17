package com.mendoza.database.controllers;

import com.mendoza.database.models.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CrearController {

    @FXML
    private Button agregarBtn;

    @FXML
    private TextField apellidoTxt;

    @FXML
    private TextField edadTxt;

    @FXML
    private TextField idTxt;

    @FXML
    private TextField nomTxt;

    private Student student;
    private ArrayList<ICRUD> baseDatos;

    public void initialize() {
        baseDatos = new ArrayList<>();
        baseDatos.add(new BaseDeDatos1());
        baseDatos.add(new BaseDeDatos2());
        baseDatos.add(new BaseDeDatos3());
    }

    public void initAtributos(Student student) {
        this.student = student;

        if (student != null) {
            nomTxt.setText(student.getNombre());
            apellidoTxt.setText(student.getApellido());
            edadTxt.setText(String.valueOf(student.getEdad()));
            idTxt.setText(String.valueOf(student.getId()));
        }
    }

    @FXML
    void OnActionAgregarBtn(ActionEvent event) {
        try {
            String nombre = nomTxt.getText();
            String apellidos = apellidoTxt.getText();
            int edad = Integer.parseInt(edadTxt.getText());
            int id = Integer.parseInt(idTxt.getText());

            Student nuevoStudent = new Student(nombre,apellidos,edad,id);

            boolean exists = false;

            for (ICRUD baseDato : baseDatos) {
                if (baseDato.getStudents().contains(nuevoStudent)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                if (student != null) {
                    student.setNombre(nombre);
                    student.setApellido(apellidos);
                    student.setEdad(edad);
                    student.setId(id);
                    for (ICRUD baseDato : baseDatos) {
                        baseDato.guardarStudent(student);
                    }
                } else {
                    student = nuevoStudent;
                    for (ICRUD baseDato : baseDatos) {
                        baseDato.guardarStudent(student);
                    }
                }
                cerrar();
            } else {
                mostrarAlerta("La tarea ya existe en una de las bases de datos.");
            }
        } catch (NumberFormatException e) {
            mostrarAlerta("El ID debe ser un número entero.");
        }
    }

    private void cerrar() {
        Stage stage = (Stage) agregarBtn.getScene().getWindow();
        stage.close();
    }
    public void initAttributes(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    private void mostrarAlerta(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
