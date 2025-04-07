import java.util.Scanner;

public class Ejercicio413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un mes (1 para Enero, 2 para Febrero,...): ");
        double mesReal = scanner.nextDouble();

        System.out.println("Introduzca un día del mes: ");
        double diaReal = scanner.nextDouble();

       
        int mes = (int) mesReal;
        int dia = (int) diaReal;

        if (mes < 1 || mes > 12) {
            System.out.println("Error: El número introducido no es válido como mes.");
        }
        
        else if (dia < 1 || dia > 31) {
            System.out.println("Error: El número introducido no es válido como día del mes.");
        }
        
        else {
            boolean fechaValida = true;

            switch (mes) {
                case 2: 
                    if (dia > 29) {
                        fechaValida = false;
                        System.out.println("Error: Febrero no puede tener más de 29 días.");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia > 30) {
                        fechaValida = false;
                        System.out.println("Error: El mes ingresado tiene solo 30 días.");
                    }
                    break;
                default: 
                    break;
            }

            if (fechaValida) {
                System.out.println("Fecha ingresada: Día " + dia + " del mes " + mes + ".");
            }
        }

        scanner.close();
    }
}

