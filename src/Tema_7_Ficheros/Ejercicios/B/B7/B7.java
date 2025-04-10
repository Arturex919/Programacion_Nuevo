package Tema_7_Ficheros.Ejercicios.B.B7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class B7 {
    public static void main(String[] args) {
        String filename = "Documentos/Libros/coplas_manrique.txt"; // Asegúrate de que el archivo exista
        int cuentaLinea = 0;
        int cuentaPalabra = 0;
        int cuentaCaracter = 0;

        Map<String, Integer> contador = new HashMap<>();

        try {
            File archivo = new File(filename);
         /*solo como no te da*/
            Scanner in = new Scanner(archivo, "UTF-8"); // Leer archivo con codificación UTF-8

            while (in.hasNextLine()) {
                String linea = in.nextLine();
                cuentaLinea++;
                cuentaCaracter += linea.length(); // Sumar caracteres de la línea

                // Normalizar palabras (convertir a minúsculas y eliminar signos de puntuación)
                //replaceall :permite reemplazar todas las ocurrencias de un patrón específico dentro de una cadena de texto.
                String[] palabras = linea.toLowerCase().replaceAll("[^a-zA-Záéíóúüñ ]", "").split("\\s+");

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        cuentaPalabra++;
                        //getOrDefaulte: usa para obtener un valor asociado a una clave.
                        // Si la clave no existe, devuelve un valor por defecto en su lugar.
                        contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
            // Ordenar las palabras por frecuencia en orden descendente
            List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(contador.entrySet());
            listaPalabras.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("Número de líneas: " + cuentaLinea);
            System.out.println("Número de palabras: " + cuentaPalabra);
            System.out.println("Número de caracteres: " + cuentaCaracter);
            System.out.println("Top 10 palabras más comunes:");

            // Mostrar las 10 palabras más frecuentes
            for (int i = 0; i < Math.min(10, listaPalabras.size()); i++) {
                System.out.println(listaPalabras.get(i).getKey() + ": " + listaPalabras.get(i).getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado -> " + filename);
        }
    }
}


