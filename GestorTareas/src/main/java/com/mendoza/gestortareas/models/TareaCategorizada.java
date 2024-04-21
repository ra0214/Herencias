package com.mendoza.gestortareas.models;

import java.time.LocalDateTime;

public class TareaCategorizada extends Tarea{
    private String categoria;

    public TareaCategorizada(String titulo, String descripcion, String fechaVencimiento, String prioridad, String categoria) {
        super(titulo, descripcion, fechaVencimiento, prioridad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
