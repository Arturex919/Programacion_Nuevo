package Tema_7_Ficheros.Ejercicios.Ejercicos2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String nombre;

        System.out.println("Ingrese un nombre (o 'fin' para detenerse): ");
        nombre = in.nextLine();

        while (!nombre.equalsIgnoreCase("fin")) {
            System.out.println("Edad: ");
            int edad;
            try {
                edad = Integer.parseInt(in.nextLine());//conviertes el int a String
            } catch (NumberFormatException e) {
                System.out.println("Edad no válida. Inténtalo de nuevo.");
                continue; // Vuelve a pedir el nombre y edad correctamente
            }

            listaPersonas.add(new Persona(nombre, edad));

            // Pedir el siguiente nombre
            System.out.print("Ingrese otro nombre (o 'fin' para detenerse): ");
            nombre = in.nextLine();
        }


        // Guardar la lista en un archivo (Serialización)
        try (ObjectOutputStream escribeObjeto = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            escribeObjeto.writeObject(listaPersonas);
            System.out.println("Lista de personas guardada correctamente en 'personas.dat'.");
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }

        // Leer la lista desde el archivo (Deserialización)
        ArrayList<Persona> listaPersona2;
        try (ObjectInputStream leeObjecto = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            listaPersona2 = (ArrayList<Persona>) leeObjecto.readObject();
            System.out.println("\nPersonas leídas del archivo:");
            for (Persona p : listaPersona2) {
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}


