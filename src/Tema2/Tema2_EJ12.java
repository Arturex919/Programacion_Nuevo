package Tema2;

import java.util.Scanner;

public class Tema2_EJ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, mayor, medio, menor;
        System.out.println("ingrese un valor");
        a = in.nextInt();
        System.out.println("ingrese un valor");
        b = in.nextInt();
        System.out.println("ingrese un valor");
        c = in.nextInt();
        if (a >= b && a >= c) {
            mayor = a;
            if (b >= c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else if (b >= a && b >= c) {
            mayor = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a >= b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a ;
            }
        }
        System.out.println("Números ordenados de mayor a menor:");
        System.out.println(mayor);
        System.out.println(medio);
        System.out.println(menor);
        in.close();
        }
    }
