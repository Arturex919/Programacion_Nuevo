package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int opciones;
        System.out.println("escriba 0 para cuadrado,escriba 1 para rectangulo,escriba 2 para triangulo");
        opciones=in.nextInt();
       switch (opciones) {
           case 0 -> {
               double ladoa, Area, perimetro;
               System.out.println("ingrese el lado del cuadrado");
               ladoa = in.nextDouble();
               Area = ladoa * ladoa;
               perimetro = 4 * ladoa;
               System.out.println("el area del cuadrado es= " + Area);
               System.out.println("el perimetro del cruadrado es=" + perimetro);
           }
           case 1 -> {
               double h, b, area, per;
               System.out.println("Ingrese el valor de la altura");
               h = in.nextDouble();
               System.out.println("Ingrese el valor de la base");
               b = in.nextDouble();
               area = b * h;
               per = b + b + h + h;
               System.out.println("el area del rectangulo es= " + area);
               System.out.println("el perimetro del rectangulo es=" + per);
           }
           case 2 -> {
               double B, H, Ar, Pe;
               System.out.println("Ingrese el valor de la altura");
               H = in.nextDouble();
               System.out.println("Ingrese el valor de la base");
               B = in.nextDouble();
               Ar = (B * H) / 2;
               Pe = B + B + B;
           }
       }
       in.close();
    }
}
