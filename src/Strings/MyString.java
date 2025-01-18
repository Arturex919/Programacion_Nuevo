package Strings;

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
    public static  int mayorPalabra (String palabras){

        String

for (String mayorPal: palabras) {
}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra;
        System.out.print(" ingresa una palabra: ");
        palabra = in.next(); //
        int numeroP = palabras(palabra);
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + numeroP);
    }
}
