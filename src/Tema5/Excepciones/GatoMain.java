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

            System.out.println("Añade un nombre (El nombre debe tener más de 3 caracteres):");
            nombre = in.nextLine();  // Leer el nombre
            System.out.println("Ingresa la edad del segundo gato:");
            edad = in.nextInt();  // Leer la edad
            in.nextLine();  // Limpiar el buffer del scanner
            Gato gato2 = new Gato(nombre, edad);
            System.out.println(gato2.toString());
        } catch (IllegalFormatException e) {
            System.out.println("errooor");

        } catch (Exception e) {
            System.out.println("Error: ingresa un formato valido");
        }finally {
            System.out.println("valor asignado correctamente ");
        }
    }
}