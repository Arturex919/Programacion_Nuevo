package Tema5;

import java.util.Scanner;

public class EJ1 {
    //Un procedimiento que imprima la matriz.//

    public static void cuadra( int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
    public static int maxArray (int [][] max){
        int numMax=max[0][0];
        for (int i=0;i<max.length;i++){
            if (max[i][i]>numMax){
                numMax=max[i][i];
            }
        }
        return  numMax;
    }
    public static int minArray(int [][] min){
        int numMin=min[0][0];
        for (int i=0;i<min.length;i++){
            if (min[i][i]<numMin){
                numMin=min[i][i];
            }
        }
        return  numMin;
    }
    public static int mediaArray(int [][]media){
        int numMedia=media[0][0];
        int suma=0;
        for (int i=0;i<media.length;i++){

        }
    }

    public static void main(String[] args) {

    }


}
