package Opercionesmatematicas_POO;

public class CalculadoraApp {
    public static void main(String[] args) {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        double num1 = 100;
        double num2 = 55;

        System.out.println("Suma: " + operaciones.sumar(num1, num2));
        System.out.println("Resta: " + operaciones.restar(num1, num2));
        System.out.println("Multiplicación: " + operaciones.multiplicar(num1, num2));
        System.out.println("División: " + operaciones.dividir(num1, num2));
    }
}

