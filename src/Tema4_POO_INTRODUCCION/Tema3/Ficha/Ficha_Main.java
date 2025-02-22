package Tema4_POO_INTRODUCCION.Tema3.Ficha;

import java.util.Scanner;

public class Ficha_Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char opcion;
    boolean salir = false;

        do {
        System.out.println("Elige una opción:");
        showMenu();
        opcion = in.next().toUpperCase().charAt(0); // Convertimos la entrada a mayúscula

        switch (opcion) {
            case 'A' -> aniadeLibros(in);
            case 'B' -> aniadeRevistas(in);
            case 'C' -> aniadeDVDs(in);
            case 'D' -> {
                System.out.println("¡Adiós!");
                salir = true;
            }
            default -> System.out.println("Opción no válida. Intente de nuevo.");
        }
    } while (!salir);

}

public static void showMenu() {
    System.out.println("==== MENÚ ====");
    System.out.println("A) Libros");
    System.out.println("B) Revistas");
    System.out.println("C) DVDs");
    System.out.println("D) Salir");
}

public static void aniadeLibros(Scanner in) {

        in.nextLine();
    System.out.println("Añade un título:");
    String titulo = in.nextLine();

    System.out.println("Añade un autor:");
    String autor = in.nextLine();

    System.out.println("Añade una editorial:");
    String editorial = in.nextLine();

    System.out.println("Añade el número:");
    int numero = in.nextInt();

    Libro libro=new Libro(titulo,autor,editorial,numero);
    libro.informacion();
}

public static void aniadeRevistas(Scanner in) {
    in.nextLine();

    System.out.println("Añade un título:");
    String titulo = in.nextLine();

    System.out.println("Añade el número de publicación:");
    int numeroPublicacion = in.nextInt();

    System.out.println("Añade el número:");
    int numero = in.nextInt();

    System.out.println("Añade el año:");
    int anio = in.nextInt();

    Revista revista=new Revista(titulo,numero,numeroPublicacion,anio);
    revista.informacion();
}

public static void aniadeDVDs(Scanner in) {
    in.nextLine();
    System.out.println("Añade un título:");
    String titulo = in.nextLine();

    System.out.println("Añade el número:");
    int numero = in.nextInt();

    System.out.println("Añade un director:");
    String director = in.nextLine();

    System.out.println("Añade el año:");
    int anio = in.nextInt();
    in.nextLine();

    System.out.println("Añade el tipo de DVD (Animación, Acción, Documental, etc.):");
    String tipo = in.nextLine();

    DVD dvd=new DVD(titulo,numero,director,anio,tipo);
    dvd.informacion();
}
}

