package Tema5;

import java.util.Random;
import java.util.Scanner;

public class EJ2 {

        public static int[][] mosca(int[][] posicionM) {
            Random random = new Random();
            posicionM = new int[4][4];
            int mosca = (random.nextInt(5));;//posicion random de la mosca
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
        //Metodo compruba donde esta mosca
      public static boolean encontradaMosca(int [][]posicionMosca, int posicionUsuarioH, int posicionUsuarioV ) {
          if (posicionMosca[posicionUsuarioH][posicionUsuarioV] != 1) {
              return false;
          }
          return true;
      }
      public static void moverMosca(int[][] tablero,int posicionActual){
            Random random=new Random();
            int posicionN;
            do {
                posicionN= random.nextInt(4);
            }while (posicionN==posicionActual);
            tablero[posicionActual][posicionActual]=0;
            tablero[posicionN] [posicionN]=1;
      }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     int poscionH,posiconV;
     int [][] tablero=new int[4][4];
     tablero=mosca(tablero);
     boolean atrapada=false;
     boolean continuaJuego=true;
     do {
         do {

             System.out.println("añade del 1-2 una posicion horizontal");
             poscionH = in.nextInt();
             if (poscionH < 1 || poscionH > 4) {
                 System.out.println("Añade una posicion valida");
             }
         }while (poscionH < 1 || poscionH > 4);

         do {
         System.out.println("añade del 1-2 una posicion vertical");
         posiconV= in.nextInt();
             if (poscionH < 1 || poscionH > 4) {
                 System.out.println("Añade una posicion valida");
             }
         }while (poscionH < 1 || poscionH > 4);

         int userPh=poscionH-1;
         int userPv=posiconV-1;

         int posicion=encontradaMosca(tablero,);





     }
    }
    }

