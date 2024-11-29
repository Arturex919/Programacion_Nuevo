package Tema1;

import java.util.Scanner;

public class Tema1Ejercico6 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in) ;
    double R,a ;
    System.out.println("introduzca un valor para R");
    R= in.nextDouble();
    a= 3.14 * (R*R)  ;
    System.out.println("El Radio es = "+ a);
in.close();
}
}
