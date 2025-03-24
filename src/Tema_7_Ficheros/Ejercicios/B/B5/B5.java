package Tema_7_Ficheros.Ejercicios.B.B5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B5 {
    public static void main(String[] args) {
        String paginasDiccionario = "Documentos/diccionario.txt";//va a ser las paginas del texto
        String carpetaDiccionario = "Diccionario";//nombre de la carpeta

        File carpeta = new File(carpetaDiccionario);
        if (!carpeta.exists()) {//si la carperta no existe la crea
            carpeta.mkdir();//creas la carpeta en caso de no exista
        }
        //vas a clasificar las palabras como clave
        Map<Character, List<String>> palabrasDiccionario = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(paginasDiccionario))) {
            String palabras;
            while ((palabras = br.readLine()) != null) {
                palabras = palabras.trim();
                if (!palabras.isEmpty()) {
                    char primeraLetra = Character.toUpperCase(palabras.charAt(0));
                    //verifica si la letra ya está en el map
                    if (!palabrasDiccionario.containsKey(primeraLetra)) {
                        //en caso de que no crea una lista vacía para esa letra.
                        palabrasDiccionario.put(primeraLetra, new ArrayList<>());
                    }
                    // obtienes la primera letra y la agregas a la palbra
                    palabrasDiccionario.get(primeraLetra).add(palabras);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //esta nos recorre la lestras del diccionario,nos va a devolver las letras del hasmap
        for (Map.Entry<Character, List<String>>entrada : palabrasDiccionario.entrySet()){
            //entrada.getKey() esta obtiene la letra actual que se ubica en el diccionario
            File archivo=new File(carpetaDiccionario + "/"+entrada.getKey()+".txt");
            //escribe en el archivo
            try(BufferedWriter bw=new BufferedWriter(new FileWriter(archivo))){

                for (String palabras: entrada.getValue()){
                    bw.write(palabras);
                    bw.newLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

