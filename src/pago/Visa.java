package pago;
public class Visa implements Pago {
    @Override
    public void pagar() {
        System.out.println("Pagando con Visa...");
        // Lógica específica de pago con Visa
    }
}