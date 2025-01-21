package Matrices;

import java.util.Scanner;

public class EJ3 {
    //metodo que muestra la potencia del router
    public static void rourter(int[][] habitacion, int router, int potencia) {
        int señal_Router = router - 1;
        habitacion[señal_Router][señal_Router] = potencia;
        for (int i = 0; i < habitacion.length; i++) {
            for (int j = 0; j < habitacion[i].length; j++) {
                //mides mejor la señal ya que toma en cuenta todas las posiciones
                int posicion = Math.abs(señal_Router - i) + Math.abs(señal_Router - j);
                //si la potencia es menor o igual nos dara la señal deseada
                if (posicion <= potencia) {
                    //colocas la habitacion y creas un Max para que no execeda la potencia
                    habitacion[i][j] = Math.max(habitacion[i][j], potencia - posicion);
                }
            }
        }
    }

    public static void señal(int[][] habitacion) {
        for (int i = 0; i < habitacion.length; i++) {
            for (int j = 0; j < habitacion[i].length; j++) {
                System.out.print(habitacion[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] habitacion = new int[12][5];
        int numeroHabitacion, numeroPiso, potencia;
        boolean sal = true;
        while (sal) {

            do {
                System.out.println("Selecione una habitacion de 1 al 5");
                numeroHabitacion = in.nextInt();
                if (numeroHabitacion < 1 || numeroHabitacion > 5) {
                    System.out.println("selecciona un numero valido del 1 al 5");
                }
            } while (numeroHabitacion < 1 || numeroHabitacion > 5);

            do {
                System.out.println("Selecione una planta de 1 al 12");
                numeroPiso = in.nextInt();
                if (numeroPiso < 1 || numeroPiso > 12) {
                    System.out.println("selecciona una planta valida del 1 al 12");
                }
                //sobra la linea siguiente
            } while (numeroPiso < 1 || numeroPiso > 12);

            do {
                System.out.println("Selecione una potencia de 1 al 3");
                potencia = in.nextInt();
                if (potencia < 1 || potencia > 3) {
                    System.out.println("selecciona un numero valido del 1 al 20");
                }
            } while (potencia < 1 || potencia > 3);
            rourter(habitacion, numeroHabitacion, potencia);

            System.out.println("La señal distribuida va ser: ");
            señal(habitacion);
            System.out.println("¿Desea continuar? (1: Sí, 0: No)");
            int continuar = in.nextInt();
            if (continuar == 0) {
                sal = false; // Salir del bucle
            }
        }
        System.out.println("Adiosssssss.");


    }
}













