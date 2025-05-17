package org.example;

import java.time.LocalDate;

public abstract class Viajero {

    String nombreUsuar;
    int numDoc;
    String email;
    int telefono;
    String preferencias;
    String metodoPago;
    int puntosFidelidad;
    LocalDate fechaRegistro;

    public Viajero() {
    }

    public Viajero(String nombreUsuar, int numDoc, String email, int telefono, String preferencias, String metodoPago, int puntosFidelidad, LocalDate fechaRegistro) {
        this.nombreUsuar = nombreUsuar;
        this.numDoc = numDoc;
        this.email = email;
        this.telefono = telefono;
        this.preferencias = preferencias;
        this.metodoPago = metodoPago;
        this.puntosFidelidad = puntosFidelidad;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombreUsuar() {
        return nombreUsuar;
    }

    public void setNombreUsuar(String nombreUsuar) {
        this.nombreUsuar = nombreUsuar;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(int puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public abstract void reservar (String metodoPago, int puntosFidelidad);

    public abstract double calcularDescuento (String metodoPago, int puntosFidelidad);
}
