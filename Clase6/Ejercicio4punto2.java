import java.util.Scanner;
 
public class Ejercicio4punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
 
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
 
        if (numero1 > numero2) {
            System.out.println("El primer número es el mayor.");
        } else if (numero1 < numero2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
 
        scanner.close();
    }
}
 