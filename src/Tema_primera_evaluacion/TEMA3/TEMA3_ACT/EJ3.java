package Tema_primera_evaluacion.TEMA3.TEMA3_ACT;

import java.util.Scanner;
//Crea un programa que pida al usuario un radio válido por teclado (>0) y
//calcule la superficie y perímetro de un Circulo. Necesitarás implementar
//y utilizar las siguientes funciones:
//boolean validRadius(radius)
//double calculateCirclePerimeter(radius)
//double calculateCircleArea(radius)//

public class EJ3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double radio;
        do {
            System.out.println("inserte un radio");
            radio = in.nextDouble();

        }while(!validRadius(radio));

         double per=calculateCiclePerimeter(radio);
        double areaF=calculateCircleArea(radio);
        System.out.println("El perimetro es: "+per);
        System.out.println("El area es: "+areaF);
    }
    public static boolean validRadius(double radius){
        if (radius<=0){
            System.out.println("su no radio es valido");
            return false;
        }
            return true;

    }
    public static double calculateCiclePerimeter(double radius){
        double perimetro;
        perimetro=2*3.14*radius;
        return perimetro;
    }
    public static double calculateCircleArea(double radius){
        double area;
        area= 3.14*radius*radius;
        return area;
    }
}
