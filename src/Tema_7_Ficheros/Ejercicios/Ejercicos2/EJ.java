package Tema_7_Ficheros.Ejercicios.Ejercicos2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EJ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("ingresa el nombre del archivo");
        String filename=in.nextLine()+".txt";
        System.out.println("Inserta un nombre");
        String nombre= in.nextLine();
        System.out.println("inserta un numero");
        int anio=in.nextInt();
        File archivo=new File("Documentos/Ejercicios2"+File.separator+filename);
        try {
            if (archivo.createNewFile()) {
                System.out.println("el archivo "+archivo.getName()+" fue creado con exito");
            }else {
                System.out.println("El archivo ya existe en " + archivo.getAbsolutePath());
                System.out.println();
                System.out.println("Los datos fuero agragados a "+archivo.getName());
            }
            FileWriter archivos=new FileWriter(archivo);
            archivos.write("nombre: "+nombre+"\n");
            archivos.write("año: "+anio+ "\n");
            archivos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}
