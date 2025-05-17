package org.example;

public interface iMetodopago {
    double convertirMoneda (double monto, String monedaDestino);
    String getTipoPago();
    boolean validarMoneda (String moneda);

}
