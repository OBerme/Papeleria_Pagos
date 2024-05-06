package main;

import pago.Pago;

public class Venta {
    private Pago pago;

    public Venta(Pago pago) {
        this.pago = pago;
    }

    public void realizarPago() {
        pago.pagar();
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
