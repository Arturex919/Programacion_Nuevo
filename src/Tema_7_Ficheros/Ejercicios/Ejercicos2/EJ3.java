package Tema_7_Ficheros.Ejercicios.Ejercicos2;

import java.io.BufferedReader;
import java.io.FileReader;

public class EJ3 {
    public static void main(String[] args) {
        String filename="Documentos/frases.txt";
        int cont=0;
        try(BufferedReader br=new BufferedReader(new FileReader(filename))) {

            String linea;
            while ((linea=br.readLine())!=null){
                String []palabras=linea.split("\\s+");
                cont+=palabras.length;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("El numero de palabras del archivo es:"+cont);
    }
}
