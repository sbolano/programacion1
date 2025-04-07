import java.util.Scanner;

public class Ejercicio4punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Método 1: El número es par.");
        } else {
            System.out.println("Método 1: El número es impar.");
        }

        int mitad = numero / 2;
        if (mitad * 2 == numero) {
            System.out.println("Método 2: El número es par.");
        } else {
            System.out.println("Método 2: El número es impar.");
        }

        if ((numero & 1) == 0) {
            System.out.println("Método 3: El número es par.");
        } else {
            System.out.println("Método 3: El número es impar.");
        }

        scanner.close();
    }
}
