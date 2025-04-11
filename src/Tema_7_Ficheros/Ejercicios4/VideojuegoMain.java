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
                case 3->Funciones.eliminaJuego(juegos);
            }
        }while (opcion!=7);
    }


}
