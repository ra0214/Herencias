package com.mendoza.database.models;

import java.util.Objects;

public class Student {
    private String nombre;
    private String apellido;
    private int edad;
    private int id;

    private ICRUD crud;

    public Student(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object c) {
        if (this==c) return true;
        if (c==null || getClass() !=c.getClass())return false;
        Student student = (Student) c;
        return id == student.id && Objects.equals(nombre, student.nombre) && Objects.equals(apellido, student.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, id);
    }
}
