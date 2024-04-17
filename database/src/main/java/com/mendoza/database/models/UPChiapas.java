package com.mendoza.database.models;

import java.util.ArrayList;

public class UPChiapas {
    private ICRUD crud;

    public UPChiapas(ICRUD crud) {
        this.crud = crud;
    }

    public void agregarEstudiante(int id, String nombre, String apellido, int edad){
        Student student = new Student(nombre, apellido,edad, id);
        crud.guardarStudent(student);
    }

    public void actualizarEstudiante(String nombre, String apellido, int id, int edad) {
        Student student = new Student(nombre, apellido, edad, id);
        crud.actualizarStudent(student);
    }
}
