package Tema5;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {
    //Le das el valor ramdon a la mosca
    public static int[][] mosca(int[][] posicionM) {
        Random random = new Random();
        //creas dos variables x,y para que los valores esten en cualquier posicion
        int fila = random.nextInt(4);
        int columna = random.nextInt(4);
        //se ingresa la mosca dentro del lugar para que varie la posicion
        // 1 representa la mosca
        posicionM[fila][columna] = 1;//guardas los valores al azar en la posicion de la Mosca si esta es 1

        return posicionM;
    }

    //Metodo que busca donde esta la mosca
    public static int[] busquedaMosca(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 1) {
                    // Retorna la posición (fila, columna) donde se encuentra el 1
                    return new int[]{i, j}; // // Devuelve la posición como [fila, columna]
                }
            }
        }
        // Si no se encuentra el 1, devuelve null
        // Se puede retornar null si no se encuentra la mosca
        return null;
    }

    //Metodo compruba donde esta mosca
    public static boolean encontradaMosca(int[][] posicionMosca, int posicionUsuarioH, int posicionUsuarioV) {
        if (posicionMosca[posicionUsuarioH][posicionUsuarioV] == 1) {
            return true;
        }
        return false;
    }

    public static void moverMosca(int[][] tablero, int[] posicionActual) {
        Random random = new Random();
        int posicionvertical, posicionHorizontal;
        do {
            posicionHorizontal = random.nextInt(4);
            posicionvertical = random.nextInt(4);
        } while (posicionHorizontal == posicionActual[0] && posicionvertical == posicionActual[1]);
        //[0] y [1] nos va ayudar a limpiar la posicion de la mosca y va a colocar un cero
        tablero[posicionActual[0]][posicionActual[1]] = 0;
        //si se equivoca no devolvera un 1
        tablero[posicionHorizontal][posicionvertical] = 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int poscionH, posiconV;
        int[][] tablero = new int[4][4];
        tablero = mosca(tablero);
        boolean atrapada = false;
        boolean continuaJuego = true;
        while (!atrapada && continuaJuego) {
            do {

                System.out.println("añade del 1-4 una posicion horizontal");
                poscionH = in.nextInt();
                if (poscionH < 1 || poscionH > 4) {
                    System.out.println("Añade una posicion valida");
                }
            } while (poscionH < 1 || poscionH > 4);

            do {
                System.out.println("añade del 1-4 una posicion vertical");
                posiconV = in.nextInt();
                if (poscionH < 1 || poscionH > 4) {
                    System.out.println("Añade una posicion valida");
                }
            } while (poscionH < 1 || poscionH > 4);

            int userPh = poscionH - 1;
            int userPv = posiconV - 1;
            int[] posicion = busquedaMosca(tablero);
            if (encontradaMosca(tablero, userPh, userPv)) {
                System.out.println("Has atrapado a la mosca");
            } else if (Math.abs(userPh - posicion[0]) <= 1 && Math.abs(userPv - posicion[1]) <= 1) {
                System.out.println("¡La mosca estaba cerca y se ha movido!\n");
                moverMosca(tablero, posicion);
            } else {
                System.out.println("¡No estás cerca! Intenta de nuevo.");
            }
            System.out.println("deseas salir del juego?");
            System.out.println("1 para salir o toque cualquier  numero para seguir");
            int opcion = in.nextInt();
            if (opcion == 1) {
                System.out.println("\n           FIN DEL JUEGO");
                System.out.println("La mosca estaba en la posición: Fila " + (posicion[0] + 1) + ", Columna " + (posicion[1] + 1));
                continuaJuego = false;
            }

        }
    }
}