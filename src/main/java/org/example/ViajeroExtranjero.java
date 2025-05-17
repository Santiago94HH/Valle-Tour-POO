package org.example;

import java.time.LocalDate;

public class ViajeroExtranjero extends Viajero {

    private String paisOrigen;
    private int numPasaporte;
    private String idioma;

    public ViajeroExtranjero() {
    }

    @Override
    public void reservar(String metodoPago, int puntosFidelidad) {

    }

    @Override
    public double calcularDescuento(String metodoPago, int puntosFidelidad) {
        return 0;
    }


    public ViajeroExtranjero(String nombreUsuar, int numDoc, String email, int telefono, String preferencias,
                             String metodoPago, int puntosFidelidad, LocalDate fechaRegistro, String paisOrigen,
                             int numPasaporte, String idioma) {
        super(nombreUsuar, numDoc, email, telefono, preferencias, metodoPago, puntosFidelidad, fechaRegistro);
        this.paisOrigen = paisOrigen;
        this.numPasaporte = numPasaporte;
        this.idioma = idioma;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
