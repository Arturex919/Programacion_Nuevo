package Strings;

import java.util.Scanner;

//Realiza el juego del ahorcado en una clase llamada HangmanGame. Pedirá
//una palabra a un primer usuario, se borrará de consola. Y al segundo usuario
//se le preguntan letras hasta que decida resolver. Tendrá 6 intentos que irán
//dibujando al “ahorcado

public class HangmanGame {
    public static boolean palabraUser(String palabra, char letra) {
        char[] juego = palabra.toCharArray();
        for (int i = 0; i < juego.length; i++) {//recorre la palabra separada por caracter
            char adivina = juego[i];
            if (adivina == letra) {
                return true;//si la letra que adivina es real devuelve
            }
        }
        return false;//si es falso no devuelve
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra;
        char letra;
        boolean continua = false;
        int intentos = 6;

            System.out.println("Ingresa una palabra para adivinar");
            palabra = in.next();

                do {
                    do {
                        System.out.println("Ingresa una letra");
                        letra = in.next().charAt(0);
                        if (letra >= 0 && letra <= 100) {
                            System.out.println("Añade una palabra valida");
                        }
                    } while (letra >= 0 && letra <= 100);
                    palabraUser(palabra, letra);
                    System.out.println(palabraUser(palabra, letra));
                } while (continua);

    }
}



