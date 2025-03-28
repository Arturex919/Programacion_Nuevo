package Tema_7_Ficheros.Ejercicios.Ejercicos2;
import java.io.*;
import java.util.ArrayList;
public class EJ6 {

    public static void main(String[] args) {
        String filename = "Documentos/Ejercicios2/persona.dat";
        ArrayList<Persona> listaPersonas;
        // Deserializar el archivo
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            listaPersonas = (ArrayList<Persona>) in.readObject();
            System.out.println("Lista de personas cargadas desde el archivo personas.dat:");

            for (Persona p : listaPersonas) {
                System.out.println(p);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}