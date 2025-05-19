package Relojdearena_POO;

public class RelojArena {
    private int segundos;

    // Constructor
    public RelojArena(int segundos) {
        this.segundos = segundos;
    }

    // Método contar
    public void contar() {
        int mitad = segundos / 2;
        int tiempo = segundos;

        while (tiempo > 0) {
            System.out.println("Tiempo restante: " + tiempo + " segundos");

            if (tiempo == mitad) {
                System.out.println("¡Mitad del tiempo!");
            }

            tiempo--;
            try {
                Thread.sleep(1000); // Espera 1 segundo (simula reloj)
            } catch (InterruptedException e) {
                System.out.println("Error en la espera.");
            }
        }

        System.out.println("¡Tiempo terminado!");
    }
}
