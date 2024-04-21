package com.mendoza.gestortareas.models;

import java.util.ArrayList;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String fechaVencimiento;
    private String prioridad;

    private ArrayList<TareaCategorizada> listaCategorizada;
    private ArrayList<TareaAtrasada> listaAtrasada;

    public Tarea() {
        listaCategorizada = new ArrayList<>();
        listaAtrasada = new ArrayList<>();
    }

    public ArrayList<TareaAtrasada> getListaAtrasada() {
        return listaAtrasada;
    }
    public ArrayList<TareaCategorizada> getListaCategorizada() {
        return listaCategorizada;
    }

    public Tarea(String titulo, String descripcion, String fechaVencimiento, String prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
