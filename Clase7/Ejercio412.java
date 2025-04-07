import java.util.Scanner;

public class Ejercio412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecciona una operación:");
        System.out.println("1: Sumar");
        System.out.println("2: Multiplicar");
        System.out.println("3: Dividir (primer número entre segundo)");
        System.out.print("Introduce el código de selección: ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                double suma = numero1 + numero2;
                System.out.println("Resultado de la suma: " + suma);
                break;
            case 2:
                double multiplicacion = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + multiplicacion);
                break;
            case 3:
                if (numero2 != 0) {
                    double division = numero1 / numero2;
                    System.out.println("Resultado de la división: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Código inválido. Debes ingresar 1, 2 o 3.");
        }

        scanner.close();
    }
}
