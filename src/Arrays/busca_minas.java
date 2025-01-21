package Arrays;

import java.util.Random;
import java.util.Scanner;

public class busca_minas {

    public static void minas(char[] tablero, int[] pista) {
        Random random = new Random();
        int mina = 6;
        while (mina > 0) {
            int posicion = random.nextInt(tablero.length);//creas la posicion para guardar el caracter para el lugar de la mina
            if (tablero[posicion] != '*') { //indica que no hay mina
                tablero[posicion] = '*';
                mina--;
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == '*') {
                pista[i] = -1;//nos indica que hay uuna mina
            } else {
                int cont = 0;
                if (i > 0 && tablero[i - 1] == '*') cont++;
                if (i < tablero.length - 1 && tablero[i + 1] == '*') cont++;
                pista[i] = cont;
            }
        }
    }
    //nota si el if no funcion revisa los corchetes
    public static void tablero(char[] tablero, boolean[] verificada) {
        System.out.println("Tablero Actual");
        for (int i = 0; i < tablero.length; i++) {
            if (verificada[i]) {
                System.out.print(tablero[i] + "");
            } else {
                System.out.print("? ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int posicion;
        int[] pista = new int[20];
        char[] tablero = new char[20];
        boolean[] encontrada = new boolean[20];
        boolean juega = true;
        boolean correcta=false;
        boolean salir = true;
        int casillas = 0;
        System.out.println("---- Buscaminas ----");
        System.out.println("El tablero tiene 20 casillas con 6 minas escondidas.");
        System.out.println("Descubre todas las casillas sin minas para ganar.");

        minas(tablero, pista); // Inicializar minas y pistas
        do {
            busca_minas.tablero(tablero, encontrada);
            System.out.println();
            System.out.println("selecciona una casilla del 0-19");
                 posicion = in.nextInt();
            //para evitar que el usuario inserte varias veces el mismo número
            while (posicion < 0 || posicion > tablero.length || encontrada[posicion]) {
                if (encontrada[posicion]) {
                    System.out.println("Has descubierta esta zona ");
                } else {
                    System.out.println("intenta en otra zona ");
                }
                posicion = in.nextInt();
            }
            encontrada[posicion] = true;

            if (tablero[posicion] == '*') {
                System.out.println("¡Boom! Has pisado una mina.");
                System.out.println();
                System.out.println("perdiste,mejor suerte pa la proxima");
                juega = false;//acaba el juego
            } else {
                tablero[posicion] = (char) ('0' + pista[posicion]);
                casillas++;
                if (casillas == tablero.length - 6) {
                    System.out.println("¡Felicidades! Has descubierto todas las casillas sin minas. ¡Ganaste!");
                    juega = false;
                }
            }
        } while (juega && salir);
        System.out.println("Tablero Final:");
        for (int i = 0; i < tablero.length; i++) {
            if (pista[i] == -1) {
                System.out.print("*");
            } else {
                System.out.print(pista[i] + " ");
            }

        }


    }
}
        /*
        System.out.println("Tablero Final");
        for (int i = 0; i < tablero.length; i++) {
            if (pista[i] == -1) {
                System.out.print("*");
            } else {
                System.out.print((pista[i]) + " ");
            }
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }*/

