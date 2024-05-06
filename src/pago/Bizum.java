package pago;

public class Bizum implements Pago {
    @Override
    public void pagar() {
        System.out.println("Pagando con Bizum...");
        // Lógica específica de pago con Bizum
    }
}