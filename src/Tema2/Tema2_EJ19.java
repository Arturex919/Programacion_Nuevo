package Tema2;

import java.util.Scanner;

public class Tema2_EJ19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("los numeros pares del 1 al 1000 son");
        for (a = 1; a <= 1000; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            in.close();
        }
        in.close();
    }
}

