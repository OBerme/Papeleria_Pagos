package pago;

public class PayPal implements Pago {
    @Override
    public void pagar() {
        System.out.println("Pagando con PayPal...");
        // Lógica específica de pago con PayPal
    }
}