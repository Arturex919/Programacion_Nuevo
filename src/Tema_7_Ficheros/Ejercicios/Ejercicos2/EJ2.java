package Tema_7_Ficheros.Ejercicios.Ejercicos2;

import java.io.*;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa el nombre del archivo que deseas leer ");
        String archivo = in.nextLine()+".txt";
        String filename="Documentos/Ejercicios2/"+archivo;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
