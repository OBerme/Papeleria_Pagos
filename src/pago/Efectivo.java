package pago;

public class Efectivo implements Pago {
    @Override
    public void pagar() {
        System.out.println("Pagando en efectivo...");
        // Lógica específica de pago en efectivo
    }
}