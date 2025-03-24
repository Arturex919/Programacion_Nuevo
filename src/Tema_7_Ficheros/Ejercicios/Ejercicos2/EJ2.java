package Tema_7_Ficheros.Ejercicios.Ejercicos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EJ2 {
    public static void main(String[] args) {
        File archivo=new File("prueba.txt");
        try {
            FileReader archivos=new FileReader(archivo);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
