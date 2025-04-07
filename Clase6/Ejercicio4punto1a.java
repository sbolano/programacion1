import java.util.Scanner;
 
public class Ejercicio4punto1a {
    public static void main(String[] args) {
        // clase que me permite a traves del objeto "leer" solicitar
        // datos por teclado
        Scanner leer = new Scanner(System.in);
       
        // se declara la variable o las variables
        double angulo;
       
        // solicitar por teclado el angulo para su validacion
        System.out.print("digite el angulo");
        angulo = leer.nextInt();
 
        // condicional
        if (angulo == 90){
            System.out.println("el angulo es un angulo recto");                      
        } else {
            System.out.println("el angulo NO es un angulo recto");
        }
        leer.close();
    }
} 
   