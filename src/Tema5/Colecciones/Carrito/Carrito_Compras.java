package Tema5.Colecciones.Carrito;

import Tema5.Colecciones.producto.Productos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrito_Compras {
    private static ArrayList <Productos>lista=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean sal=false;
        int opcion= in.nextInt();
        do {
            System.out.println("Escoje una opcion");
            showMenu();
            switch (opcion){
                case 1 ->{
                    muestralista();
                }
                case 2->{
                    muestralista();
                }
                case 5->{
                    System.out.println("Hasta luego");
                    sal=true;
                }
            }
        }while (opcion!=5);
    }

    public static  void showMenu(){

        System.out.println("Que deseas hacer");
        System.out.println("1. Añadir a la lista");
        System.out.println("2. ver lista");
        System.out.println("3 agregar al carrito");
        System.out.println("4. eliminar del carrito");
        System.out.println("5. salir");
    }
    public static void muestralista(){
        System.out.println("Su lista de la compra:");
        for (Productos product : lista) {
            System.out.println("- " + product);  // Mostrar cada producto en la lista
        }
    }
}
