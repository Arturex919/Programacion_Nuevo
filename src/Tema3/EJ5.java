package Tema3;

import java.util.Scanner;

public class EJ5 {
    //) Escribe un programa que pida un número entero por consola de 1 a 10 y
    //te muestre su tabla de multiplicar.//
    public static void tabla(int num1) {
        int resultado;
        System.out.println("Tabla de multiplicar del " + num1 + ":");
        //ESTE VA A CORRER LOS NUMEROS DEL 1 AL 10//
        for (int i = 1; i <= 10; i++) {
            resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (num < 1 || num > 10) {
            System.out.println("ingrese un numero del 1 al 10");
            num = in.nextInt();
        }
        if (num < 1 || num > 10) {
            System.out.println("eroor,ingrese un numero valido");
        }
        //llamas a la funcion tabla para que se muestre//
        tabla(num);

    }
}
