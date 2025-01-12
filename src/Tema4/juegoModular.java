package Tema4;

import Tema4.personajes;

import java.util.Random;
import java.util.Scanner;

public class juegoModular {

    public static void showmenu() {
        System.out.println("----- MENÚ DE PERSONAJES -----");
        System.out.println("Escriba el nombre de tu personaje");
        System.out.println("1. Destructor");
        personajes.destuctor();
        System.out.println("2. El Mamado");
        personajes.mamado();
        System.out.println("3. Kong's");
        personajes.Kongs();
        System.out.println("4. El Capo");
        personajes.capo();
        System.out.println("5. Salir del juego");

        System.out.println("Escriba aqui su personaje");
    }

    public static void showmenu2() {
        System.out.println("----- DIFICULTAD DEL CPU -----");
        System.out.println("1. Fácil");
        System.out.println("2. Medio");
        System.out.println("3. Difícil");
        System.out.println("4. Extrema");
        System.out.print("Seleccione la dificultad: ");
    }

    public static void muestraVida(String jugador, int vida, int vidaMaxima) {
        int numCorazones = Math.max(1, (vida * 20) / vidaMaxima);
        String barraVida = "❤️".repeat(numCorazones);
        System.out.println("Vida de " + jugador + ": [" + barraVida + "] " + vida);
    }

    public static int validarAtributo(String atributo) {
        Scanner in=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese " + atributo + " (1-200): ");
            valor = in.nextInt();
            if (valor < 1 || valor > 200) {
                System.out.println(atributo + " debe estar entre 1 y 200. Intente nuevamente.");
            }
        } while (valor < 1 || valor > 200);
        return valor;
    }

    public static boolean validarTotalPuntos(int velocidad, int ataque, int defensa, int vida) {
        int total = velocidad + ataque + defensa + vida;
        System.out.println("El total de su personaje es:"+total);
        if (total > 500) {
            System.out.println("El total de puntos no puede exceder 500. Intente nuevamente.");
            return false;
        }
        return true;
    }

    public static boolean empieza(int velocidadPlayer, int velocidadCpu) {
        if (velocidadPlayer > velocidadCpu) {
            System.out.println("El jugador 1 comienza el juego.");
            return true;
        } else if (velocidadCpu > velocidadPlayer) {
            System.out.println("El CPU comienza el juego.");
            return false;
        } else {
            Random random = new Random();
            boolean turnoJugador = random.nextBoolean();
            System.out.println(turnoJugador ? "El jugador 1 comienza el juego." : "El CPU comienza el juego.");
            return turnoJugador;
        }
    }

    public static void playerPela(int velocidadPlayer, int ataquePlayer, int defensaPlayer, int vidaPlayer, int velocidadCpu, int ataqueCpu, int defensaCpu, int vidaCpu) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean turnoJugador = empieza(velocidadPlayer, velocidadCpu);

        while (vidaPlayer > 0 && vidaCpu > 0) {
            if (turnoJugador) {
                System.out.println("Escoje una acción: (1) Atacar, (2) Defender, (3) Curar, (4) Habilidad Final, (5) Salir");
                int opcion = in.nextInt();

                switch (opcion) {
                    case 1 -> {
                        int danio = Math.max(10, ataquePlayer - defensaCpu / 2);
                        vidaCpu = Math.max(0, vidaCpu - danio);
                        System.out.println("Has atacado al CPU causando " + danio + " de daño.");
                    }
                    case 2 -> {
                        defensaPlayer += 10;
                        System.out.println("Has aumentado tu defensa en 10 puntos.");
                    }
                    case 3 -> {
                        vidaPlayer = Math.min(200, vidaPlayer + 40);
                        System.out.println("Te has curado 40 puntos de vida.");
                    }
                    case 4 -> {
                        int danio = 50 + random.nextInt(11);
                        vidaCpu = Math.max(0, vidaCpu - danio);
                        System.out.println("Usaste tu habilidad final causando " + danio + " de daño.");
                    }
                    case 5 -> {
                        System.out.println("Has decidido salir del juego. Hasta la próxima.");
                        return;
                    }
                    default -> System.out.println("Opción no válida.");
                }

            } else {
                int accionCpu = random.nextInt(4) + 1;
                switch (accionCpu) {
                    case 1 -> {
                        int danio = Math.max(15, ataqueCpu - defensaPlayer / 2);
                        vidaPlayer = Math.max(0, vidaPlayer - danio);
                        System.out.println("El CPU te ha atacado causando " + danio + " de daño.");
                    }
                    case 2 -> {
                        defensaCpu += 10;
                        System.out.println("El CPU ha aumentado su defensa en 10 puntos.");
                    }
                    case 3 -> {
                        vidaCpu = Math.min(200, vidaCpu + 35);
                        System.out.println("El CPU se ha curado 35 puntos de vida.");
                    }
                    case 4 -> {
                        int danio = 50 + random.nextInt(11);
                        vidaPlayer = Math.max(0, vidaPlayer - danio);
                        System.out.println("El CPU usó su habilidad final causando " + danio + " de daño.");
                    }
                }
            }

            muestraVida("Jugador", vidaPlayer, 200);
            muestraVida("CPU", vidaCpu, 200);

            if (vidaCpu == 0) {
                personajes.fin();
                return;
            }

            if (vidaPlayer == 0) {
                personajes.finPierde();
                return;
            }
            turnoJugador = !turnoJugador;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        personajes.bienvenida();
        showmenu();
        String personaje=in.nextLine();
        System.out.println("Has escogido a: "+personaje);
        System.out.println("Selecciona las características de tu personaje (máximo 500 puntos en total):");

        int velocidadPlayer, ataquePlayer, defensaPlayer, vidaPlayer;

        do {
            velocidadPlayer = validarAtributo("Velocidad");
            ataquePlayer = validarAtributo("Ataque");
            defensaPlayer = validarAtributo("Defensa");
            vidaPlayer = validarAtributo("Vida");
        } while (!validarTotalPuntos(velocidadPlayer, ataquePlayer, defensaPlayer, vidaPlayer));

        showmenu2();
        int dificultad = in.nextInt();

        int velocidadCpu = 0, ataqueCpu = 0, defensaCpu = 0, vidaCpu = 0;

        switch (dificultad) {
            case 1 -> {
                velocidadCpu = 90;
                ataqueCpu = 80;
                defensaCpu = 100;
                vidaCpu = 120;
                System.out.println("Has seleccionado la dificultad Fácil.");
            }
            case 2 -> {
                velocidadCpu = 95;
                ataqueCpu = 110;
                defensaCpu = 90;
                vidaCpu = 130;
                System.out.println("Has seleccionado la dificultad Media.");
            }
            case 3 -> {
                velocidadCpu = 110;
                ataqueCpu = 120;
                defensaCpu = 110;
                vidaCpu = 160;
                System.out.println("Has seleccionado la dificultad Difícil.");
            }
            case 4 -> {
                velocidadCpu = 110;
                ataqueCpu = 145;
                defensaCpu = 95;
                vidaCpu = 150;
                System.out.println("Has seleccionado la dificultad Extrema.");
            }
            default -> {
                System.out.println("Dificultad no válida. Saliendo del juego.");
                return;
            }
        }

        muestraVida("Jugador", vidaPlayer, 200);
        muestraVida("CPU", vidaCpu, 200);

        playerPela(velocidadPlayer, ataquePlayer, defensaPlayer, vidaPlayer, velocidadCpu, ataqueCpu, defensaCpu, vidaCpu);
    }
}
