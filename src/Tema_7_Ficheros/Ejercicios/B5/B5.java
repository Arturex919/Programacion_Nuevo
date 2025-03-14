package Tema_7_Ficheros.Ejercicios.B5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class B5 {
    public static void main(String[] args) {
        String paginasDiccionario = "diccionario.txt";//va a ser las paginas del texto
        String carpetaDiccionario = "Diccionario";//nombre de la carpeta

        File carpeta = new File(carpetaDiccionario);
        if (!carpeta.exists()) {//si la carperta no existe la crea
            carpeta.mkdir();//creas la carpeta en caso de no exista
        }
        Map<Character, String> palabrasDiccionario = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(paginasDiccionario))) {
            String palabras = "";
            while ((palabras = br.readLine()) != null) {
                palabras = palabras.trim();
                if (!palabras.isEmpty()){
                    char primerpalabra = Character.toUpperCase(palabras.charAt(0));
                    // Verificar si ya existe la clave en el mapa
                    if (!palabrasDiccionario.containsKey(primerpalabra)) {
                        palabrasDiccionario.put(primeraLetra, new ArrayList<>());
                    }

                    // Agregar la palabra a la lista
                    palabrasDiccionario.get(primeraLetra).add(palabra);
                }                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
