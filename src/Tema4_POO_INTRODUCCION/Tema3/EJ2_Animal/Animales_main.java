package Tema4_POO_INTRODUCCION.Tema3.EJ2_Animal;

import java.util.Scanner;

public class Animales_main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        Perro perro=new Perro("tobby");
        System.out.println("ingresa el nombre del animal");
        perro.comer();
        perro.dormir();
        perro.hacerRuido();
        perro.cuidar();
        System.out.println();
        System.out.println();
        Gato gato=new Gato("michu");
        gato.hacerRuido();
        gato.comer();
        gato.dormir();
        gato.afilarGarra();
        System.out.println();
        Pajaro canario=new Pajaro("loro");
        canario.hacerRuido();
        canario.comer();
        canario.dormir();
        canario.volar();
        System.out.println();
        Caballo caballo=new Caballo("zoe");
        caballo.hacerRuido() ;
        caballo.comer();
        caballo.dormir();
        caballo.Galopar();
        System.out.println();
        Pez dorado=new Pez("pez espada");
        dorado.hacerRuido();
        dorado.comer();
        dorado.dormir();
        dorado.nada();
    }

}
