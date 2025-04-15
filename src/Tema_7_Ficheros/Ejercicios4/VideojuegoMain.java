package Tema_7_Ficheros.Ejercicios4;

import javax.swing.plaf.FileChooserUI;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class VideojuegoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Videojuego>juegos=new ArrayList<>();
        int opcion;
        do {
            Funciones.showMenu();
            opcion= in.nextInt();
            switch (opcion){
                case 1-> Funciones.agregaJuegosFisicos(juegos,in);
                case 2->Funciones.mostarRakings(juegos);
                case 3->Funciones.eliminaJuego(juegos,in);
                case 4 -> Funciones.guardaBinario(juegos);
                case 5 -> Funciones.cargarBinario(juegos);
                case 6->Funciones.exportarTexto(juegos);
                case 7->Funciones.jugarDemo(juegos,in);
                case 8->Funciones.mostrarLog();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }
        }while (opcion!=0);
    }


}
