package Tema_7_Ficheros.Ejercicios.B7;

import java.io.File;
import java.util.*;

public class B7 {
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        String filename="Documentos/Libros";
        File archivo=new File(filename);
         int cuentaLinea=0;
         int cuentaPalabra=0;
         int cuentaCaracter=0;

        Map<String,Integer>contador=new HashMap<>();//la utilizamos para contar las palabras
        while (in.hasNextLine()){
            String linea=in.nextLine();
            cuentaLinea++;
            cuentaCaracter++;
            String []almacen=linea.toLowerCase().replaceAll("[^a-zA-Záéíóúüñ ]","").split("\\s+");
            for (String palabras:almacen){
                if (!palabras.isEmpty()){
                    cuentaPalabra++;
                    contador.put(palabras,contador.getOrDefault(palabras,0)+1);
                }
            }
        }
        // Ordenar las palabras por frecuencia de aparición en orden descendente
        //AGREGAS EL ARRAY LIST PARA PARA QUE SE
        List<Map.Entry<String, Integer>> arreglaPalbras = new ArrayList<>(contador.entrySet());
        arreglaPalbras.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Mostrar resultados estadísticos
        System.out.println("Número de líneas: " + cuentaLinea);
        System.out.println("Número de palabras: " + cuentaPalabra);
        System.out.println("Número de caracteres: " + cuentaCaracter);
        System.out.println("\nTop 10 palabras más comunes:");

        // Imprimir las 10 palabras más frecuentes
        for (int i = 0; i < Math.min(10, arreglaPalbras.size()); i++) {
            System.out.println(arreglaPalbras.get(i).getKey() + ": " + arreglaPalbras.get(i).getValue());
        }

    }
}
