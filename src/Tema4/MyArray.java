package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    //a) Un procedimiento que imprima el array
    public static void mpArray(int[] array) {
        System.out.println("sus numeros son");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //b) Una función que devuelva el máximo del array.
    public static int maxArray(int[] max) {
        int maximo = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > maximo) {
                maximo = max[i];
            }

        }
        return maximo;
    }

    //c) Una función que devuelva el mínimo del array.
    public static int min(int[] min) {
        int minimo = min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i] < minimo) {
                minimo = min[i];
            }

        }
        return minimo;
    }

    //  d) Una función que devuelva la media.
    public static double media(double[] mitad) {
        double med;
        double suma = 0;
        for (int i = 0; i < mitad.length; i++) {
            suma += mitad[i];
        }
        med = suma / mitad.length;
        return med;
    }

    //e) Una función que te diga si un elemento existe en el array o no.
    public static boolean existe(int[] real, int elemento) {
        /* Recorrer todo el array para buscar el elemento*/
        for (int i = 0; i < real.length; i++) {
            if (real[i] == elemento) {
                return true;//si existe nos devuelve
            }
        }
        return false;
    }


    //f) Una función que haga la suma de dos vectores (arrays).
    public static int[] sumaVectores(int[] numA, int[] numB) {
        // Verificar que los tamaños de los vectores sean iguales
        if (numA.length != numB.length) {
            System.out.println("Error: Los vectores deben tener el mismo número de elementos.");
        }

        // Crear el array para almacenar la suma
        int[] suma = new int[numA.length];

        // Realizar la suma  uno a uno
        for (int i = 0; i < numA.length; i++) {
            suma[i] = numA[i] + numB[i];
        }

        return suma; //
    }

    //g) Una función que haga la resta de dos vectores (arrays).
    public static int[] restaVectores(int[] numA, int[] numB) {
        // Verificar que los tamaños de los vectores sean iguales
        if (numA.length != numB.length) {
            System.out.println("Error: Los vectores deben tener el mismo número de elementos.");
            return new int[0]; // Devuelve un array vacío si los tamaños no coinciden
        }

        // Crear el array para almacenar la resta
        int[] resta = new int[numA.length];

        // Realizar la resta componente a componente
        for (int i = 0; i < numA.length; i++) {
            resta[i] = numA[i] - numB[i];
        }

        return resta;
    }

    //h) Una función que haga el producto escalar de dos vectores
    //(arrays).
    /* devuelve un entero porque está diseñada para calcular el producto escalar
    que es un único valor numérico */
    public static int producto(int[] numA, int[] numB) {
        int resultado = 0;

        if (numA.length != numB.length) {
            System.out.println("Error: Los vectores deben ser iguales");
            return 0;// no devuelve nada ;
        }
        for (int i = 0; i < numA.length; i++) {
            resultado += numA[i] * numB[i];
        }
        return resultado;
    }

    //i) Haz una función que invierta el orden de un array. Por ejemplo://

    public static int[] order(int[] num) {
        int[] invierte = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            //
            invierte[i] = num[num.length - 1 - i];
        }
        return invierte;
    }

    //    j) Haz un procedimiento que invierta el orden de un array.//
    public static void orderInveter(int[] num) {
        //creas un array para meter el inverso
        int[] inverso = new int[num.length];//lo haces para que tenga el mismo tamaño
        for (int i = 0; i < num.length; i++) {
            inverso[i] = num[num.length - 1 - i];
        }
        System.out.println("El orden original es:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("El orden inverso es:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(inverso[i]);
        }

    }

    //k) Haz una función que nos indique si un array es capicua o no. El
    //siguiente array por ejemplo es capicua(es lo mismo por los dos lados 12 3 21).
    public static boolean capicua(int[] num) {
        int inicio = 0;
        int fin = num.length - 1;
        while (inicio < fin) {
            if (num[inicio] != num[fin]) {
                return false;//si son distinto es falso//
            }
            inicio++;
            fin--;//disminuye para que tenga el mismo valor
        }
        return true;
    }

    //l) Haz un programa con un menú que te permita introducir uno o
    //dos vectores y hacer todas las operaciones anteriores.
    public static void showMenu() {
        System.out.println(" a) Un procedimiento que imprima el array.");
        System.out.println(" b) Una función que devuelva el máximo del array.");
        System.out.println(" c) Una función que devuelva el mínimo del array. ");
        System.out.println(" d) Una función que devuelva la media.");
        System.out.println(" e) Una función que te diga si un elemento existe en el array o no.");
        System.out.println(" f) Una función que haga la suma de dos vectores (arrays). ");
        System.out.println(" g) Una función que haga la resta de dos vectores (arrays).");
        System.out.println(" h) Una función que haga el producto escalar de dos vectores");
        System.out.println(" i) Haz una función que invierta el orden de un array");
        System.out.println(" j) Haz un procedimiento que invierta el orden de un array ");
        System.out.println(" k) Haz una función que nos indique si un array es capicua o no.");
        System.out.println(" l) Salir");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opcion;
        do {

            showMenu();
            opcion = in.next().toLowerCase().charAt(0);
            switch (opcion) {
                case 'a' -> {
                    boolean salir;
                    do {
                        System.out.print("Ingrese el tamaño del array: ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("ingresa los valores del array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        mpArray(valor);
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);
                }
                case 'b' -> {
                    boolean salir;
                    do {
                        System.out.print("Ingrese el tamaño del array: ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("ingresa los valores del array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        System.out.println("El numero maximo de su Array es : " + maxArray(valor));
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);

                }
                case 'c' -> {
                    boolean salir;
                    do {
                        System.out.print("Ingrese el tamaño del array: ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("ingresa los valores del array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        System.out.println("El numero minimo de su Array es : " + min(valor));
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);
                }
                case 'd' -> {
                    boolean salir;
                    do {
                        System.out.print("Ingrese el tamaño del array: ");
                        int tamaño = in.nextInt();
                        double[] valor = new double[tamaño];
                        System.out.println("ingresa los valores del array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextDouble();
                        }
                        System.out.println("La media de su Array es : " + media(valor));
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);
                }
                case 'e' -> {
                    boolean salir;
                    do {
                        System.out.println("ingresa el tamaño del array ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("ingresa el valor de tu array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        System.out.println("Añada el elemento que quiere buscar");
                        int elemento = in.nextInt();
                        if (existe(valor, elemento)) {
                            System.out.println("Su elemento " + elemento + "si existe en el array");
                        } else {
                            System.out.println("su elemento " + elemento + " no existe en el array");
                        }
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);
                }
                case 'f' -> {
                    boolean salir;
                    do {
                        System.out.println("ingresa el tamaño del primer array  ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.print("ingresa el valor de tu array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        System.out.println("ingresa el tamaño del segundo array  ");
                        int tamaño2 = in.nextInt();
                        int[] valor2 = new int[tamaño2];
                        System.out.print("ingresa el valor de tu array");
                        for (int i = 0; i < tamaño2; i++) {
                            valor2[i] = in.nextInt();
                        }
                        if (tamaño == tamaño2) {
                            int[] suma = sumaVectores(valor, valor2);
                            System.out.println("La suma de los vectores es : " + Arrays.toString(suma));//  Arrays.toString es para conventir el array en un una cadena
                        } else {
                            System.out.println("Error, Los vectores deben  ser iguales");
                        }
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);

                }
                case 'g' -> {
                    boolean salir;
                    do {
                        System.out.println("ingresa el tamaño del primer array  ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.print("ingresa el valor de tu array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        System.out.println("ingresa el tamaño del segundo array  ");
                        int tamaño2 = in.nextInt();
                        int[] valor2 = new int[tamaño2];
                        System.out.print("ingresa el valor de tu array");
                        for (int i = 0; i < tamaño2; i++) {
                            valor2[i] = in.nextInt();
                        }
                        if (tamaño == tamaño2) {
                            int[] suma = restaVectores(valor, valor2);
                            System.out.println("La suma de los vectores es : " + Arrays.toString(restaVectores(valor, valor2)));//  Arrays.toString es para conventir el array en un una cadena
                        } else {
                            System.out.println("Error, Los vectores deben  ser iguales");
                        }
                        System.out.println("deseas salir? (1 para salir o presione cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego");
                        }
                    } while (!salir);
                }
                case 'h' -> {
                    boolean salir;
                    do {
                        System.out.println("Ingresa el tamaño del primer array ");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("Añada el el valor del Array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        System.out.println("Ingresa el valor de tu segundo array ");
                        int tamaño2 = in.nextInt();
                        int[] valor2 = new int[tamaño2];
                        System.out.println("Añada el el valor del Array");
                        for (int i = 0; i < tamaño2; i++) {
                            valor2[i] = in.nextInt();
                        }
                        int total = producto(valor, valor2);
                        if (tamaño == tamaño2) {
                            System.out.println("El producto escalar de su vector es: " + total);
                        } else {
                            System.out.println("Los vectores deben tener el mismo tamaño");
                        }
                        System.out.println("Desea salir (Presione 1 para salir o cualquier numero para continuar)");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta luego...");
                        }
                    } while (!salir);
                }
                case 'i' -> {
                    boolean salir;

                    do {
                        System.out.println("ingresa el tamaño de su array");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("Añade los valores del Array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        int[] vuelta = order(valor);
                        System.out.println("El orden invertido  es:" + Arrays.toString(vuelta));
                        System.out.println("deseas salir?(presiona 1 para salir o toca cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta la proximaaaa");
                        }
                    } while (!salir);
                }
                case 'j' -> {
                    boolean salir;
                    do {
                        System.out.println("Ingresa el tamaño del Array");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("Añade los valores del Array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        orderInveter(valor);
                        System.out.println("deseas salir?(presiona 1 para salir o toca cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta la proximaaaa");
                        }
                    } while (!salir);
                }
                case 'k' -> {
                    boolean salir;
                    do {
                        System.out.println("Ingresa el tamaño del Array");
                        int tamaño = in.nextInt();
                        int[] valor = new int[tamaño];
                        System.out.println("Añade los valores del Array");
                        for (int i = 0; i < tamaño; i++) {
                            valor[i] = in.nextInt();
                        }
                        if (capicua(valor)) {
                            System.out.println("es capicua y el orden es: " + Arrays.toString(valor));
                        } else {
                            System.out.println("Ingresa un valor valido,no es capicua por que tu valores son: " + Arrays.toString(valor));
                        }
                        System.out.println("deseas salir?(presiona 1 para salir o toca cualquier numero para continuar");
                        int sal = in.nextInt();
                        salir = (sal == 1);
                        if (salir) {
                            System.out.println("Hasta la proximaaaa");
                        }
                    } while (!salir);
                }
                case 'l' -> {
                    System.out.println("Hasta la proxima");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        }
        while (opcion != 'l');

        in.close();
    }
}