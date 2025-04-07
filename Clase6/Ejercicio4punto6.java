import java.util.Scanner;

public class Ejercicio4punto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos alumnos deseas ingresar? ");
        int totalAlumnos = scanner.nextInt();

        int menosDe40 = 0;
        int entre40y50 = 0;
        int entre50y60 = 0;
        int masOigual60 = 0;

        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.print("Introduce el peso del alumno " + i + " (en kg): ");
            double peso = scanner.nextDouble();

            if (peso < 40) {
                menosDe40++;
            } else if (peso >= 40 && peso <= 50) {
                entre40y50++;
            } else if (peso > 50 && peso < 60) {
                entre50y60++;
            } else {
                masOigual60++;
            }
        }

        System.out.println("\nEstadísticas de peso:");
        System.out.println("Alumnos con menos de 40 kg: " + menosDe40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos de más de 50 kg y menos de 60 kg: " + entre50y60);
        System.out.println("Alumnos con 60 kg o más: " + masOigual60);

        scanner.close();
    }
}
