import java.util.Scanner;

public class Ejercicio4punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 != 0 && numero2 % numero1 == 0) {
            System.out.println(numero1 + " es divisor de " + numero2);
        } else if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println(numero2 + " es divisor de " + numero1);
        } else {
            System.out.println("Ninguno de los dos números es divisor del otro.");
        }

        scanner.close();
    }
}
