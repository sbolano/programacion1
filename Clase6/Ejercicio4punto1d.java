import java.util.Scanner;
 
public class Ejercicio4punto1d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();
 
        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();
 
        System.out.print("Ingrese el valor de z: ");
        int z = scanner.nextInt();
 
        if (x > y && (y * z) < 20) {
            System.out.print("Ingrese el valor de p: ");
            int p = scanner.nextInt();
 
            System.out.println("El valor de p es: " + p);
        } else {
            System.out.println("Las condiciones no se cumplen.");
        }
 
        scanner.close();
    }
}