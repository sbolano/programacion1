public class EjecutarContadorDigitos {
    public static void main(String[] args) {
        // Escenario 1
        System.out.println("--- Escenario 1 ---");
        int numero1 = 6785;
        ContadorDigitosPares contador1 = new ContadorDigitosPares();
        System.out.println("Número: " + numero1);
        System.out.println("Cantidad de dígitos pares: " + contador1.contarDigitosPares());
    }
}