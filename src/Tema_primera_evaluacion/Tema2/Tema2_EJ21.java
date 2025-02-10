package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,suma=0;
        System.out.println("los numeros pares del 1 al 1000 son");
        for (a = 1; a <= 1000; a++) {
            if (a % 2 == 0) {
                suma+=a;
            }
        }
        System.out.println(suma);
        in.close();
    }
}
