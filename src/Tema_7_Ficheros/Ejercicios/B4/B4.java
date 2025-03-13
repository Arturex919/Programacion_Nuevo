package Tema_7_Ficheros.Ejercicios.B4;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "Documentos/usa_nombres.txt";
        String apellido = "Documentos/usa_apellidos.txt";

        System.out.print("¿Cuántos nombres deseas generar?: ");
        int cantidad = in.nextInt();

        System.out.print("Ingresa el nombre del archivo donde guardar los nombres: ");
        String archivoSalida = in.nextLine().trim();

        //añades los usuarios en el arraylist
        List<String> nombres = new ArrayList<>();
        List<String> apellidos = new ArrayList<>();

        //usamos el primer lector para que lea los nombres
        try (BufferedReader br = Files.newBufferedReader(Paths.get(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nombres.add(linea);//agrega al list nombre
            }
        } catch (IOException e) {
            System.err.println("Error al leer usa_nombres.txt" + e.getMessage());
            return;
        }

        //usamos el segundo lector para que lea los nombres
        try (BufferedReader br = Files.newBufferedReader(Paths.get(apellido))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                apellidos.add(linea);//agrega al list apellido
            }
        } catch (IOException e) {
            System.err.println("Error al leer usa_apellidos.txt"+e.getMessage());
            return;
        }

        //vas a generar el list ya que esta va almacenar los nombres randoms
        List<String> nombresGenerados = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            //obtienes los nombres y le metes un random y para que coja el tamaño del array usas un.size
            String nombre1 = nombres.get(random.nextInt(nombres.size()));
            //obtienes los apellidos y le metes un random y para que coja el tamaño del array usas un.size
            String apellido1 = apellidos.get(random.nextInt(apellidos.size()));
            nombresGenerados.add(nombre1 + " " + apellido1);//lo guardas en el array de nombres generado
        }

        // Guardar los nombres generados en el archivo de salida
        //StandardOpenOption.CREATE: Si el archivo no existe, lo crea automáticamente.
        //StandardOpenOption.APPEND: Si el archivo ya existe, añade el contenido al final en vez de sobrescribirlo.
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(archivoSalida), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (String linea : nombresGenerados) {
                bw.write(linea);//lo escribes
                bw.newLine();
            }
            System.out.println(" Nombres generados y guardados en " + archivoSalida);
        } catch (IOException e) {
            System.err.println("Error al escribir en " + archivoSalida);
        }
    }
}
