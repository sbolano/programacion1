import java.util.Scanner;

public class FabricaDeChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //solicitar l cantidad de barras producidas en un dia
        System.out.print("Ingrese la cantidad de barras producidas en un día: ");
        int N = scanner.nextInt();
        //calculo de costo de produccion 
        double costoMateriaPrima = 2.50;
        double costoEmpaque = 0.50;
        double costoPorBarra = costoMateriaPrima + costoEmpaque;
        double costoTotalProduccion = N * costoPorBarra;
        //calculo de precio de venta
        double ganancia = 0.30; 
        double precioVentaPorBarra = costoPorBarra * (1 + ganancia);
        
        double ingresoTotal = N * precioVentaPorBarra;
        //calculo de cajas completas y barras sueltas 
        int cajasCompletas = N / 10;
        int barrasSueltas = N % 10;
        
        System.out.println("Costo total de producción: $" + costoTotalProduccion);
        System.out.println("Precio de venta por barra: $" + precioVentaPorBarra);
        System.out.println("Ingreso total del día: $" + ingresoTotal);
        System.out.println("Cajas completas: " + cajasCompletas);
        System.out.println("Barras sueltas: " + barrasSueltas);

        scanner.close();
    }
}


