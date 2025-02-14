package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double []vector=new double[5];//creas el vector de 5
        boolean valida=false;
        while (!valida) {
            for (int i = 0; i < vector.length; i++) {
                try {
                    System.out.println("Añade un valor para " + (i + 1));
                    vector[i] = in.nextDouble();
                    valida=true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: El valor ingresado no es un número válido. Inténtelo de nuevo.");

                }
            }
        }
        System.out.println("los valores intrucidos son");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" valor "+(i+1)+ ":"+vector[i]);
        }


    }
}
