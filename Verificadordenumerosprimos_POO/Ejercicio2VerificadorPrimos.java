package Verificadordenumerosprimos_POO;

public class Ejercicio2VerificadorPrimos {
    private int inicio;
    private int fin;


    public Ejercicio2VerificadorPrimos(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }


    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { 
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public void contarPrimos() {
        int contador = 0;
        for (int num = inicio; num <= fin; num++) {
            if (esPrimo(num)) { 
                System.out.println(num + " es primo");
                contador++;
            } else {
                System.out.println(num + " no es primo");
            }
        }
        System.out.println("Cantidad de números primos entre " + inicio + " y " + fin + ": " + contador);
    }

    
    public static void main(String[] args) {
        Ejercicio2VerificadorPrimos verificador = new Ejercicio2VerificadorPrimos(20, 30);
        verificador.contarPrimos();
    }
}
