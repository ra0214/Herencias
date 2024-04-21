package com.mendoza.gestortareas.models;

public class TareaAtrasada extends Tarea {
    public String atraso;

    public TareaAtrasada(String titulo, String descripcion, String fechaVencimiento, String prioridad, String atraso) {
        super(titulo, descripcion, fechaVencimiento, prioridad);
        this.atraso = atraso;
    }

    public String getAtraso() {
        return atraso;
    }

    public void setAtraso(String atraso) {
        this.atraso = atraso;
    }
}
