package Tema4;

import java.util.Random;
import java.util.Scanner;

public class atrapaMosca {
    public static int[] mosca(int[] lugar) {
        Random random = new Random();
        lugar = new int[15];
        int mosca = random.nextInt(15);//posicion random de la mosca
        lugar[mosca] = 1;//se ingresa la mosca dentro del lugar para que varie la posicion y 1 representa la mosca
        return lugar;
    }

    public static int busquedadMosca(int[] tablero) {
        for (int i = 0; i < tablero.length; i++)
            if (tablero[i] == 1) {
                return i;//nos retorna la posicion actual
            }
        return -1;//Si no encontramos la mosca, devolvemos -1
    }

    public static boolean encontrada(int[] lugar, int usuario) {
        if (lugar[usuario] != 1) {
            return false;
        }
        return true;
    }

    public static void moverMosca(int[] tablero, int posicionActual) {
        Random random = new Random();
        int posicionN;
        do {
            posicionN = random.nextInt(15);
        } while (posicionN == posicionActual);
        // Actualizar el tablero: quitar la mosca de la posición actual
        //y colocarla en la nueva
        tablero[posicionActual] = 0;
        tablero[posicionN] = 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int usuario;
        int[] tablero = new int[15];
        tablero = mosca(tablero);
        boolean atrapa = false;
        boolean continuarJuego=true;
        do {
            do {
            System.out.println("añade un numero del 1 al 15");
            usuario = in.nextInt();
//do while
                if (usuario < 1 || usuario > 15) {
                    System.out.println("Añade una posicion valida");
                }
            }while (usuario < 1 || usuario > 15);

            //es para que el numero que ingrese
            // el usuario se convierta en la posicion del array
            int arrayUser = usuario - 1;
            int posicion = busquedadMosca(tablero);

            if  (encontrada(tablero, arrayUser) ){
                atrapa = true;
            } else if (Math.abs(arrayUser - posicion) == 1) {
                System.out.println("¡La mosca estaba cerca y se ha movido!");
                moverMosca(tablero, posicion);
            } else {
                System.out.println("¡No estas cerca! Intenta otra vez.");
            }
            System.out.println("¿Quieres salir del juego? (1 para salir, cualquier numero para  continuar):");
            int opcion = in.nextInt();
            if (opcion == 1) {
                continuarJuego = false;
                System.out.println("           FIN DEL JUEGO");
                System.out.println("La mosca estaba en la posición: " + busquedadMosca(tablero));
            }
        } while (!atrapa && continuarJuego);
        in.close();
    }
}

