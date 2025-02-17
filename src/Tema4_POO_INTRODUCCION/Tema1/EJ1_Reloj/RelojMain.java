package Tema4_POO_INTRODUCCION.Tema1.EJ1_Reloj;

import java.util.Scanner;

public class RelojMain {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora = 0, min = 0, seg = 0;
        Reloj relojVacio = new Reloj();
        Reloj reloj = new Reloj();
        System.out.println("Reloj vacio");
        relojVacio.mostrarHora();
        System.out.println("añade hora");
        hora = in.nextInt();
        reloj.setHora(hora);
        System.out.println("añade min");
        min = in.nextInt();
        reloj.setMin(min);
        System.out.println("añade seg");
        seg = in.nextInt();
        reloj.setSeg(seg);
        reloj.setFormato(true);
        reloj.mostrarHora();

    }
}
