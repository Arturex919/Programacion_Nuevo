package Tema5;

import java.util.Random;

public class Ej2 {
    public static int[][] mosca(int[][] posicionM) {
        Random random = new Random();
        posicionM = new int[4][4];
        int mosca = (random.nextInt(4));;//posicion random de la mosca
        //se ingresa la mosca dentro del lugar para que varie la posicion
        // 1 representa la mosca
        posicionM[mosca][mosca] = 1;
        return posicionM;
    }
    public static int [][]busquedaMosca(int[][]tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
             if (tablero[i][j]==1){
                 // Retorna la posición (fila, columna) donde se encuentra el 1
                 return new int[i][j];  // Devuelve un arreglo con la fila y columna
             }
            }
        }
        // Si no se encuentra el 1, devuelve null
        return null;  // Se puede retornar null si no se encuentra la mosca
    }
        }
