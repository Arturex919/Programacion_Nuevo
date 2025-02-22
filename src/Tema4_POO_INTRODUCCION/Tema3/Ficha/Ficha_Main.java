package Tema4_POO_INTRODUCCION.Tema3.Ficha;

import java.util.Scanner;

public class Ficha_Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Libro libros=new Libro("it","sthepen king","SK",12);
        libros.informacion();
        System.out.println();
        Revista revista=new Revista("VOUGE",1,195,2012);
        revista.informacion();
        System.out.println();
        DVD dvd=new DVD("scary movie",1,"J.Jackson",2002,"comedia");
        dvd.informacion();

    }
}
