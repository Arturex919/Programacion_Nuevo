package Tema5.Colecciones.producto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductosMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Productos> lista = new HashSet<>();  // Conjunto para guardar productos
        boolean sal = false; // Variable para controlar cuándo salir del bucle

        do {
            System.out.println("Añade un producto o escribe 'salir' para terminar:");
            System.out.println("");
            String producto = in.nextLine().trim().toUpperCase();  // trim Eliminar espacios y convertir a mayúsculas
            System.out.println("");
            if (producto.equalsIgnoreCase("salir")) {  // Si escribe "salir", salir del bucle
                sal = true;
            } else {
                Productos nuevoProducto = new Productos(producto);  // Crear nuevo objeto Producto

                if (lista.add(nuevoProducto)) {  // `add` devuelve `true` si el producto no está en el Set
                    System.out.println("El producto '" + producto + "' fue agregado.");
                    System.out.println("");
                } else {
                    System.out.println("El producto '" + producto + "' ya fue ingresado.");
                    System.out.println("");
                }
            }
           // Mostrar la lista de la compra
            System.out.println("Su lista de la compra:");
            for (Productos product : lista) {
                System.out.println("- " + product);  // Mostrar cada producto en la lista
            }

        } while (!sal);

        System.out.println("Gracias por usar la lista de la compra.");
        in.close();
    }
}