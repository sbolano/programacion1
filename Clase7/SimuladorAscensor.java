import java.util.Scanner;

public class SimuladorAscensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PISO_MINIMO = 1;
        final int PISO_MAXIMO = 25;

        System.out.print("Ingrese el piso actual del ascensor (1 - 25): ");
        int pisoActual = scanner.nextInt();

        if (pisoActual < PISO_MINIMO || pisoActual > PISO_MAXIMO) {
            System.out.println("Piso inválido. El edificio tiene pisos del 1 al 25.");
       }

        System.out.println("Usted está en el piso " + pisoActual);
        if (pisoActual == PISO_MINIMO) {
            System.out.println("Solo puede SUBIR. Presione 1 para subir.");
        } else if (pisoActual == PISO_MAXIMO) {
            System.out.println("Solo puede BAJAR. Presione 2 para bajar.");
        } else {
            System.out.println("Presione 1 para SUBIR o 2 para BAJAR.");
        }

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: 
                if (pisoActual == PISO_MAXIMO) {
                    System.out.println("Ya está en el último piso. No puede subir más.");
                } else {
                    pisoActual++;
                    System.out.println("Subiendo al piso " + pisoActual + "...");
                }
                break;
            case 2:
                if (pisoActual == PISO_MINIMO) {
                    System.out.println("Ya está en el primer piso. No puede bajar más.");
                } else {
                    pisoActual--;
                    System.out.println("Bajando al piso " + pisoActual + "...");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}
