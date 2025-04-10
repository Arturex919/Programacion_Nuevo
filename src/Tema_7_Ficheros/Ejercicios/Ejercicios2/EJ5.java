package Tema_7_Ficheros.Ejercicios.Ejercicios2;

import java.io.*;

public class EJ5 {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Documentos/Ejercicios2/persona.dat"))) {
            // Leer el objeto desde el archivo
            Persona personaVuelve = (Persona) in.readObject();

            System.out.println("Objeto deserializado: " + personaVuelve);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
