package org.example;

public class Costo extends Destino  {

    private String temporada;
    private int cantidPersona;
    private String tipoPaquete;

    public Costo() {
    }

    @Override
    public String explorar(String descrpicion, String clima, String actividades, String mejorEpocaVisita) {
        return "";
    }


    public Costo(int codigo, String nombreDes, String decrpicion, String clima, String actividades, String mejorEpocaVisita, int cantidPersona, String tipoPaquete, String temporada) {
        super(codigo, nombreDes, decrpicion, clima, actividades, mejorEpocaVisita);
        this.cantidPersona = cantidPersona;
        this.tipoPaquete = tipoPaquete;
        this.temporada = temporada;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getCantidPersona() {
        return cantidPersona;
    }

    public void setCantidPersona(int cantidPersona) {
        this.cantidPersona = cantidPersona;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }
}
