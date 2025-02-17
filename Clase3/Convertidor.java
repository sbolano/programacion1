import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {

        // Declaracion de las variables para el ejercicio
        // c - > grados celsius, f - > grados farenheit
        // gradoscelsius, gradosfarenheit
        double c, f, gradosCelsius, gradosFarenheit;
        
        //pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("digite los grados celsius");
        c = leer.nextDouble();
        System.out.println("digite los grados farenheit");
        f = leer.nextDouble();
        //calculamos las formulas para cada una de las conversiones
        gradosCelsius = (f - 32) * (5.0/9.0);
        gradosFarenheit = c * (9.0/5.0) + 32;
        //mostrar los resultados de las formulas
        System.out.println("ºf - > ºC : " + gradosCelsius);
        System.out.println("ºC - > ºF : " + gradosFarenheit);
        leer.close(); 

    }
}
