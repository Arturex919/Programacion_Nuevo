package Tema_primera_evaluacion.TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ6 {
    //6) Escribe un programa que muestre las tablas de multiplicar del 1 al 10.//
    public static void mostrarTabla(int num1) {
        int resultado;
        System.out.println("Tabla de multiplicar del " + num1 + ":");
        for (int i = 1; i <= 10; i++) {
            resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//creas este for para que recorras los numero del 1 al 10//
      for (int num=1;num<=10;num++)
        //llamas a la funcion tabla para que se muestre//
        mostrarTabla(num);
        System.out.println();

    }
}
