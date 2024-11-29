package Tema2;

import java.util.Scanner;

public class Tema2_EJ25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, i;
        int fact = 1;
        System.out.println("ingrese el valor");
        a = in.nextInt();

        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("el factorial del numero es:" + fact);
    }
}