package POO_INTRODUCCION;

import java.util.Scanner;

public class Combate_Hero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hero heroe = new Hero();
        String name;
        int ataque, defensa, salud;
        System.out.println("Ingresa tu nombre");
        name = in.next();
        heroe.setName(name);

        System.out.println("Ingresa un valor de tu ataque");
        ataque = in.nextInt();
        heroe.setAttack(ataque);

        System.out.println("Ingresa un valor de tu defensa");
        defensa = in.nextInt();
        heroe.setDefense(defensa);

        System.out.println("Ingresa un valor para tu salud ");
        salud = in.nextInt();
        heroe.setHealth(salud);

        System.out.println(heroe.toString());

        Hero bandido = new Hero("Bandido", 1, 200, 200, 10, 100, 100);

        boolean finDelJuego = false;
        int rondas = 1;
        int curacionJuego;
        int potionTomada = 0;
        int curacionesRealizadas = 0;
        boolean megapocionUsada = false;

        System.out.println("Un enemigo ha aparecido: ¡El bandido!");



        while (!finDelJuego) {

            System.out.println("INICIA EL COMBATE");
            System.out.println("");
            System.out.println("RONDA: " + rondas);
            System.out.println("");
            System.out.println(bandido.toString());
            System.out.println("");
            System.out.println(heroe.toString());

            // Turno del héroe
            heroe.attack(bandido);

            // Verificar si el bandido ha muerto
            if (bandido.getHealth() <= 0) {
                System.out.println("¡Has derrotado al bandido!");
                break; // Salir del juego si el bandido ha muerto
            }


            System.out.println("Te quieres curar");
            System.out.println("1.SI 2.NO");
            int curacion = in.nextInt();
            if (curacion == 1) {
                System.out.println("1. Pocion 2. Megapocion");
                int options = in.nextInt();
                switch (options) {

                    case 1 -> {
                        System.out.println("POCION");
                        System.out.println("Solo te puedes curar 3 veces");
                        System.out.println("1. SI 2. NO");
                        System.out.println("");
                        curacionJuego = in.nextInt();

                        if (curacionJuego == 1) {
                            if (curacionesRealizadas >= 3) {
                                System.out.println("Ya no puedes recuperarte, excediste el limite");
                            } else {
                                heroe.drinkPotion();
                                curacionesRealizadas++;
                                System.out.println("Te has curado. Curaciones usadas: " + curacionesRealizadas);
                            }
                        } else if (curacionJuego == 2) {
                            System.out.println("No te has curado");
                        } else {
                            System.out.println("Opción no válida");
                        }

                    }
                    case 2 -> {
                        System.out.println("MEGAPOCION");
                        System.out.println("Solo te puedes tomar una megapocion");
                        System.out.println("1. SI 2. NO");
                        int mega = in.nextInt();

                        if (mega == 1) {
                            if (potionTomada < 1) {
                                heroe.rest();
                                potionTomada++;
                                System.out.println("Has usado la Megapoción.");
                            } else {
                                System.out.println("Ya usaste tu Megapoción, no puedes usar otra.");
                            }

                        } else if (mega == 2) {
                            System.out.println("No te has curado");

                        } else {
                            System.out.println("Opción no válida");
                        }
                    }
                    default -> {
                        System.out.println("Opción no válida");
                    }
                }

            } else if (curacion == 2) {
                System.out.println("No te has curado");

            } else {
                System.out.println("Opción no válida");
            }

            // Turno del bandido
            if (bandido.getHealth() > 0) {
                bandido.attack(heroe);
            }

            // Verificar si el héroe ha muerto
            if (heroe.getHealth() <= 0) {
                System.out.println("Te han matado");
                finDelJuego = true;
            }

            rondas++; // Incrementar ronda

        }
    }


}

