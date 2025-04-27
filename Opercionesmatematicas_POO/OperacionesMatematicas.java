package Opercionesmatematicas_POO;

public class OperacionesMatematicas {
    
    // Suma
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplicacion 
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Division 
    public double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}

