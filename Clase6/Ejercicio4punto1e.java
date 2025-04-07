import java.util.Scanner;
 
public class Ejercicio4punto1e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de distancia: ");
        double distancia = scanner.nextDouble();
 
        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingrese el valor de tiempo: ");
            double tiempo = scanner.nextDouble();
 
            System.out.println("El valor de tiempo es: " + tiempo);
        } else {
            System.out.println("La distancia no está entre 20 y 35.");
        }
 
        scanner.close();
    }
}
 