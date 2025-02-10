package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, mayor;
        System.out.println("ingrese un valor");
        a = in.nextInt();
        System.out.println("ingrese un valor");
        b = in.nextInt();
        System.out.println("ingrese un valor");
        c = in.nextInt();
        if (a +1 ==b && a+ 2==c){
            System.out.println("el orden es : " +a+","+b+","+c);
        } else if (a>b && a>c){
            System.out.println("el orden es : " +c+","+b+","+a);
        } else {
            System.out.println("no son consecutivos");
        }
        in.close();
    }
}
