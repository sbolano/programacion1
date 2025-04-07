/*
 * Pseudocodigo
 * Programa que seleccione la operacion aritmetica
 * var
 *  entero: nota
 * inicio
 * Escribir "Introduce el primer número: "
 *  Leer numero1
 * Escribir "Introduce el segundo número: "
 *  Leer numero2
 * Escribir "selecciona la operacion (1: suma, 2: resta, 3: multiplicacion, 4: division):"
 * Leer sleccionOp
 * 
 * Segun seleccionOp hacer
 *     Caso 1:
 *       resultado = numero1 + numero2
 *     Caso 2:
 *       resultado = numero1 - numero2
 *     Caso 3:
 *       resultado = numero1 * numero2
 *     Caso 4:
 *       resiltado = numero1 / numero2
 * Fin 
 */

 import java.util.Scanner;

public class Ejercicio411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;
        int seleccionOp;
        
        System.out.print("Introduce el primer número: ");
        numero1 = scanner.nextDouble(); 

        System.out.print("Introduce el segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Selecciona la operación (1: Suma, 2: Resta, 3: Multiplicación, 4: División): ");
        seleccionOp = scanner.nextInt();

        switch (seleccionOp) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2: 
                resultado = numero1 - numero2;  
                System.out.println("El resultado de la resta es: " + resultado);
                break;    
            case 3:
                resultado = numero1 * numero2;  
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;    
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;  
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Error: Operación no válida.");
        }

        
        scanner.close();
    }
}
