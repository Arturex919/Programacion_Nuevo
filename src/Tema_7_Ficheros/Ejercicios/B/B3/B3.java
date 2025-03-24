package Tema_7_Ficheros.Ejercicios.B.B3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lectura, escritura;

        // Pedir nombres de archivos al usuario
        System.out.println("Ingresa el nombre del archivo de lectura:");
        lectura = in.nextLine();
        System.out.println("Ingresa el nombre del archivo de escritura:");
        escritura = in.nextLine();

        // Lista para almacenar las líneas del archivo
        List<String> personas = new ArrayList<>();

        // Leer el archivo de entrada
        try (BufferedReader br = Files.newBufferedReader(Paths.get(lectura))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                personas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Ordenar la lista alfabéticamente
        Collections.sort(personas);

        //  Mostrar el contenido ordenado en pantalla
        System.out.println("Contenido ordenado:");
        for (String persona : personas) {
            System.out.println(persona);
        }

        // Escribir el contenido ordenado en el archivo de salida
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(escritura))) {
            for (String linea : personas) {
                bw.write(linea);
                bw.newLine(); // Agregar un salto de línea
            }
            System.out.println(" Texto ordenado correctamente en: " + escritura);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
