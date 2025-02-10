package Tema_primera_evaluacion.Tema2;
import java.util.Random;
import java.util.Scanner;
public class JUEGO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opciones;
        int opcions = 0;
        boolean salir = false;
        int jugador_1, velocidad = 100, ataque = 30, defensa = 90, lifepoint = 120,daño;

        int jugador_2, velocidad_2 = 10, ataque_2 = 56, defensa_2 = 90, lifepoint_2 = 150,daño2;

        jugador_1=velocidad+ ataque+ defensa + lifepoint;
        jugador_2=velocidad_2+ ataque_2+ defensa_2 + lifepoint_2;
        daño=ataque_2-defensa;
        daño2=ataque-defensa_2;
        int ronda = 1;
        Random random = new Random();
        int inicia = random.nextInt(2);
        System.out.println("El JUGADOR CON MAYOR VELOCIDAD INICA LA PARTIDA");
        System.out.println("En caso de tener la misma velocidad  se realziara al azar");
        if (velocidad_2 > velocidad) {
            System.out.println("El player 2 inicia la partida");
        } else {
            System.out.println("El player 1 inicia la partida");
            if (inicia == 0) {
                System.out.println("Ambos Jugadores tienen la misma velocidad");
                System.out.println("Se realizará al azar para ver quién inicia");
                System.out.println("Presiona ENTER para continuar");
                in.nextLine();
                System.out.println("Player 1 comienza la partida");
            } else {
                System.out.println("Player 2 comienza la partida");
            }
                while (ronda==1 && lifepoint > 0 && lifepoint_2 > 0) {
                    System.out.println("=====================================================");
                    System.out.println("-----------------  RONDA " + ronda + " ----------------");
                    System.out.println("===========================================");
                    daño = ataque_2 - defensa;
                    daño2 = ataque - defensa_2;

                    System.out.println("Jugador 1 inflige daño a Jugador 2: " + daño2);
                    System.out.println("Jugador 2 inflige daño a Jugador 1: " + daño);
                    System.out.println("Vida restante del Jugador 1: " + lifepoint);
                    System.out.println("Vida restante del Jugador 2: " + lifepoint_2);

                }
                }
            }
    }


