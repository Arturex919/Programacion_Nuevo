package Tema_7_Ficheros.Ejercicios.Ejercicios2;

import java.io.*;

public class EJ4Persona {

    public static void main(String[] args) {
         Persona persona=new Persona("ximo",25);

         String filename="Documentos/Ejercicios2/persona.dat";
         //Usamos ObjectOutputStream junto con FileOutputStream
        // para escribir el objeto en el archivo persona.dat.
         try(ObjectOutputStream objeto=new ObjectOutputStream(new FileOutputStream(filename))) {
             // almacena en un archivo binario o se envía a otro sistema
             objeto.writeObject(persona);
             System.out.println("El objeto Persona ha sido serializado correctamente.");

         }
         catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
