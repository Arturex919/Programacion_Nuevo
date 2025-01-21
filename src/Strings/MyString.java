package Strings;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MyString {
    //a) Una función que reciba una cadena y devuelva esta cadena
    //invertida y en mayúsculas.
    public static String regresa(String palabra) {
        String invierte = " ";//cadena vacia
        for (int i = palabra.length() - 1; i >= 0; i--) {//va a recorrer hasta el ultimo caracter hasta el primer
            invierte += palabra.charAt(i);
        }
        return invierte.toUpperCase();
 /*
 StringBuilder invertida= new StringBuilder( palabra);
 return invertida.reverse().toString().toUpperCase();
 */
    }

    //b) Una función que reciba una cadena y devuelva el número de
    //vocales.
    public static int palabras(String palabras) {
        String vocales = "aeiouAEIOU";
        int cont = 0;
        for (int i = 0; i < palabras.length(); i++) {
            char caracter = palabras.charAt(i);//busca donde esta la vocales
            if (vocales.indexOf(caracter) != -1) {//// Verificamos si es una vocal y la cuenta
                cont++;
            }
        }
        return cont;
    }

    //Una función que reciba una cadena y devuelva la palabra de
    //mayor longitud
    public static String masGrande(String palabra) {
        String[] palabraBusqueda = palabra.split("\\s+");//nos divide por espacios en blanco
        String palabraLarga = ""; //busca la palabra larga ;

        //(palabraBusquedad)usas la palabra donde guardas el array la palabra mas grande
        for (int i = 0; i < palabraBusqueda.length; i++) {

            if (palabraBusqueda[i].length() > palabraLarga.length()) {
                palabraLarga = palabraBusqueda[i];
            }
        }
        return palabraLarga;
    }

    //Una función que reciba dos cadenas y devuelva el número de
    //veces que la segunda cadena está incluida en la primera.
    public static int cadena(String palabra, String palabra2) {
        int cont = 0;
        //nos sirve como un indice para buscar la palabra
        // que se repite dentro de palabra
        int repite = 0;
        //haces un bucle con el while para que vaya cont las palabras
        while ((repite = palabra.indexOf(palabra2, repite)) != -1) {
            cont++; // Incrementar el contador por cada coincidencia encontrada
            repite += palabra2.length(); // Mover el índice más allá de la coincidencia encontrada
        }
        return cont; // Retornar el total de coincidencias
    }

    //Una función que reciba un número de teléfono, por ejemplo
    //“34555332211” y lo convierta al formato (+34)-555-332211.
    public static String numeroTelefono(String numerocelular) {

        //matchesse utiliza para verificar si cumple con elpatron definido
        if (numerocelular == null || numerocelular.length() != 12 || !numerocelular.matches("\\d+")) {
            System.out.println("error ingrese un numero valido");
        } else {
            System.out.println("Numero valido");
        }

        //creas el codigo del telf y le añades un String con el "+" y los juntas con
        // el requiso y haces un substring
        String codigoPais = "+" + numerocelular.substring(0, 3);//este no va ayudar a extrae el codigo del pais

        String prefijo = numerocelular.substring(3, 5);//nos añade los numeros del prefijo

        String numero = numerocelular.substring(5);//nos va a traer el resto del codigo

        //concatenas con comas
        String numeroCompleto = String.format("(%s)-%s-%s", codigoPais, prefijo, numero);

        return numeroCompleto;
    }

    // Un procedimiento que reciba una cadena y muestre por pantalla
    //el histograma de frecuencias de las vocales (las veces que se
    //repiten).
    public static void histograma(String vocales) {
        vocales = vocales.toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;//inicias a cero por que se van almacenar
        for (int j = 0; j < vocales.length(); j++) {
            char caracter = vocales.charAt(j);//Obtiene el carácter en la posición y abre un switch
            switch (caracter) {
                case 'a' -> {
                    a++;
                }
                case 'e' -> {
                    e++;
                }
                case 'i' -> {
                    i++;
                }
                case 'o' -> {
                    o++;
                }
                case 'u' -> {
                u++;
                }

            }
        }
        //%d numero entero %s STRING %n Salto de linea
        System.out.printf("a %d %s%n", a, "*".repeat(a));
        System.out.printf("e %d %s%n", e, "*".repeat(e));
        System.out.printf("i %d %s%n", i, "*".repeat(i));
        System.out.printf("o %d %s%n", o, "*".repeat(o));
        System.out.printf("u %d %s%n", u, "*".repeat(u));

    }

    public static void main(String[] args) {
        String palabra = "la vaca hace mu";
      histograma(palabra);
    }
}

