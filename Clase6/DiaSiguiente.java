import java.util.Scanner;

public class DiaSiguiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        
        int[] diasMes = {0, 31, esBisiesto ? 29 : 28, 31, 30, 31, 30,
                         31, 31, 30, 31, 30, 31};

        
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasMes[mes]) {
            System.out.println("Fecha inválida.");
        } else {
            
            dia++;

            if (dia > diasMes[mes]) {
                dia = 1;
                mes++;

                if (mes > 12) {
                    mes = 1;
                    anio++;
                }
            }


            System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);
        }

        scanner.close();
    }
}

