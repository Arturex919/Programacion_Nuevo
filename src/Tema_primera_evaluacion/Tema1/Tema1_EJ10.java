package Tema_primera_evaluacion.Tema1;

import java.util.Scanner;
public class Tema1_EJ10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c, d, e, f;
        System.out.println("inserte un valor para a");
        a = in.nextDouble();
        System.out.println("inseter un valor para b");
        b = in.nextDouble();
        c = a + b;
        d = a * b;
        e = a - b;
        f = a / b;
        System.out.println("el resultado de la suma es = " + c);
        System.out.println("el resultado del producto es =" + d);
        System.out.println("el resultado de la resta es = " + e);
        System.out.println("el resultado de la divison es=" + f);

    }
}
