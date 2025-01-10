package Tema4;

import java.util.Scanner;

public class router {
    public static void rourte(int[] habitaciones, int habiRouter, int potencia) {
        int señalR = habiRouter - 1;//creas para guarda la señal de cada cuarto,y a su vez se convierte en el indice
        habitaciones[señalR] = potencia;//ingresas la señal en el numero de habitacion que a su vez va ser igual a la potencia
        // Propagar señal hacia la izquierda
        for (int i = 1; i < potencia; i++) {
            int potenciaIzquierda = señalR - i;
            if (potenciaIzquierda >= 0) { // Asegurarnos de no salir del array
                habitaciones[potenciaIzquierda] = potencia - i;
            }
        }

        // Propagar señal hacia la derecha
        for (int i = 1; i < potencia; i++) {
            int potenciaDerecha = señalR + i;
            if (potenciaDerecha < habitaciones.length) { // Asegurarnos de no salir del array
                habitaciones[potenciaDerecha] = potencia - i;
            }
        }
    }

    public static void señal(int[] hab) {
        System.out.println("La señal es :");
        for (int i = 0; i < hab.length; i++) {
            System.out.print(hab[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] habitacion = new int[20];
        int numeroHabitacion;
        int potencia;
        boolean sal = true;
        do {
            do {

                System.out.println("Seleccione una habitacion del 1 al 20");
                numeroHabitacion = in.nextInt();
                if (numeroHabitacion < 1 || numeroHabitacion > 20) {
                    System.out.println("selecciona un numero valido del 1 al 20");
                }
                //sobra la linea siguiente
                System.out.println("la potencia del router es :");

            } while (numeroHabitacion < 1 || numeroHabitacion > 20);
            do {
                System.out.println("Escoja la potencia que desea tener del 1 al 6");
                potencia = in.nextInt();
                if (potencia < 1 || potencia > 6) {
                    System.out.println("escoja una potencia valida");
                }
            } while (potencia < 1 || potencia > 6);
            rourte(habitacion, numeroHabitacion, potencia);
            señal(habitacion);
            System.out.println();
            String salir;
            System.out.println("Escriba salir si desea salir o presione cualquier numero para continuar");
            salir = in.next();
            if (salir.equals("salir")) {
                sal = false;
                System.out.println("Hasta luego");
            } else {
                System.out.println("continuando");
            }
        } while (sal);
        in.close();
    }
}