import java.util.Scanner;

public class Ejercicio4punto1b {

    public static void main(String[] args) {
        // clase que me permite a traves del objeto "leer" solicitar
        // datos por teclado
        Scanner leer = new Scanner (System.in);
        
        // se declara la variable o variables
        double temperatura = 0.0;

         // solicitar por teclado el angulo para su validacion
        System.out.print("digite la temperatura");
        temperatura = leer.nextInt();
 
        // condicional
        if (temperatura == 100){
            System.out.println("por encima del punto de ebullicion del agua");                      
        } else {
            System.out.println("por debajo del punto de ebullicion del agua");
        }
        leer.close();
    }
} 

