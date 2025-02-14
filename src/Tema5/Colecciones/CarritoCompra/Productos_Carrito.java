package Tema5.Colecciones.CarritoCompra;


import java.util.Scanner;


public class Productos_Carrito {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    }
    public static void showMenu(){
        System.out.println("\nMenú Principal:");
        System.out.println("1. Agregar producto a la lista general");
        System.out.println("2. Agregar producto al carro de la compra");
        System.out.println("3. Ver lista de productos");
        System.out.println("4. Ver productos en el carro");
        System.out.println("5. Ver productos faltantes por agregar al carro");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

}