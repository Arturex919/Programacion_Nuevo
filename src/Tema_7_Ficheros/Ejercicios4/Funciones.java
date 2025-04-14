package Tema_7_Ficheros.Ejercicios4;

import Tema4_POO_INTRODUCCION.Tema3.EJ5_RedSocial.Publicacion;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.in;

public  class Funciones  {

    public static final String  FILE_TXT ="Documentos/Ejercicios4/ranking.txt";
    public static final String FILE_BIN = "Documentos/Ejercicios4/ranking.bin";

    public  static  void showMenu() {
        System.out.println("================ MENU ==================");
        System.out.println("1. Añadir videojuego (físico o digital).");
        System.out.println("2. Mostrar ranking completo.            ");
        System.out.println("3. Eliminar videojuego por título.      ");
        System.out.println("4. Guardar ranking en fichero binario.  ");
        System.out.println("5. Cargar ranking desde fichero.        ");
        System.out.println("6. Exportar ranking a texto             ");
        System.out.println("7. Jugar demo");
        System.out.println("0.Salir");
    }

    public static void agregaJuegosFisicos(ArrayList<Videojuego> juego, Scanner in) {
        boolean sal = true;
        int opcion;

        do {
            System.out.println("===Escoje el tipo de juego===");
            System.out.println("1) Juego Fisico");
            System.out.println("2) Juego Virtual");
            System.out.println("3) Volver al menú");
            opcion = in.nextInt();
            in.nextLine(); // limpiar

            switch (opcion) {

                        case 1 -> {
                            try {

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
                            VideojuegoFisico juegoF = new VideojuegoFisico(titulo, plataforma, nota, tiendaCompra, estado);
                            juego.add(juegoF);
                            System.out.println("Juego añadido correctamente");

                        }catch (NotaInvalida e){
                                System.out.println(e);
                            }
                        }
                        case 2 -> {
                            try {
                            System.out.println("Ingresa el titulo del Juego");
                            String titulo = in.nextLine();
                            System.out.println("Ingresa el tipo de plataforma");
                            String plataforma = in.nextLine();
                            System.out.println("Ingresa la nota");
                            int nota = in.nextInt();
                            System.out.println("Ingresa la tienda donde ");
                            String tiendaCompra = in.nextLine();
                            in.nextLine();
                            System.out.println("ingresa los GB del juego(SOLO NUMEROS)");
                            double tamaniGB = in.nextInt();
                            VideojuegoDigital virtuales = new VideojuegoDigital(titulo, plataforma, nota, tiendaCompra, tamaniGB);
                            juego.add(virtuales);
                        }catch (NotaInvalida e) {
                                System.out.println(e);
                            }
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
        juego.sort(Comparator.comparingInt(Videojuego::getNota));/*orden de mayot a menor*/
        if (juego.isEmpty()){
            System.out.println("lista vacia");
        }else {
            for (Videojuego raking : juego) {
                System.out.println(raking.getNota()+" - "+raking.getTitulo());
            }
        }
    }
    public static void eliminaJuego(ArrayList<Videojuego>juego,Scanner in) {
        if (juego.isEmpty()) {
            System.out.println("lista vacia");
        } else {
            for (Videojuego eliminadoJuego : juego) {
                System.out.println(eliminadoJuego);
                System.out.println("");
                System.out.println("Añade el titulo al juego a eliminar");
                String tituloJuego = in.nextLine().trim();
                boolean eliminado = juego.removeIf(j -> j.getTitulo().equalsIgnoreCase(tituloJuego));
                if (eliminado) {
                    System.out.println("JUego eliminado " + tituloJuego);
                } else {
                    try {
                        throw new JuegoNoEncontrado("problemas en eliminar el juego");
                    } catch (JuegoNoEncontrado e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
    /*Binario con Objetos no te olvides*/
    public  static  void guardaBinario(ArrayList<Videojuego>juego) {
        try(ObjectOutputStream bin=new ObjectOutputStream(new FileOutputStream(FILE_BIN))){
            bin.writeObject(juego);
            System.out.println("Juegos guardados correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void cargarBinario(ArrayList<Videojuego> juego) {
        try (ObjectInputStream binlee=new ObjectInputStream(new FileInputStream(FILE_BIN))){
            /*HACEMOS OTRA LISTA PARA USARLA COMO VARIABLE*/
            ArrayList<Videojuego>carga=(ArrayList<Videojuego>)binlee.readObject();
            juego.clear();
            juego.addAll(carga);

            System.out.println("Cargado perfectamente");
        } catch (IOException|ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void exportarTexto(ArrayList<Videojuego> juegos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_TXT))) {
            for (Videojuego v : juegos) {
                pw.println(v);
            }
            System.out.println("Ranking exportado a texto.");
        } catch (IOException e) {
            System.out.println("Error al exportar: " + e.getMessage());
        }
    }
    public  static void jugarDemo(ArrayList<Videojuego>juego,Scanner in){
        System.out.println("ingresa el titulo que deseas jugar ");
        String titulo=in.nextLine();
        boolean encontrado=false;
        for (Videojuego juegos:juego){
            /*instanceof instacias la interfaz*/
            if (juegos.getTitulo().equalsIgnoreCase(titulo)&& juegos instanceof IJugable){
                ((IJugable)juegos).JugarDemo();
                encontrado=true;
            }
            if (!encontrado){
                System.out.println("Juego no encontrado o no jugable.");
            }
        }
    }
}
/*PREGUNTAR A ANA SI LE VALE ESTO

public static ArrayList<Videojuego> cargarBinario() {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filenamebin))) {
        return (ArrayList<Videojuego>) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al cargar: " + e.getMessage());
        return new ArrayList<>();
    }
}*/