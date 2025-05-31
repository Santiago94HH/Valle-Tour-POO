package org.example;

import java.time.LocalDate;

public class ViajeroExtranjero extends Viajero {

    private String paisOrigen;
    private String numPasaporte;
    private String idioma;

    public ViajeroExtranjero() {
    }

    @Override
    public void reservar(String metodoPago, int puntosFidelidad) {
        double valorBase = 1500.0;
        double descuento = (puntosFidelidad >=5) ? 100.0 : 0.0;
        double total = valorBase - descuento;

            if (numPasaporte == null || numPasaporte.length() < 6){ //Evalúa si al menos una de las dos condciones es verdadera
                System.out.println("Número de pasaporte inválido.");
                return; //usa return para salir del metodo sin continuar
            }
            if (!metodoPago.equalsIgnoreCase("tarjeta") && !metodoPago.equalsIgnoreCase("paypal")){
                System.out.println("metodo de pago no aceptado.");
                return; //detiene el metodo en ese punto
            }
            System.out.println("Reserva confirmada para viajero de " + paisOrigen + ". Total: $ " + total);
    }

    @Override
    public double calcularDescuento(String metodoPago, int puntosFidelidad) {
        double valorBaseDelViaje = 1500.0;
        double porcentajeDescuento;

        //porcentaje según país de origen
        switch (paisOrigen.toLowerCase()) {
            case "estados unidos":
                porcentajeDescuento = 0.10;
                break;
            case "panama":
                porcentajeDescuento = 0.07;
                break;
            case "republica dominicana":
                porcentajeDescuento = 0.05;
            default:
                porcentajeDescuento = 0.03;
                break;
        }
            double descuento = valorBaseDelViaje * porcentajeDescuento;
            return Math.min(descuento, valorBaseDelViaje);
    }


    public ViajeroExtranjero(String nombreUsuar, int numDoc, String email, int telefono, String preferencias,
                             String metodoPago, int puntosFidelidad, LocalDate fechaRegistro, String paisOrigen,
                             String numPasaporte, String idioma) {
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

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
