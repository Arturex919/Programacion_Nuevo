package Tema2;

import java.util.Scanner;

//Realiza un programa que determina si el número leído por consola es
//positivo, negativo o zero.
public class Tema2_EJ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, c, d;
        System.out.println("ingrese un numero entero");
        a = in.nextInt();
        if (a == 0) {
            System.out.println("es cero");
        } else if (a > 0) {
            System.out.println("es positivo");
        } else {
            System.out.println("es negativo");
        }
        in.close();
    }
}

