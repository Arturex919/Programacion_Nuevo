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
        Libro libro1=new Libro();
        in.nextLine();
        System.out.println("Añade un título:");
        String titulo = in.nextLine();
        libro1.setTitulo(titulo);

        System.out.println("Añade un autor:");
        String autor = in.nextLine();
        libro1.setAutor(autor);
        System.out.println("Añade una editorial:");
        String editorial = in.nextLine();
        libro1.setEditorial(editorial);
        System.out.println("Añade el número:");
        int numero = in.nextInt();
        libro1.setNumero(numero);
        Libro libro = new Libro(libro1.getTitulo(), libro1.getAutor(), libro1.getEditorial(), libro1.getNumero());

        libro.informacion();
    }

    public static void aniadeRevistas(Scanner in) {

        Revista revista1=new Revista();
        in.nextLine();
        System.out.println("Añade un título:");
        String titulo = in.nextLine();
        revista1.setTitulo(titulo);

        System.out.println("Añade el número de publicación:");
        int numeroPublicacion = in.nextInt();
        revista1.setNumeroPublicacion(numeroPublicacion);
        System.out.println("Añade el número:");
        int numero = in.nextInt();
        revista1.setNumero(numero);
        System.out.println("Añade el año:");
        int year = in.nextInt();
        revista1.setYear(year);
        Revista revista = new Revista(revista1.getTitulo(), revista1.getNumeroPublicacion(), revista1.getNumero(), revista1.getYear());
        revista.informacion();
    }

    public static void aniadeDVDs(Scanner in) {
        DVD dvd1 = new DVD();

        in.nextLine();
        System.out.println("Añade un título:");
        String titulo = in.nextLine();
        dvd1.setTitulo(titulo);
        System.out.println("Añade el número:");
        int numero = in.nextInt();
        in.nextLine();
        dvd1.setYear(numero);
        System.out.println("Añade un director:");
        String director = in.nextLine();
        dvd1.setDirector(director);
        System.out.println("Añade el año:");
        int year = in.nextInt();
        dvd1.setYear(year);
        System.out.println("Añade el tipo de DVD:");
        String tipo = in.nextLine();
        dvd1.setTipo(tipo);
        in.nextLine();
        DVD dvd = new DVD(dvd1.getTitulo(), dvd1.getNumero(), dvd1.getDirector(), dvd1.getYear(), dvd1.getTipo());
        dvd.informacion();
    }

}


