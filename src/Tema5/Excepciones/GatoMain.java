package Tema5.Excepciones;

import java.util.IllegalFormatCodePointException;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class GatoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gato gato = new Gato();
        String nombre;
        int edad;
        try {
            System.out.println("añade un nombre(El nombre debe tener mas de 3 caracteres)");
            nombre = in.nextLine();
            gato.setNombre(nombre);
            System.out.println("ingresa una edad");
            edad = in.nextInt();
            gato.setEdad(edad);
            Gato gato1 = new Gato(nombre, edad);
            System.out.println(gato1.toString());
            in.nextLine();
            Gato gatico = new Gato();
            System.out.println("Añade un nombre (El nombre debe tener más de 3 caracteres):");
            nombre = in.nextLine();
            gatico.setNombre(nombre);
            System.out.println("Ingresa la edad del segundo gato:");
            edad = in.nextInt();
            gatico.getEdad();
            Gato gato2 = new Gato(nombre, edad);
            System.out.println(gato2.toString());
        } catch (IllegalFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.getMessat
        }
    }
}