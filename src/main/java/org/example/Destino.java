package org.example;

public abstract class Destino {

    int codigo;
    String nombreDes;
    String descrpicion;
    String clima;
    String actividades;
    String mejorEpocaVisita;

    public Destino() {
    }

    public Destino(int codigo, String nombreDes, String decrpicion, String clima, String actividades, String mejorEpocaVisita) {
        this.codigo = codigo;
        this.nombreDes = nombreDes;
        this.descrpicion = decrpicion;
        this.clima = clima;
        this.actividades = actividades;
        this.mejorEpocaVisita = mejorEpocaVisita;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDes() {
        return nombreDes;
    }

    public void setNombreDes(String nombreDes) {
        this.nombreDes = nombreDes;
    }

    public String getDecrpicion() {
        return descrpicion;
    }

    public void setDecrpicion(String decrpicion) {
        this.descrpicion = decrpicion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getMejorEpocaVisita() {
        return mejorEpocaVisita;
    }

    public void setMejorEpocaVisita(String mejorEpocaVisita) {
        this.mejorEpocaVisita = mejorEpocaVisita;
    }

    public abstract String explorar (String descrpicion, String clima, String actividades, String mejorEpocaVisita);
}
