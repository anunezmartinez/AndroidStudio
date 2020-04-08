package com.example.listview_personalizadp;

class Averias {

    private String titulo;
    private String modeloCoche;
    private int numeroPresupuesto;

    public Averias(){

    }

    public Averias(String titulo, String modeloCoche, int numeroPresupuesto) {
        this.titulo = titulo;
        this.modeloCoche = modeloCoche;
        this.numeroPresupuesto = numeroPresupuesto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public int getNumeroPresupuesto() {
        return numeroPresupuesto;
    }

    public void setNumeroPresupuesto(int numeroPresupuesto) {
        this.numeroPresupuesto = numeroPresupuesto;
    }
}
