package org.example;

import java.time.LocalDate;

public  class ViajeroNacional extends Viajero {

    private String departamento;
    private String ciudad;
    private int frecuencia;

    public ViajeroNacional() {
    }

    @Override
    public void reservar(String metodoPago, int puntosFidelidad) {
        System.out.println("Estamos iniciando tu reserva");

        if (this.frecuencia < 10) {
            System.out.println("Puntos de fidelidad no disponibles. Necesita al menos 10 reservas previas.");
            puntosFidelidad = 0;
        } else if (puntosFidelidad > 0) {
            System.out.println("aplicando" + puntosFidelidad + "puntos de fidelidad");
        }else {
            System.out.println("No se han aplicado puntos de fidelidad");
        }

    }

    @Override
    public double calcularDescuento(String metodoPago, int puntosFidelidad) {
        double valorBaseDelViaje = 1000.0; //Ejemplo fijado en 100
            double descuentoPuntos = (this.frecuencia >=10) ? puntosFidelidad * 1.0 : 0.0; //cada punto de fidelidad vale 1 - 0.0 si no cumple la condición
            double descuentoMetodo = metodoPago.equalsIgnoreCase("tarjeta") ? valorBaseDelViaje * 0.05 : 0.0; //aplica un descuento del 5% de valor de viaje - Si pago con tarjeta descuento el 5% de 1000.0

            double descuenTotal = descuentoPuntos + descuentoMetodo; //suma los dos tipos de descuento fidelidad y metodo de pago

            return Math.min(descuenTotal, valorBaseDelViaje); //devuelve el mínimo entre a y b
    }


    public ViajeroNacional(String nombreUsuar, int numDoc, String email, int telefono, String preferencias,
                           String metodoPago, int puntosFidelidad, LocalDate fechaRegistro, String departamento,
                           String ciudad, int frecuencia) {
        super(nombreUsuar, numDoc, email, telefono, preferencias, metodoPago, puntosFidelidad, fechaRegistro);
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.frecuencia = frecuencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

}
