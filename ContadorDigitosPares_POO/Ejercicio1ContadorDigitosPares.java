public class Ejercicio1ContadorDigitosPares{
    private int numero;
 
    // Constructor: 
    public Ejercicio1ContadorDigitosPares(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número debe ser un entero positivo.");
        }
        this.numero = numero;
    }
 
    
    public int contarDigitosPares() {
        int copia = numero;
        int contador = 0;
 
        
        while (copia > 0) {
            int digito = copia % 10; 
            if (digito % 2 == 0) {    
                contador++;
            }
            copia = copia / 10;       
        }
 
        return contador;
    }
 
    // Método para probar la clase
    public static void main(String[] args) {
        Ejercicio1ContadorDigitosPares contador = new Ejercicio1ContadorDigitosPares(6785);
        int resultado = contador.contarDigitosPares();
        System.out.println("Cantidad de dígitos pares: " + resultado);
    }
}
 
 
 




























