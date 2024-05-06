package main;

import pago.*;

public class Main {
    public static void main(String[] args) {
        Venta venta = new Venta(new Visa());
        venta.realizarPago();

        // Cambiar método de pago a PayPal
        venta.setPago(new PayPal());
        venta.realizarPago();

        // Cambiar método de pago a Efectivo
        venta.setPago(new Efectivo());
        venta.realizarPago();

        // Cambiar método de pago a Bizum
        venta.setPago(new Bizum());
        venta.realizarPago();
    }
}
