package Tema2;

import java.util.Scanner;
public class Tema2_EJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c,mayor;
        System.out.println("ingrese un valor a");
        a = in.nextInt();
        System.out.println("ingrese un valor b");
        b = in.nextInt();
        System.out.println("ingrese un valor c");
        c = in.nextInt();
        mayor =a ;
        if (b>c) {
            mayor = b ;
        }
        if (c>mayor){
            mayor=c ;
        }
        System.out.println("el numero mayor es :"+mayor);
        in.close();
    }
}