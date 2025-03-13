package Tema_7_Ficheros.Ejercicios.B2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class B2 {
    public static void main(String[] args) {
        String filename = "Documentos/alumnos_notas.txt";
        List<Alumno> alumnos = new ArrayList<>();//creas el array para almacenar los alumnnos
        //Devuelve un BufferedReader para leerlo línea por línea
        // Convierte el nombre del archivo (String) en un Path.
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                //split lo usas para dividir las notas,nombre y apellidos
                //creas la variable info con un String para almacenar la informacion
                String[] info = linea.split(" ");

                String nombres = info[0];
                String apellidos = info[1];

                double sumaNotas = 0;
                int totalNotas = 0;
                for (int i = 2; i < info.length ; i++) {
                    //metes el Intenger para que se convierta el String a entero
                    //en el parentesis agrgar tu variable info para que sepa apartir de donde recorre el array
                    //NO TE OLVIDE DE AGREDAR EL CORCCHETE Y DENTRO DE ESTE LA I
                    sumaNotas+=Double.parseDouble(info[i]);
                    totalNotas++;
                }
                //iteras por que si la notas es mayo a cero te hace el caluclo y si no no hace nada
                double media = (totalNotas > 0) ? sumaNotas / totalNotas : 0;
                //lo agregas a la lista
                alumnos.add(new Alumno(nombres, apellidos, media));

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Ordenar la lista de alumnos por nota media de mayor a menor
        //sort se usa para ordenar listas
        //compare cada número con los demás para determinar su orden puedes usarlo con interger u double
        alumnos.sort((a,b)-> Double.compare(b.media, a.media));
        // Mostrar los resultados por pantalla
        System.out.println("Listado de alumnos con su nota media:");
        for (Alumno alumno : alumnos) {
            //%s %s Formatea la salida con nombre, apellido y nota media con 2 decimales.
            System.out.printf("%s %s -> Nota media: %.2f%n", alumno.getNombre(), alumno.getApellido(), alumno.getMedia());
        }
    }
}
