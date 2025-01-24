package Strings;

import java.util.Locale;
import java.util.Scanner;

public class Lingo {


    /* Realiza el juego del Lingo en una clase llamada Lingo. El jugador tiene que
        adivinar una palabra de 5 letras con un máximo de 5 intentos. En cada intento
        el jugador indica una palabra de 5 letras y el ordenador le indica que letras
        están en la posición correcta y qué letras están contenidas en la palabra pero
        no en la posición correcta. Con un ejemplo se entiende mejor (Hint lo escribe
                el programa y try el usuario):
        Hidden word: hueso
        Hint: -----
        Try : cosas
        Hint: -**-*
        Try : terco
        Hint: -*--o
        Try : ruede
        Hint: -ue-*
        Try : suelo
        Hint: *ue-o
        Try : hueso
    ¡Congratulations!
     */
    public static String palabraUser(String palabra, String intento) {
            char[] juego = new char[5];
            boolean[] marcas = new boolean[5];

            // Inicializar pista con '-'
            for (int i = 0; i < juego.length; i++) {
                juego[i] = '_';
            }

            // Identificar letras correctas en la posición correcta
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == intento.charAt(i)) {
                    juego[i] = '*';
                    marcas[i] = true;
                }
            }

            // Identificar letras contenidas pero en posición incorrecta
            for (int i = 0; i < palabra.length(); i++) {
                if (juego[i] != '*' && palabra.indexOf(intento.charAt(i)) != -1) {
                    // Solo marcar la letra si aún no está marcada
                    boolean marcado = false;
                    for (int j = 0; j < palabra.length(); j++) {
                        if (intento.charAt(i) == palabra.charAt(j) && !marcas[j] && !marcado) {
                            juego[i] = 'o';
                            marcado = true;
                        }
                    }
                }
            }

            String marcadas = new String(juego);
            return marcadas;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra = "";  // Aquí puedes poner cualquier palabra de 5 letras para adivinar
        boolean continua = false;
        boolean palabraValida=false;
        int intentos = 5;

        System.out.println("BIENVENIDO AL JUEGO DEL LINGO");
        System.out.println("Debes adivinar una palabra de 5 letras.");

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

        // Bucle principal del juego
        while (intentos > 0) {
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una palabra de 5 letras: ");
            String intento = in.next().toLowerCase();

            // Validar que la palabra tenga 5 letras
            if (intento.length() != 5) {
                System.out.println("La palabra debe tener 5 letras.");
                continue;
            }

            // Verificar si adivinó la palabra
            if (intento.equals(palabra)) {
                System.out.println("¡Felicidades! Adivinaste la palabra: " + palabra);
                continua = true;
                break;
            }

            // Mostrar la pista
            String pista = palabraUser(palabra, intento);
            System.out.println("Pista: " + pista);

            intentos--;
        }

        // Si no adivinó la palabra
        if (!continua) {
            System.out.println("Lo siento, se te acabaron los intentos. La palabra era: " + palabra);
        }

    }
}

