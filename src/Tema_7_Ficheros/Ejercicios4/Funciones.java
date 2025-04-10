package Tema_7_Ficheros.Ejercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones extends Videojuego {
    public Funciones(String titulo, String plataforma, String tipo, int nota) {
        super(titulo, plataforma, tipo, nota);
    }

    public static void showMenu(){
        System.out.println("1. Añadir videojuego (físico o digital).");
        System.out.println("2. Mostrar ranking completo.            ");
        System.out.println("3. Eliminar videojuego por título.      ");
        System.out.println("4. Guardar ranking en fichero binario.  ");
        System.out.println("5. Cargar ranking desde fichero.        ");
        System.out.println("6. Exportar ranking a texto             ");
        System.out.println("7.Salir");
    }
    public static void agregaJuegosFisicos(ArrayList<Videojuego>juegoFisico,Scanner in){
        boolean sal=true;
        while (!sal){
            int opcion=in.nextInt();
        switch (opcion){
            case 1-> {
                System.out.println("Ingresa el titulo del Juego");

                String titulo = in.nextLine();
                System.out.println("Ingresa el tipo de plataforma");
                String plataforma = in.nextLine();
                System.out.println("Ingresa el tipo");
                String tipo = in.nextLine();
                System.out.println("Ingresa la nota");
                int nota = in.nextInt();
            VideojuegoFisico
            }



    }
}
