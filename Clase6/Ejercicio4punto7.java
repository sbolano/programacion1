import java.util.Scanner;

public class Ejercicio4punto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = scanner.nextInt();

        int central;

        if ((a > b && a < c) || (a < b && a > c)) {
            central = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            central = b;
        } else {
            central = c;
        }

        System.out.println("El número central es: " + central);

        scanner.close();
    }
}

