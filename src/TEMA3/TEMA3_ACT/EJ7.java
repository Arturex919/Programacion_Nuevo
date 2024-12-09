package TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ7 {
    //) Escribe un programa que pida números enteros positivos hasta que se
    //introduzca el 0, para cada número nos dirá si es primo o no.//
    public static boolean esPrimo(int numero) {
        //boolean esPrimo = true;
        if (numero <= 1) {
            return false;
        }
        // creamos un for para que vaya recorriendo los numeros que queremos y creamos un if dentro del for
        //para sacar el modulo//
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // No es primo si tiene divisores distintos de 1 y sí mismo.//
                return false;
            }
        }
        //Es primo si no encontramos divisores.//
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        //creas el do while para que se vaya repitiendo //
        do {
            System.out.println("ingrese un numero");
            System.out.println("si ingresa 0 puede salir");
            num = in.nextInt();
            if (esPrimo(num)) {
                System.out.println(+num + " es primo");
            } else {
                System.out.println(+num + " no es primo");
            }
            //si el numero es menor que cero decimos que ponga un positivo//
            if (num < 0) {
                System.out.println("introduce un numero positivo");
            }
            //si el numero es disntito a 0 sale//
        } while (num != 0);
        System.out.println("Adiooooos");
    }
}



