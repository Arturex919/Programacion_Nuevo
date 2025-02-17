package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector {
    //añadir error arrayIndexOut.....
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double []vector=new double[5];//creas el vector de 5
        boolean valida=false;
        while (!valida) {
            for (int i = 0; i < vector.length; i++) {//recorres el array
                try {
                    System.out.println("Añade un valor para " + (i + 1));//aumenta el numero de valore (i+1)
                    vector[i] = in.nextDouble();
                    valida=true;//valida si acaba el bucle
                } catch (InputMismatchException e) {//confirma la excepcion
                    System.out.println("Error: El valor ingresado no es un número válido. Inténtelo de nuevo.");
                }finally {
                    System.out.println("valor asignado correctamente ");
                }
            }
        }
        System.out.println("los valores intrucidos son");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" valor "+(i+1)+ ":"+vector[i]);
        }


    }
}
