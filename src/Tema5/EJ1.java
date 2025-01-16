package Tema5;

import java.util.Scanner;

public class EJ1 {
    //Un procedimiento que imprima la matriz.//

    //Un procedimiento que imprima la matriz.//

    public static void imprime(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //b) Una función que devuelva el máximo de la matriz.
    public static int maxArray(int[][] max) {
        int numMax = max[0][0];//recorrera las columnas
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max[i].length; j++) {
                if (max[i][j] > numMax) {
                    numMax = max[i][j];
                }
            }
        }
        return numMax;
    }

    //Una función que devuelva el mínimo de la matriz.
    public static int minArray(int[][] min) {
        int numMin = min[0][0];
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < min[i].length; j++) {
                if (min[i][j] < numMin) {
                    numMin = min[i][j];
                }
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
            for (int j = 0; j < real[i].length; j++) {
                if (real[i][j] == elemetos) {
                    return true;
                }
            }
        }
        return false;
    }

    //Una función que devuelva cuantas veces se repite un número en
    //una matriz.
    public static int repetite(int[][] numeroR, int numero) {
        int cont = 0;
        for (int i = 0; i < numeroR.length; i++) {
            for (int j = 0; j < numeroR[i].length; j++) {
                if (numeroR[i][j] == numero) {//si el numero en i y es igual al numero en j se repite y nos avisa
                    cont++;
                }
            }
        }
        return cont;
    }

    //g) Una función que haga la suma de dos matrices.
    public static int[][] sumaMatriz(int[][] suma1, int[][] suma2) {
        if (suma1 != suma2) {
            System.out.println("Los numeros no son iguales");
        }
        int[][] resultado = new int[suma1.length][suma1[0].length];
        for (int i = 0; i < suma1.length; i++) {
            for (int j = 0; j < suma1[i].length; j++) {
                resultado[i][j] = suma1[i][j] + suma2[i][j];
            }
        }

        return resultado;
    }

    //h) Una función que haga la resta de dos matrices.
    public static int[][] restaMatriz(int[][] resta, int[][] resta2) {
        if (resta != resta2) {
            System.out.println("no son iguales");
        }
        int[][] resultado = new int[resta.length][resta[0].length];
        for (int i = 0; i < resta.length; i++) {
            for (int j = 0; j < resta[i].length; j++) {
                resultado[i][j] = resta[i][j] - resta2[i][j];
            }
        }
        return resultado;
    }

    //) Una función que compruebe si una matriz es la matriz unidad, es
    //decir tiene el mismo número de filas y de columnas ytiene en su
    //diagonal principal 1s y el resto 0
    public static boolean compruba(int[][] fila) {
        //si no es igual a una matriz la detecta
        if (fila.length != fila[0].length) ;
        { //el cero porque corre las columnas
            System.out.println("Erroooor,No es una unidad");
        }
        int tamañoMatriz = fila.length;//nos comprueba el taño de nuestra matriz
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                if (i == j) {
                    if (fila[i][j] != 1) {//compruebas las diagonales para ver si es 1
                        return false;//si es distinto a 1 nos da falso
                    }
                }else {
                    if (fila[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Declaramos una matriz de ejemplo
        Scanner in = new Scanner(System.in);
// Definir una matriz de ejemplo
        int[][] matrizUnidad = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        int[][] matrizNoUnidad = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println(compruba(matrizUnidad));
        System.out.println(compruba(matrizNoUnidad));
    }
}
      /*  // Pedir al usuario el número que desea contar
        System.out.print("Introduce el número que deseas contar en la matriz: ");
        int numeroABuscar = in.nextInt();

        // Llamamos a la función para contar las repeticiones
        int repeticiones = repetite(matriz, numeroABuscar);

        // Mostrar el resultado
        System.out.println("El número " + numeroABuscar + " se repite " + repeticiones + " veces.");

    }*/

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


