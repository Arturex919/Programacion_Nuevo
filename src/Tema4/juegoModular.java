package Tema4;
import java.util.Scanner;
public class juegoModular {


        public static void showmenu() {
            System.out.println("----- MENÚ DE PERSONAJES -----");
            System.out.println("1. Destructor (Velocidad: 50, Ataque: 60, Defensa: 150, Vida: 180)");
            System.out.println("2. El Mamado (Velocidad: 120, Ataque: 130, Defensa: 150, Vida: 180)");
            System.out.println("3. Kong's (Velocidad: 150, Ataque: 150, Defensa: 70, Vida: 100)");
            System.out.println("4. Capo (Velocidad: 100, Ataque: 120, Defensa: 100, Vida: 150)");
            System.out.println("5.Salir del juego");
            System.out.print("Seleccione su personaje: ");
        }

        public static int readPlayerStats(int jugador) {
            Scanner in = new Scanner(System.in);
            int personaje;
            do {
                personaje = in.nextInt();
                switch (personaje) {
                    case 1 -> {
                        System.out.println("Haz seleccionado a Destructor");
                        int Velocidad = 90;
                        int Ataque = 100;
                        int Defensa = 150;
                        int Vida = 160;
                    }
                    case 2 -> {
                        System.out.println("Has seleccionado: El Mamado");
                        int Velocidad = 90;
                        int Ataque = 120;
                        int Defensa = 145;
                        int Vida = 145;
                    }
                    case 3 -> {
                        System.out.println("Has seleccionado: KONG´S");
                        int Velocidad = 90;
                        int Ataque = 130;
                        int Defensa = 120;
                        int Vida = 160;
                    }
                    case 4 -> {
                        System.out.println("Has seleccionado: El Capo");
                        int Velocidad = 120;
                        int Ataque = 160;
                        int Defensa = 110;
                        int Vida = 110;
                    }
                    case 5 -> {
                        System.out.println("Hasta la proximaaaaa");
                    }
                    default -> {
                        System.out.println("opcion no valida, intenta de nuevo ");
                    }
                }
            } while (personaje != 5);

            return jugador;
        }

        public static int readCpuStats(int pc) {
            Scanner in = new Scanner(System.in);
            int computadora;
            do {
                computadora = in.nextInt();
                switch (computadora) {
                    case 1 -> {
                        System.out.println("Haz seleccionado a Destructor");
                        int Velocidad = 90;
                        int Ataque = 100;
                        int Defensa = 164;
                        int Vida = 120;
                    }
                    case 2 -> {
                        System.out.println("Has seleccionado: El Mamado");
                        int Velocidad = 90;
                        int Ataque = 120;
                        int Defensa = 145;
                        int Vida = 145;
                    }
                    case 3 -> {
                        System.out.println("Has seleccionado: KONG´S");
                        int Velocidad = 90;
                        int Ataque = 110;
                        int Defensa = 105;
                        int Vida = 160;
                    }
                    case 4 -> {
                        System.out.println("Has seleccionado: El Capo");
                        int Velocidad = 100;
                        int Ataque = 145;
                        int Defensa = 155;
                        int Vida = 100;
                    }
                    case 5 -> {
                        System.out.println("Hasta la proximaaaaa");
                    }
                    default -> {
                        System.out.println("opcion no valida, intenta de nuevo ");
                    }
                }
            } while (computadora != 5);
            return pc;
        }
        public static boolean empieza(int velocidad, int velocidad2){

            if (velocidad>=velocidad2)

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int personaje;
            System.out.println("Escoje El modo de juego");
            System.out.println("1. Cpu");
            System.out.println("2. ");
            int modoJuego = in.nextInt();
            if (modoJuego == 1) {
                showmenu();
                System.out.println("Escoja un personaje del 1 al 4");
                personaje = in.nextInt();
                readPlayerStats(personaje);
                System.out.println("Escoje la dificulta del juego");
                int dificultad = in.nextInt();
                readCpuStats(dificultad);

                if (readPlayerStats(personaje) >= readCpuStats(dificultad)) ;
            }
        }
    }
        /*
    public static void stacks(int [] caracteristicaPersonaje){
        System.out.println("caracteristica de la PC");
        System.out.println("⚡ Velocidad: "+caracteristicaPersonaje[0]);
        System.out.println("⚔️ Ataque:"+ caracteristicaPersonaje[1]);
        System.out.println("🛡️ Defensa:"+caracteristicaPersonaje[2]);
        System.out.println("❤️Vida: "+caracteristicaPersonaje[3]);
    }
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            showmenu();
*/

