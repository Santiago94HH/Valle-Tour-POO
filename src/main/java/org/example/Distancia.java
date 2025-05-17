package org.example;

public class Distancia extends Destino {

    private double kilometros;
    private double tiempoRecorr;
    private String medioTranspor;

    public Distancia() {
    }

    @Override
    public String explorar(String descrpicion, String clima, String actividades, String mejorEpocaVisita) {
        return "";
    }


    public Distancia(int codigo, String nombreDes, String decrpicion, String clima, String actividades, String mejorEpocaVisita, double tiempoRecorr, double kilometros, String medioTranspor) {
        super(codigo, nombreDes, decrpicion, clima, actividades, mejorEpocaVisita);
        this.tiempoRecorr = tiempoRecorr;
        this.kilometros = kilometros;
        this.medioTranspor = medioTranspor;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getTiempoRecorr() {
        return tiempoRecorr;
    }

    public void setTiempoRecorr(double tiempoRecorr) {
        this.tiempoRecorr = tiempoRecorr;
    }

    public String getMedioTranspor() {
        return medioTranspor;
    }

    public void setMedioTranspor(String medioTranspor) {
        this.medioTranspor = medioTranspor;
    }
}
