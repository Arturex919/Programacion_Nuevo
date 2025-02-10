package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  a, b;
        System.out.println("escribe un valor para a");
        a = in.nextInt();
        System.out.println("escribe un balor para b");
        b = in.nextInt();
        if (b > a) {
            System.out.println("los numeros impares que hay entre "+a +" y "+b+" son :");
            for (a = a + 1; b >a ; a++) {
                if (a % 2 != 0) {
                    System.out.println(a);
                }
            }
        } else {
            System.out.println("b debe ser mayor que a");
        }
        in.close();
    }
}