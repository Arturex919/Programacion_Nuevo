package Arrays;

import java.util.Random;
import java.util.Scanner;

public class busca_Parejas {
    //
    public static void animales(String[] tabla) {
        String[] animal = {"León", "Mandril", "Suricata", "Facóquero",
                "Elefante", "Tigre", "Cebra", "Hipopótamo", "Rinoceronte", "Jirafa"};
        //System.out.println("hola " + Arrays.toString(tabla));//
        for (int i = 0; i < animal.length; i++) {
            tabla[2*i] = animal[i];//duplica el valor del array
            tabla[2 * i + 1] = animal[i];//rellena las columnas vacias
        }

        Random random = new Random();
        for (int i = 0; i < tabla.length; i++) {
            int mezclaTabla = random.nextInt(tabla.length);
            String mezclado = tabla[mezclaTabla];//en esta variable guardas la posicion de la tabla
            tabla[mezclaTabla] = tabla[i];//creas esto para que se mueva las tablas
            tabla[i] = mezclado;
        }
        for (String animales : tabla) {
            System.out.print(animales + " ");
        }
        System.out.println();
    }

    public static boolean comprueba(int primeraPosicion, int segundaPosicion, String[] tabla) {
        if (tabla[primeraPosicion].equals(tabla[segundaPosicion])) {
            System.out.println("La posicion es igual " +tabla[primeraPosicion]);
            return true;
        } else {
            System.out.println("La posicion "+primeraPosicion+" es un : "+tabla[primeraPosicion]+" y  La posicion: "+segundaPosicion+ " es un "+tabla[segundaPosicion]);
            return false;
        }
    }

    public static void mostraTab(String[] tabla, boolean[] valida) {
        System.out.println("Tablero actual:");

        for (int i = 0; i < tabla.length; i++) {
            if (valida[i]) {
                System.out.print(tabla[i] + " ");  // Mostrar el animal si está visible
            } else {
                System.out.print("? ");  // Mostrar "?" si está oculto
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] tabla = new String[20];
        boolean[] visibles = new boolean[20];
        boolean jugar = true;

        int parejas = 0;
        System.out.println("Bienvenido a la seleccion de parejas");
        System.out.println("Busque la pareja de estos animales");
        System.out.println("ama " + tabla);

        animales(tabla);//iniciamos tabla

        do {

            mostraTab(tabla, visibles);
            int primeraPosicion, segundaPosicion;
            System.out.print("Selecciona la primera posición (0-19): ");
            primeraPosicion = in.nextInt();
            in.nextLine(); // Limpia el buffer
            while (primeraPosicion < 0 || primeraPosicion >= tabla.length || visibles[primeraPosicion]) {
                System.out.print("Posición inválida o ya descubierta. Intenta otra posición: ");
                primeraPosicion = in.nextInt();
                in.nextLine(); // Limpia el buffer
            }
            // Seleccionar la segunda posición
            System.out.print("Selecciona la segunda posición (0-19): ");
            segundaPosicion = in.nextInt();

            // Validar que la posición esté dentro del rango y no sea igual a la primera
            while (segundaPosicion < 0 || segundaPosicion >= tabla.length || segundaPosicion == primeraPosicion || visibles[segundaPosicion]) {
                if (segundaPosicion == primeraPosicion) {
                    System.out.print("No puedes seleccionar la misma posición dos veces. Intenta otra posición: ");
                } else {
                    System.out.print("Posición inválida o ya descubierta. Intenta otra posición: ");
                }
                segundaPosicion = in.nextInt();
                in.nextLine();
            }
            System.out.println("Si desea acabar, escriba 'salir' o presione Enter para continuar");

            String salir = in.nextLine();
            if (salir.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta la próxima!");
                for (int i = 0; i < visibles.length; i++) {
                    visibles[i] = true;
                }
                mostraTab(tabla, visibles);
                jugar = false; // Termina el juego
            }

            if (primeraPosicion == segundaPosicion) {
                System.out.println("No puedes seleccionar el mismo numero dos veces");
                System.out.println("Intenta de nuevo");
            } else if (visibles[primeraPosicion] || visibles[segundaPosicion]) {
                System.out.println("¡Una de las posiciones ya está visible! Intenta con otras posiciones.");
            }

            System.out.println("Has seleccionado las posiciones " + primeraPosicion + " y " + segundaPosicion);
            if (comprueba(primeraPosicion, segundaPosicion, tabla)) {
                // Si son iguales, las posiciones se quedan visibles
                visibles[primeraPosicion] = true;
                visibles[segundaPosicion] = true;
                parejas++;
            } else {
                // en caso de que no encuentre aparece
                System.out.println("Intenta de nuevo");
                for (int i = 0; i < 1; i++) {
                    System.out.println();
                }
            }
            if (parejas == 10) {
                System.out.println("Haz ganado");
            }
        } while (parejas < 10 && jugar);

        in.close();
    }

}

