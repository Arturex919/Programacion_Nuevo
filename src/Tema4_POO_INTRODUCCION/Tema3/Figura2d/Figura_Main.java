package Tema4_POO_INTRODUCCION.Tema3.Figura2d;

import java.util.Scanner;

public class Figura_Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Cuadrado cuadrado=new Cuadrado(2);
        cuadrado.calculaArea();
        cuadrado.calculaPerimetro();
        System.out.println(cuadrado);
        System.out.println();

        Rectangulo rectangulo=new Rectangulo(2,10);
        rectangulo.calculaArea();
        rectangulo.calculaPerimetro();
        System.out.println(rectangulo);

        System.out.println();

        Triangulo triangulo=new Triangulo(2,10);
        triangulo.calculaArea();
        triangulo.calculaPerimetro();
        System.out.println(triangulo);

        System.out.println();
        Circulo circulo=new Circulo(3);
        circulo.calculaArea();
        circulo.calculaPerimetro();
        System.out.println(circulo);
    }
}
