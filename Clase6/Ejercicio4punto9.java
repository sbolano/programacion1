import java.util.Scanner;

public class Ejercicio4punto9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un ángulo en grados: ");
        double angulo = scanner.nextDouble();

        if (angulo < 0 || angulo > 180) {
            System.out.println("Ángulo inválido. Debe estar entre 0 y 180 grados.");
        } else if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else {
            System.out.println("El ángulo es obtuso.");
        }

        scanner.close();
    }
}
