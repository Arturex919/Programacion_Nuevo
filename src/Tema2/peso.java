package Tema2;

import java.util.Scanner;

public class peso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opciones;
        int opcions = 0;
        int jugador_1, velocidad = 0, ataque = 0, defensa = 0, lifepoint = 0, sal, Resul1;
        boolean salir = false;
        System.out.println("El maximo de poder de su personaje no debe de pasar de 500P");
        System.out.println("Las caracteristicas del jugador debe rondar entre 1P - 200P");
        System.out.print("¿Deseas continuar? (Y/N): ");
        opciones = in.next().charAt(0);
        if (opciones == 'Y' || opciones == 'y') {
            boolean caracteristica_correctas;
            do {
                caracteristica_correctas = true;
                if (!salir) {
                    System.out.println("Toque 0 para salir o 1 para continuar");
                    sal = in.nextInt();
                    if (sal == 0) {
                        salir = true;
                        System.out.println("has salido del juego");
                    } else {
                        System.out.println("ingrese la velocidad del Jugador 1");
                        velocidad = in.nextInt();
                        while (velocidad > 200 || velocidad < 1) {
                            System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                            System.out.println("Intente de nuevo");
                            System.out.print("Ingrese la velocidad del jugador 1: ");
                            velocidad = in.nextInt();
                        }
                    }
                }
                if (!salir) {
                    System.out.println("Toque 0 para salir o 1 para continuar");
                    sal = in.nextInt();
                    if (sal == 0) {
                        salir = true;
                        System.out.println("has salido del juego");
                    } else {
                        System.out.println("");
                        System.out.println("Ingrese la ataque del jugador 1");
                        ataque = in.nextInt();
                        while (ataque > 200 || ataque < 1) {
                            System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                            System.out.println("Intente de nuevo");
                            System.out.print("Ingrese el ataque del jugador 1: ");
                            ataque = in.nextInt();
                        }
                    }
                }
                if (!salir) {
                    System.out.println("Toque 0 para salir o 1 para continuar");
                    sal = in.nextInt();
                    if (sal == 0) {
                        salir = true;
                        System.out.println("has salido del juego");
                    } else {
                        System.out.println("");
                        System.out.println("ingrese la defensa del jugador 1");
                        defensa = in.nextInt();
                        while (defensa > 200 || defensa < 1) {
                            System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                            System.out.println("Intente de nuevo");
                            System.out.print("Ingrese la defensa del jugador 1: ");
                            defensa = in.nextInt();
                        }
                    }
                }
                if (!salir) {
                    System.out.println("Toque 0 para salir o 1 para continuar");
                    sal = in.nextInt();
                    if (sal == 0) {
                        salir = true;
                        System.out.println("has salido del juego");
                    } else {
                        System.out.println("");
                        System.out.println("ingrese la vida del jugador 1");
                        lifepoint = in.nextInt();
                        while (lifepoint > 200 || lifepoint < 1) {
                            System.out.println("la vida no puede ser mayor de 200 ni menor que 1.");
                            System.out.println("Intente de nuevo");
                            System.out.println("ingrese la vida del jugador 1");
                            lifepoint = in.nextInt();
                        }
                    }
                }
                jugador_1 = velocidad + ataque + defensa + lifepoint;
                if (jugador_1 > 500) {
                    System.out.println("ERROR");
                    System.out.println("ingrese correctamente los datos...");
                    caracteristica_correctas = false;
                }
                //creo un while porque hasta que el booleano me diga que es falso este se va a repetir hasta
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
                }
                System.out.println("escoja su personaje");
                int personajes;


                personajes = in.nextInt();
                switch (personajes) {
                    case 1 -> {
                        System.out.println("1.- EL DESCTRUCTOR");
                        System.out.println("DESTRUIR EL MUNDO QUIERO YO");
                        System.out.println("GRAAHHHHHWWW");
                        System.out.println("─────────▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄─────────\n" +
                                "───────▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄───────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒███▒▒▒▒▒▒▒▒███▒▒▒▌──────\n" +
                                "▄▄────▐▒▒▒███▒▒▒▒▒▒▒▒███▒▒▒▌────▄▄\n" +
                                "▌▒▀▄──▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──▄▀▒▐\n" +
                                "▌▒▒▒▀▄█▒▒▒▄▀▄▄▀▀▄▄▀▀▄▄▀▄▒▒▒█▄▀▒▒▒▐\n" +
                                "▀▄▒▒▒▒▐▒▒▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌▒▒▌▒▒▒▒▄▀\n" +
                                "──▀▄▒▒▐▒▒▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌▒▒▌▒▒▄▀──\n" +
                                "────▀▄▐▒▒▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌▒▒▌▄▀────\n" +
                                "──────█▒▒▐▄▀▄▀▀▄▄▀▀▄▄▀▀▄▌▒▒█──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▌──────\n" +
                                "──────▐▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▓▓▄▀▀▄▓▓▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                                "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                                "───────▀▀▀▀▀▀▀▀────▀▀▀▀▀▀▀▀──────");
                        System.out.println("Habilidades: Destruccion Final,explosion,levitacion,autodestuccion");
                        System.out.println("Defensa:Coraza de lava(no los ataque de agua y hielo no le afecta)");
                        System.out.println("Habilidad Final:Veneno-Veneno (Te conviertes en Veneno por 3 turnos");
                        break;
                    }
                    case 2 -> {
                        System.out.println("2.- El Vini");
                        System.out.println("Quiero mi Balon");
                        System.out.println("BUABUABUAAAAAABUAAAAAA");
                        System.out.println("                                                                            \n" +
                                "                                                                                       \n" +
                                "                                        +*%%%%%%#.                                     \n" +
                                "                                      -%@@@@@@@@@@@%%                                  \n" +
                                "                                      #%====++**#@@@@%=                                \n" +
                                "                                      .=+***####***#@@#                                \n" +
                                "                                      -#%#**#%####%%#%                                 \n" +
                                "                                      :*#*+=**%#+*###@                                 \n" +
                                "                                      .+++=+##**####**                                 \n" +
                                "                                       ++==+***#%%%*:                                  \n" +
                                "                                        #**@%*##%%%#::                                 \n" +
                                "                                  :::=*+%#%@@@%%%@%%#=**====--:.                       \n" +
                                "                             :...:-:--=+-+@@@@@@%%%%#-===-=====+==:.                   \n" +
                                "                          .  -.:----+===+=+*@@@%@%@%+==+++===++*++====*.               \n" +
                                "                    :#+.:. ...-+++=++++++*+#*+*****++=====+++=+*#*+*++#%#*.            \n" +
                                "                 :=++*@@+..+*****++++=+**+=#+=+*+=====--++*+++##**+#**@@@@%*.          \n" +
                                "             .=+**#####%@@#+#+**%##+=--*+=+===--==-----====++##+-+#++@@@%###*          \n" +
                                "           =+***#%%%@@%%%@@#*%%#%%%#*++-=####++++---*+**+=**:        =#%##%%+          \n" +
                                "         =+******#%%-        +#%%%%*+*#%%++==--=======-==*#+         +#%#%%#           \n" +
                                "        =%%%###***##=        -+#*+**#*=++@%%###*+*#**#*@%%+.         ..*%%-            \n" +
                                "           #%%%#######       -=+**+-=+#++%++#*%#@%#%##%#**-          .---              \n" +
                                "              %@%%%%####:    :==+==+=--=*+==++++==*#%%***++*#####*#%%=-                \n" +
                                "                 +@@@%%%%#*: :-+**+++=*+--*#%++*+##+##*+*%*+-:=*#%%%%.                 \n" +
                                "                     =@@@@%%#**+*+**+=+**#+--++***+=--**%@@@@@@@@%.                    \n" +
                                "                          #@@%%@%%%%%####+++==++#***#***#+                             \n" +
                                "                             =#@@@@@@%%#**+=++==+***=*+*+:                             \n" +
                                "                             :=++**+###**++++==+*+==*+*+=:                             \n" +
                                "                             -=+++=+****=*++*#*+=+#*++*++. ");
                    }
                    case 3 -> {
                        System.out.println("3. El Kongs");
                        System.out.println("Siempre ando con Gang`s.");
                        System.out.println("acompañado con lo que manda");

                        System.out.println("──────▄████████▄────────\n" +
                                "─────────────▄█▀▒▒▒▒▒▒▒▀██▄──────\n" +
                                "───────────▄█▀▒▒▒▒▒▒▒▒▒▒▒██──────\n" +
                                "─────────▄█▀▒▒▒▒▒▒▄▒▒▒▒▒▒▐█▌─────\n" +
                                "────────▄█▒▒▒▒▒▒▒▒▀█▒▒▒▒▒▐█▌─────\n" +
                                "───────▄█▒▒▒▒▒▒▒▒▒▒▀█▒▒▒▄██──────\n" +
                                "──────▄█▒▒▒▒▒▒▒▒▒▒▒▒▀█▒▄█▀█▄─────\n" +
                                "─────▄█▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▀▒▒▒█▄────\n" +
                                "────▄█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▄───\n" +
                                "───▄█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▄──\n" +
                                "──▄█▒▒▒▄██████▄▒▒▒▒▄█████▄▒▒▒▒█──\n" +
                                "──█▒▒▒█▀░░░░░▀█─▒▒▒█▀░░░░▀█▒▒▒█──\n" +
                                "──█▒▒▒█░░▄░░░░▀████▀░░░▄░░█▒▒▒█──\n" +
                                "▄███▄▒█▄░▐▀▄░░░░░░░░░▄▀▌░▄█▒▒███▄\n" +
                                "█▀░░█▄▒█░▐▐▀▀▄▄▄─▄▄▄▀▀▌▌░█▒▒█░░▀█\n" +
                                "█░░░░█▒█░▐▐──▄▄─█─▄▄──▌▌░█▒█░░░░█\n" +
                                "█░▄░░█▒█░▐▐▄─▀▀─█─▀▀─▄▌▌░█▒█░░▄░█\n" +
                                "█░░█░█▒█░░▌▄█▄▄▀─▀▄▄█▄▐░░█▒█░█░░█\n" +
                                "█▄░█████████▀░░▀▄▀░░▀█████████░▄█\n" +
                                "─██▀░░▄▀░░▀░░▀▄░░░▄▀░░▀░░▀▄░░▀██\n" +
                                "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                                "█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n" +
                                "█░▄░░░░░░░░░░░░░░░░░░░░░░░░░░░▄░█\n" +
                                "█░▀█▄░░░░░░░░░░░░░░░░░░░░░░░▄█▀░█\n" +
                                "█░░█▀███████████████████████▀█░░█\n" +
                                "█░░█────█───█───█───█───█────█░░█\n" +
                                "█░░▀█───█───█───█───█───█───█▀░░█\n" +
                                "█░░░▀█▄▄█▄▄▄█▄▄▄█▄▄▄█▄▄▄█▄▄█▀░░░█\n" +
                                "▀█░░░█──█───█───█───█───█──█░░░█▀\n" +
                                "─▀█░░▀█▄█───█───█───█───█▄█▀░░█▀─\n" +
                                "──▀█░░░▀▀█▄▄█───█───█▄▄█▀▀░░░█▀──\n" +
                                "───▀█░░░░░▀▀█████████▀▀░░░░░█▀───\n" +
                                "────▀█░░░░░▄░░░░░░░░░▄░░░░░█▀────\n" +
                                "─────▀██▄░░░▀▀▀▀▀▀▀▀▀░░░▄██▀─────\n" +
                                "────────▀██▄▄░░░░░░░▄▄██▀────────\n" +
                                "───────────▀▀███████▀▀───────────");
                        System.out.println("Habilidades: Rajar,explosion,malicisa,Rayos X");
                        System.out.println("Defensa:El barrio )");
                        System.out.println("Habilidad Final: Llama a sus Gangs");
                    }
                    case 4 -> {

                    }
                    default -> {
                        System.out.println("no valida");
                    }
                }
            }
        }
    }}