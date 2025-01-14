package Tema5;

import java.util.Scanner;

public class EJ1 {
    //Un procedimiento que imprima la matriz.//
    public static void cuadra(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "");
            }
        }
    }

    //b) Una función que devuelva el máximo de la matriz.
    public static int maxArray(int[][] max) {
        int numMax = max[0][0];
        for (int i = 0; i < max.length; i++) {
            if (max[i][i] > numMax) {
                numMax = max[i][i];
            }
        }
        return numMax;
    }

    //Una función que devuelva el mínimo de la matriz.
    public static int minArray(int[][] min) {
        int numMin = min[0][0];
        for (int i = 0; i < min.length; i++) {
            if (min[i][i] < numMin) {
                numMin = min[i][i];
            }
        }
        return numMin;
    }

    //d) Una función que devuelva la media de la matriz.
    public static double mediaArray(double[][] media) {
        double numMedia = media[0][0];
        double suma = 0;
        int cont = 0;//guardas elemeto contado
        for (int i = 0; i < media.length; i++) {
            for (int j = 0; j < media[i].length; j++) {
                suma += media[i][j];//suma todo
                cont++;//cuentas los elementos
            }
        }
        double resul = suma / cont;

        return resul;
    }

    //Una función que te diga si un elemento existe en la matriz o no.
    public static boolean existeA(int[][] real, int elemetos) {
        for (int i = 0; i < real.length; i++) {
            for (int j = 0; j < real[i].length; i++) {
                if (real[i][j] == elemetos) {
                    return true;
                }
            }
        }
        return false;
    }
    //Una función que devuelva cuantas veces se repite un número en
    //una matriz.
public static int repetite(int [][]numeroR,int numero){
        int cont=0;
        for (int i=0;i<numeroR.length;i++){
            for (int j=0;j<numeroR[i].length;j++){
                if (numeroR[i][j]==numero){//si el numero en i y es igual al numero en j se repite y nos avisa
                    cont++;
                }
            }
        }
        return cont;
}
public static int sumaMatriz(int [][]suma1,int [][]suma2){
    int count1=0;//1
    int count2=0;//2
    int sum=0;
    int sum2=0;
        if (suma1!=suma2){
            System.out.println("Los numeros no son iguales");
        }
        for (int i=0;i<suma1.length;i++){
            for (int j=0;j<suma1[i].length;j++){
                sum+=suma1[i][j];
                 count1++;
            }
        }
        for (int i=0;i<suma2.length;i++){
            for (int j=0;j<suma2[2].length;j++){
                sum2=suma2[i][j];
            }
        }
}
    public static void main(String[] args) {
        // Declaramos una matriz de ejemplo
        Scanner in = new Scanner(System.in);
// Definir una matriz de ejemplo
        int[][] matriz = {
                {1, 2, 3},
                {4, 1, 6},
                {7, 1, 9}
        };

        // Pedir al usuario el número que desea contar
        System.out.print("Introduce el número que deseas contar en la matriz: ");
        int numeroABuscar = in.nextInt();

        // Llamamos a la función para contar las repeticiones
        int repeticiones = repetite(matriz, numeroABuscar);

        // Mostrar el resultado
        System.out.println("El número " + numeroABuscar + " se repite " + repeticiones + " veces.");

    }
}
/*
        // Declaramos una matriz con tamaño dinámico
        System.out.println("Ingresa el tamaño del array (cuadrado): ");
        int tamaño = in.nextInt();
        int[][] valor = new int[tamaño][tamaño];

        // Llenamos la matriz con valores proporcionados por el usuario
        System.out.println("Ingresa los valores de tu matriz:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                valor[i][j] = in.nextInt();
            }
        }
        // Pedimos al usuario que ingrese un número para buscar
        System.out.println("Añade el elemento que quieres buscar: ");
        int elemento = in.nextInt();

        // Llamamos al método `existeA` para verificar si el elemento está en la matriz
        if (existeA(valor, elemento)) {
            System.out.println("El elemento " + elemento + " sí existe en el array.");
        } else {
            System.out.println("El elemento " + elemento + " no existe en el array.");
        }

    }*/


