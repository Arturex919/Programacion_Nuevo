package Tema_7_Ficheros.Ejercicios.B.B6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        try {
        Scanner in=new Scanner(System.in);
        //files.readSTRING usa un Path of que no leera la ruta del documento
        String filenames= Files.readString(Path.of("Documentos/pi-million.txt"));
        System.out.println("ingrese un numero");
        String numero=in.nextLine();

        //guardamos los numero buscado en el metodo en una variable
        int posicion=buscadorNumero(filenames,numero);
            if (posicion != -1) {
                System.out.println("El número " +  numero+ " aparece en los decimales de pi en la posición: " + posicion);
            } else {
                System.out.println("El número " + numero  + " no se encuentra en los primeros 1,000,000 de decimales de pi.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //creas el metodo para buscar el numero
    public static int buscadorNumero(String txt,String num){
        //creas dos variables y adjutas los parametros para que tome en cuenta la longitud de esta
        int longText=txt.length();
        int longNum=num.length();

        //vamos a recorrer la cadena de pi y la restamos para comprobrar
        // el numero del usuario con el nuestro para comprobrar la posicion en la que se encuenta
        for (int i = 0; i < longText-longNum; i++) {
            //creamos la variable para comprobar si existe o no
            boolean existe=true;

            for (int j = 0; j < longNum; j++) {
                if (txt.charAt(i+j)!=num.charAt(j)){
                    existe=false;
                }
            }
            if (existe){
                return i;//nos devolvera la posicion de donde se encuentra
            }
        }
        return -1;//en caso de que no exista nos devuelve -1
    }
}
