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

    public static void dibujo(int intentoFallido) {
        String[] ahorcado = new String[]{
                "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
                "  +---+\n  |   |\n      |\n      |\n      |\n      |\n========="
        };
        System.out.println(ahorcado[6 - intentoFallido]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra = "";
        char letra;
        boolean continua = false;
        boolean palabraValida = false;
        int intentos = 6;
        int opcion;
do {
    System.out.println("Desea jugar 1) Si  2)No");
    opcion = in.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO");

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
                        dibujo(intentos);
                        System.out.println("");
                        System.out.println(palabraAdivinar);
                        System.out.println("");// Muestra el progreso actual
                        System.out.println("Inserta una letra:");
                        letra = in.next().charAt(0);

                        if (palabraUser(palabra, letra)) {
                            System.out.println("haz adivinado la palabra");
                            muestra(palabra, palabraAdivinar, letra);
                        } else {
                            System.out.println("incorrecto sigue intentadolo");
                            intentos--;
                            System.out.println("Te quedan solo " + intentos + " intentos ");
                        }//transformas de char a string con  valueOf y lo compara con la plabra
                        if (String.valueOf(palabraAdivinar).equals(palabra)) {
                            continua = true;
                            System.out.println("Haz ganadoooo");
                        } else {
                            System.out.println("valor no válido. Solo puedes ingresar una letra.");
                        }
                    } while (intentos > 0 && !continua);

                    // Verificar si el jugador perdió
                    if (!continua) {
                        dibujo(0);
                        System.out.println("Te has quedado sin intentos. La palabra era: " + palabra);
                    }
                }
                case 2 -> {
                    System.out.println("Adiossss");
                }
                default -> {
                    System.out.println("opcion no valida");
                }
            }
        }while (opcion!=2);
    }
}



