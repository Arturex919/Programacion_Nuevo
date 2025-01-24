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

    public static void blanco() {
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }

    public static char[] oculta(String palabraUser) {
        char[] ocultaPalabra = new char[palabraUser.length()];
        for (int i = 0; i < ocultaPalabra.length; i++) {
            ocultaPalabra[i] = '_';
        }
        return ocultaPalabra;

    }

    public static void muestra(String palabraUser, char[] ocultaPalabra, char letra) {
        for (int i = 0; i < palabraUser.length(); i++) {//ve el tamaño de l palabra
            if (palabraUser.charAt(i) == letra) {//la convierte en caracter y la comprueba si es igual a letra
                ocultaPalabra[i] = letra;//si es igual esta se va a actualiza
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra;
        char letra;
        boolean continua = false;
        boolean palabraValida = false;
        int intentos = 6;

        while (!palabraValida) {//creas el bucle para añada la palabra que es valida
            System.out.println("Ingresa una palabra para adivinar");
            palabra = in.next();
            palabraValida = true;//si la palabra es verdad

            for (int i = 0; i < palabra.length(); i++) {//leera el tamaño de la palabra
                if (!Character.isLetter(palabra.charAt(i))) {//si la palabra es distinto al caracter
                    palabraValida = false;
                }
            }
            if (!palabraValida) {//si no es una palabra sera false
                System.out.println("palabra no valida,añade una nueva");
            }
        }

            blanco();

            char[] palabraAdivinar = oculta(palabra);

            do {
                System.out.println(palabraAdivinar);
                System.out.println("inserta una letra");
                letra = in.next().charAt(0);

                if (palabraUser(palabra, letra)) {
                    System.out.println("haz adivina la letra: " + letra);
                    muestra(palabra, palabraAdivinar, letra);
                } else {
                    System.out.println("incorrecto sigue intentadolo");
                    intentos--;
                    System.out.println("Te quedan solo " + intentos + " intentos ");
                }
                if (String.valueOf(palabraValida).equals(palabra)) {
                    continua = true;
                    System.out.println("Haz ganado");
                }
            } while (intentos > 0 && !continua);

            if (!continua) {
                System.out.println("te has quedado sin intentos,la palabra era : " + palabra);
            }
        }



        }
    }



