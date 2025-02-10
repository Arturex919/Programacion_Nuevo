package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ8 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double a,b;
        System.out.println("inserte el valor en euros");
        a= in.nextDouble();
        b= a *0.93;
        System.out.println("su valor en dolares es= "+b);
        in.close();
    }
}
