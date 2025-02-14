package Tema5.Colecciones.Carrito;

import Tema5.Colecciones.producto.Productos;

import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Carrito_Compras {

    public static void main(String[] args) {
        ArrayList<Productos> lista = new ArrayList<>();
        ArrayList<Productos> carrito = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        boolean sal = false;
        int opcion;
        do {
            System.out.println("Escoje una opcion");
            showMenu();

            opcion = in.nextInt();
            switch (opcion) {
                case 1 -> {
                    agregaLista(lista);
                }
                case 2 -> {
                    muestralista(lista);
                }
                case 3 -> {
                    muestralista(lista);
                    agregaCarrito(lista, carrito);
                }
                case 4 -> {
                    verCarrito(carrito);
                }
                case 5 -> {
                    faltantes(carrito,lista);
                }

                case 6 -> {
                    System.out.println("Hasta luego");
                    sal = true;
                }
            }
        } while (opcion != 6);
    }

    public static void showMenu() {

        System.out.println("Que deseas hacer");
        System.out.println("1. Añadir a la lista");
        System.out.println("2. ver lista");
        System.out.println("3 agregar al carrito");
        System.out.println("4. ver carrito");
        System.out.println("5. ver articulos que faltan añadir al carrito");
        System.out.println("6. salir");
    }

    //agrega la lista
    //si gat cosas un true y no hay false
    public static void agregaLista(ArrayList<Productos> lista) {
        Scanner in = new Scanner(System.in);
        boolean sal = false;
        while (!sal) {
            System.out.println("Ingresa la cosa que quieres añadir a la lista o escribe para salir");
            String producto = in.nextLine().trim().toUpperCase();
            if (producto.equalsIgnoreCase("salir")) {
                sal=true;
            } else if (producto.isEmpty()) {
                System.out.println("no se añadio ni un producto");
            }
            Productos productos = new Productos(producto);
            if (!lista.contains(productos)) {
                lista.add(productos);//añade a la lista y si se repite te indica
                System.out.println("Se ha añadido " + productos + " a la lista de compra");
            } else {
                System.out.println(productos + " Ya esta en la lista");
            }
            muestralista(lista);
        }
    }

    //muestra la lista
    public static void muestralista(ArrayList<Productos> lista) {

        if (lista.isEmpty()) {
            System.out.println("La lista de compra esta vacia");
        } else {
            System.out.println("Su lista de la compra:");
            for (Productos product : lista) {
                System.out.println("- " + product);  // Mostrar cada producto en la lista
            }
        }
    }

    public static void agregaCarrito(ArrayList<Productos> lista, ArrayList<Productos> carrito) {
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Que producto quieres añadir al carrito");
        System.out.println("escribe el nombre de un producto o escribe salir para irse del carrito");
        String productoAgregado = in.nextLine();

        if (productoAgregado.equalsIgnoreCase("salir")) {
            salir = true;
        } else if (productoAgregado.isEmpty()) {
            System.out.println("no se agrego ni un producto al carrito");
        }

        Productos productos = new Productos(productoAgregado);

        if (!lista.contains(productos)) {
            System.out.println("Este producto no existe,agregalo a la lista");
        } else if (!carrito.contains(productos)) {//si no esta en el carrito se agrega
            carrito.add(productos);//añade de la lista
            System.out.println(productos + " se agrego correctamente");
            lista.remove(productos);//elimina el producto de la lista que se añadio al carrito
            System.out.println(productos + " se tacho de la lista");
            muestralista(lista);
        } else {
            System.out.println(productos + " ya esta en el carrito");
        }
    }

    public static void verCarrito(ArrayList<Productos> carrito) {

       if (carrito.isEmpty()) {
           System.out.println("El carrito esta vacio");
       }else {
           System.out.println("Los productos en el carrito son: ");
           for (Productos carro : carrito) {
               System.out.println(carro);
           }
       }
    }

    public static void faltantes(ArrayList<Productos> carrito,ArrayList<Productos> lista) {
        HashSet<Productos> faltan=new HashSet<>(lista);//usamos el hanset por que no evita duplicados
        faltan.removeAll(carrito);// nos elimina de la lista los productos que ya estan en el carrito
        if (faltan.isEmpty()){
            System.out.println("No hace falta añadir nada al carrito");
        }else {
            System.out.println("Los productos que faltan son");
            for (Productos faltante : faltan){
                System.out.println("-" + faltante);
            }
        }

    }


}
