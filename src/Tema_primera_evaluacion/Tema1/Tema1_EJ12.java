package Tema_primera_evaluacion.Tema1;

import java.util.Scanner;

public class Tema1_EJ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("ingrense un año");
        a = in.nextInt();
        if (a % 4 == 0) {
            System.out.println("escribir es un año biciesto");
        } else {
            System.out.println("escrbir es un año No biciesto");
        }
        
    }
}
