package org.example;

import java.time.LocalDate;

public  class ViajeroNacional extends Viajero {

    private String departamento;
    private String ciudad;
    private String frecuencia;

    public ViajeroNacional() {
    }

    @Override
    public void reservar(String metodoPago, int puntosFidelidad) {

    }

    @Override
    public double calcularDescuento(String metodoPago, int puntosFidelidad) {
        return 0;
    }


    public ViajeroNacional(String nombreUsuar, int numDoc, String email, int telefono, String preferencias,
                           String metodoPago, int puntosFidelidad, LocalDate fechaRegistro, String departamento,
                           String ciudad, String frecuencia) {
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

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

}
