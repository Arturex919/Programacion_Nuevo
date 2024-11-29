package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Juego {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int opciones;
    int opcions = 0;
    int jugador_1, velocidad = 0, ataque = 0, defensa = 0, lifepoint = 0, sal = 0;
    boolean salir = false;
    System.out.println("El maximo de poder de su personaje no debe de pasar de 500P");
    System.out.println("Las caracteristicas del jugador debe rondar entre 1P - 200P");
    System.out.print("¿Deseas continuar? (Y/N): ");
    opciones = in.next().toUpperCase().charAt(0);
    //colocamos un if para que el usuario si desea entre o no al juego
    // dentor del if colocamos un booleano para que no digas cuales son nuestros valores reales o falso
    //  y creamos un do while para que no sobrepase el valor maximo
    // y que lo pueda corregir en caso de que falle//
    if (opciones == 'Y') {
        //cree un booleano con caracteristicas correcta para saber si lo datos
        //que introducidos son correcto o no en caso de que no vuelve hasta que
        //sean correcto,lo colocamos arriba del do y lo volvemos añadir en el do, despues añadimos un do-while para que en el do contenga lo que es
        // la caracteristicas=true y añadimos el if para que este se pueda utilizar
        // para salir en cualquier momento y finalizar el juego//
        boolean caracteristica_correctas;
        do {
            caracteristica_correctas = true;
            if (!salir) {//sustituir a char
                System.out.println("Toque 0 para salir o 1 para continuar");
                sal = in.nextInt();

                    System.out.println("ingrese la velocidad del Jugador 1");
                    velocidad = in.nextInt();
                    while (velocidad > 200 || velocidad < 1) {
                        System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese la velocidad del jugador 1: ");
                        velocidad = in.nextInt();
                    }

                    System.out.println("Ingrese la ataque del jugador 1");
                    ataque = in.nextInt();
                    while (ataque > 200 || ataque < 1) {
                        System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese el ataque del jugador 1: ");
                        ataque = in.nextInt();
                    }



                    System.out.println("ingrese la defensa del jugador 1");
                    defensa = in.nextInt();
                    while (defensa > 200 || defensa < 1) {
                        System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese la defensa del jugador 1: ");
                        defensa = in.nextInt();
                    }



                    System.out.println("ingrese la vida del jugador 1");
                    lifepoint = in.nextInt();
                    while (lifepoint > 200 || lifepoint < 1) {
                        System.out.println("la vida no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.println("ingrese la vida del jugador 1");
                        lifepoint = in.nextInt();
                    }
                }

            jugador_1 = velocidad + ataque + defensa + lifepoint;
            if (jugador_1 > 500) {
                System.out.println("ERROR");
                System.out.println("ingrese correctamente los datos...");
                caracteristica_correctas = false;
            }
            //creo un do while porque hasta que el booleano me diga que es falso este se va a repetir hasta
            //que se complete o me valide los datos ya qu eme verifica los datos hasta que sea correcto//
        } while (!caracteristica_correctas);

        System.out.println("FELICIDADES");
        System.out.println("Su personaje tiene un total de: " + jugador_1 + "P");
        System.out.println("Listo Empecemos el juego");
        System.out.println();
        //En este caso, !salir indica que el ciclo continua ejecutándose mientras salir sea
        // false. Este while es principal  ya que con este podemos hacer el menú en el que el jugador puede
        // hacer varias acciones como:
        while (!salir) {
            System.out.println("¿Qué deseas hacer ahora?");
            System.out.println("1. Ver atributos del personaje");
            System.out.println("2. Corregir los atributos del personaje");
            System.out.println("3. Continuar al siguiente personaje");
            System.out.println("4. Salir del juego");
            opcions = in.nextInt();
            switch (opcions) {
                case 1 -> {
                    System.out.println("Atributos del Jugador 1:");
                    System.out.println("=====================================================");
                    System.out.println("Velocidad: " + velocidad + "P");
                    System.out.println("Ataque: " + ataque + "P");
                    System.out.println("Defensa: " + defensa + "P");
                    System.out.println("Vida: " + lifepoint + "P");
                    System.out.println("El total de puntos del Jugador 2 es : " + jugador_1);
                }
                case 2 -> {
                    System.out.println("¿Qué atributo deseas corregir?");
                    System.out.println("1. Velocidad");
                    System.out.println("2. Ataque");
                    System.out.println("3. Defensa");
                    System.out.println("4. Vida");
                    System.out.println("5. Salir ");
                    int Corregir = in.nextInt();

                    switch (Corregir) {
                        case 1 -> {
                            System.out.println("Ingrese la nueva velocidad (debe estar entre 1 y 200)");
                            velocidad = in.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Ingrese el nuevo ataque (entre 1 y 200): ");
                            ataque = in.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Ingrese la nueva defensa (entre 1 y 200): ");
                            defensa = in.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Ingrese la nueva vida (entre 1 y 200): ");
                            lifepoint = in.nextInt();
                        }
                        case 5 -> {
                            System.out.println("no se ha cambiando ningun atributo");
                        }

                        default -> System.out.println("opcion no valida");
                    }
                }
                case 3 -> {
                    System.out.println("Turno del Jugador 2");
                    System.out.println("añada los atributos del Jugador 2 ");
                    int jugador_2, velocidad_2 = 0, ataque_2 = 0, defensa_2 = 0, lifepoint_2 = 0;
                    boolean caracteristica_correctas2;
                    do {
                        caracteristica_correctas2 = true;

                                System.out.println("ingrese la velocidad del Jugador 2");
                                velocidad_2 = in.nextInt();
                                while (velocidad_2 > 200 || velocidad_2 < 1) {
                                    System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.print("Ingrese la velocidad del jugador 2: ");
                                    velocidad_2 = in.nextInt();
                                }

                                System.out.println("Ingrese la ataque del jugador 2");
                                ataque_2 = in.nextInt();
                                while (ataque_2 > 200 || ataque_2 < 1) {
                                    System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.print("Ingrese el ataque del jugador 2: ");
                                    ataque_2 = in.nextInt();
                                }

                                System.out.println("ingrese la defensa del jugador 2");
                                defensa_2 = in.nextInt();
                                while (defensa_2 > 200 || defensa_2 < 1) {
                                    System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.print("Ingrese la defensa del jugador 2: ");
                                    defensa_2 = in.nextInt();
                                }

                                System.out.println("");
                                System.out.println("ingrese la vida del jugador 2");
                                lifepoint_2 = in.nextInt();
                                while (lifepoint_2 > 200 || lifepoint_2 < 1) {
                                    System.out.println("la vida no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.println("ingrese la vida del jugador 2");
                                    lifepoint_2 = in.nextInt();
                                }


                        jugador_2 = velocidad_2 + ataque_2 + defensa_2 + lifepoint_2;
                        if (jugador_2 > 500) {
                            System.out.println("ERROR");
                            System.out.println("ingrese correctamente los datos...");
                            caracteristica_correctas2 = false;
                        }

                    } while (!caracteristica_correctas2);
                    System.out.println("FELICIDADES");
                    System.out.println("Su personaje tiene un total de: " + jugador_2 + "P");
                    System.out.println("Listo Empecemos el juego");
                    System.out.println();

                    while (!salir) {
                        System.out.println("¿Qué deseas hacer ahora?");
                        System.out.println("1. Ver atributos del personaje");
                        System.out.println("2. Corregir los atributos del personaje");
                        System.out.println("3. Empezar el juego");
                        System.out.println("4. Salir del juego");
                        opcions = in.nextInt();
                        switch (opcions) {
                            case 1 -> {
                                System.out.println("Atributos del Jugador 2:");
                                System.out.println("=====================================================");
                                System.out.println("Velocidad: " + velocidad_2 + "P");
                                System.out.println("Ataque: " + ataque_2 + "P");
                                System.out.println("Defensa: " + defensa_2 + "P");
                                System.out.println("Vida: " + lifepoint_2 + "P");
                                System.out.println("El total de puntos del Jugador 2 es : " + jugador_2);
                            }
                            case 2 -> {
                                System.out.println("¿Qué atributo deseas corregir?");
                                System.out.println("1. Velocidad");
                                System.out.println("2. Ataque");
                                System.out.println("3. Defensa");
                                System.out.println("4. Vida");
                                int Corregir_2 = in.nextInt();

                                switch (Corregir_2) {
                                    case 1 -> {
                                        System.out.println("Ingrese la nueva velocidad (debe estar entre 1 y 200)");
                                        velocidad_2 = in.nextInt();
                                    }
                                    case 2 -> {
                                        System.out.println("Ingrese el nuevo ataque (entre 1 y 200): ");
                                        ataque_2 = in.nextInt();
                                    }
                                    case 3 -> {
                                        System.out.println("Ingrese la nueva defensa (entre 1 y 200): ");
                                        defensa_2 = in.nextInt();
                                    }
                                    case 4 -> {
                                        System.out.println("Ingrese la nueva vida (entre 1 y 200): ");
                                        lifepoint_2 = in.nextInt();
                                    }
                                    case 5 -> {
                                        System.out.println("no se ha cambiando ningun atributo");
                                    }
                                    default -> System.out.println("opcion no valida");
                                }
                            }
                            case 3 -> {
                                System.out.println("##############################################################################\n" +
                                        "#░█▀▄░▀█▀░█▀▀░█▀█░█░█░█▀▀░█▀█░▀█▀░█▀▄░█▀█░█▀▀░░░█▀█░█░░░░░▀▀█░█░█░█▀▀░█▀▀░█▀█#\n" +
                                        "#░█▀▄░░█░░█▀▀░█░█░▀▄▀░█▀▀░█░█░░█░░█░█░█░█░▀▀█░░░█▀█░█░░░░░░░█░█░█░█▀▀░█░█░█░█#\n" +
                                        "#░▀▀░░▀▀▀░▀▀▀░▀░▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀▀░░▀▀▀░▀▀▀░░░▀░▀░▀▀▀░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀▀#\n" +
                                        "##############################################################################");
                                System.out.println("CARACTERISTICA DE CADA JUGADOR");
                                System.out.println("=====================================================");
                                System.out.println("JUGADOR 1");
                                System.out.println("Velocidad:" + velocidad + "P");
                                System.out.println("Ataque:" + ataque + "P");
                                System.out.println("Defensa:" + defensa + "P");
                                System.out.println("Puntos de vida:" + lifepoint + "P");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("=====================================================");
                                System.out.println("JUGADOR 2");
                                System.out.println("Velocidad:" + velocidad_2 + "P");
                                System.out.println("Ataque:" + ataque_2 + "P");
                                System.out.println("Defensa:" + defensa_2 + "P");
                                System.out.println("Puntos de vida:" + lifepoint_2 + "P");
                                System.out.println("habilidades:Golpe Cañon,Lanzallamas");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                //creamos una ronda para que esta se vaya cambiando a medida de que se vaya avanzando el
                                //juego para que cambien su valores en si//

                                int ronda = 1;
                                Random random = new Random();
                                System.out.println("empieza la pelea");
                                while (lifepoint > 0 && lifepoint_2 > 0) {
                                    int danio, danio2, total, total2;
                                    System.out.println("=====================================================");
                                    System.out.println("-------------- RONDA " + ronda + " ------------------");
                                    danio = ataque_2 - defensa;
                                    if (velocidad >= velocidad_2) {
                                        danio = ataque - defensa / 2;
                                        total = danio - random.nextInt(3);
                                        System.out.println("el daño que recibe el player 1 es: " + total);
                                    } else {
                                        danio2 = ataque_2 - defensa;
                                        total2 = danio - random.nextInt(3);
                                        System.out.println("el daño que recibe el player 1 es: " + total2);

                                    }
                                    ronda++;

                                }
                            }
                        }
                    }
                }
            }
        }
    }
/*
-

            System.out.println("##############################################################################\n" +
                    "#░█▀▄░▀█▀░█▀▀░█▀█░█░█░█▀▀░█▀█░▀█▀░█▀▄░█▀█░█▀▀░░░█▀█░█░░░░░▀▀█░█░█░█▀▀░█▀▀░█▀█#\n" +
                    "#░█▀▄░░█░░█▀▀░█░█░▀▄▀░█▀▀░█░█░░█░░█░█░█░█░▀▀█░░░█▀█░█░░░░░░░█░█░█░█▀▀░█░█░█░█#\n" +
                    "#░▀▀░░▀▀▀░▀▀▀░▀░▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀▀░░▀▀▀░▀▀▀░░░▀░▀░▀▀▀░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀▀#\n" +
                    "##############################################################################");

        }
        case 'N' -> {
            System.out.println("+============================================================================+\n" +
                    "|░█░█░█▀█░█▀▀░▀█▀░█▀█░░░█░░░█▀█░░░█▀█░█▀▄░█▀█░█░█░▀█▀░█▄█░█▀█░█▀█░█▀█░█▀█░█▀█|\n" +
                    "|░█▀█░█▀█░▀▀█░░█░░█▀█░░░█░░░█▀█░░░█▀▀░█▀▄░█░█░▄▀▄░░█░░█░█░█▀█░█▀█░█▀█░█▀█░█▀█|\n" +
                    "|░▀░▀░▀░▀░▀▀▀░░▀░░▀░▀░░░▀▀▀░▀░▀░░░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀|\n" +
                    "+============================================================================+");
        }
        default -> {
            System.out.println("opcion no valida");
        }
    }*/
        }
    }
