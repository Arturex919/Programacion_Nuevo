package Tema_7_Ficheros.Ejercicios4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public  class Funciones  {

    public  static  void showMenu() {
        System.out.println("================ MENU ==================");
        System.out.println("1. Añadir videojuego (físico o digital).");
        System.out.println("2. Mostrar ranking completo.            ");
        System.out.println("3. Eliminar videojuego por título.      ");
        System.out.println("4. Guardar ranking en fichero binario.  ");
        System.out.println("5. Cargar ranking desde fichero.        ");
        System.out.println("6. Exportar ranking a texto             ");
        System.out.println("7.Salir");
    }

    public static void agregaJuegosFisicos(ArrayList<Videojuego> juego, Scanner in) {
        boolean sal = true;
        int opcion;

        do {
            System.out.println("===Escoje el tipo de juego===");
            System.out.println("1) Juego Fisico");
            System.out.println("2) Juego Virtual");
            System.out.println("3) Salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> {
                    in.nextLine();
                    System.out.println("Ingresa el titulo del Juego");
                    String titulo = in.nextLine();
                    System.out.println("Ingresa el tipo de plataforma");
                    String plataforma = in.nextLine();
                    System.out.println("Ingresa la nota");
                    int nota = in.nextInt();
                    System.out.println("Ingresa la tienda donde ");
                    String tiendaCompra = in.nextLine();
                    in.nextLine();
                    System.out.println("escoje el Estado juego");
                    String estado = in.nextLine();
                    VideojuegoFisico juegoF = new VideojuegoFisico(titulo, plataforma, "fisico", nota, tiendaCompra, estado);
                    juego.add(juegoF);
                    System.out.println("Juego añadido correctamente");
                }
                case 2 -> {
                    System.out.println("Ingresa el titulo del Juego");
                    String titulo = in.nextLine();
                    System.out.println("Ingresa el tipo de plataforma");
                    String plataforma = in.nextLine();
                    System.out.println("Ingresa la nota");
                    int nota = in.nextInt();
                    System.out.println("Ingresa la tienda donde ");
                    String tiendaCompra = in.nextLine();
                    System.out.println("escoje el Estado juego");
                    String estado = in.nextLine();
                    System.out.println("ingresa el peso del juego");
                    double tamaniGB = in.nextInt();
                    VideojuegoDigital virtuales = new VideojuegoDigital(titulo, plataforma, "Digital", nota, tiendaCompra, tamaniGB);
                    juego.add(virtuales);
                }
                case 3 -> {
                    System.out.println("Adios");
                    sal = true;
                }
            }
        }while (opcion != 3) ;
    }
    //ver porq no se muestra la nota
    public static void mostarRakings(ArrayList<Videojuego> juego){
        juego.sort((j1, j2) -> Integer.compare(j1.getNota(), j2.getNota()));
        if (juego.isEmpty()){
            System.out.println("lista vacia");
        }else {
            for (Videojuego raking : juego) {
                System.out.println(raking.getNota());
            }
        }
    }
    public static void eliminaJuego(ArrayList<Videojuego>juego,Scanner in){
        if (juego.isEmpty()){
            System.out.println("lista vacia");
        }else {
            for (Videojuego eliminadoJuego:juego){
                System.out.println(eliminadoJuego);
                System.out.println("");
                System.out.println("Añade el titulo al juego a eliminar");
                String tituloJuego=in.nextLine().trim();
                boolean eliminado= juego.removeIf(j1->eliminadoJuego.getTitulo().equalsIgnoreCase(tituloJuego));
            if (eliminado){
                System.out.println("JUego eliminado "+tituloJuego);
            }else {
                System.out.println("problemas en eliminar el juego");
            }
            }
        }
    }
}
