package POO_INTRODUCCION.EJ4_Hero;

import POO_INTRODUCCION.Hero;

import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        System.out.println("inserta tu nombre");
        String name = in.next();
        Hero hero = new Hero(name, 1, 300, 500, 0, 200, 255);
        int rondas = 0;
        boolean finDelJuego = false;
        while (!finDelJuego) {

            int numEnemigos = random.nextInt(3) + 1;//aparece entre uno y tres enemigos

            //almacenas valores enemigos
            Hero[] enemigos = new Hero[numEnemigos];

            for (int i = 0; i < enemigos.length; i++) {//recorre y le entrega el valor al enemigo y la almacena
                enemigos[i] = new Hero("Goblins " + (i + 1), (i + 1), 50, 50, 0, 50, 50);
            }
            boolean combate = false;
            while (!combate) {

                System.out.println("");
                System.out.println("Ronda : " + rondas);
                System.out.println("");
                System.out.println("Una horda de enemigos se acerca");
                System.out.println("El numero de enemigos que han aparecido es :" + numEnemigos);
                System.out.println("");
                System.out.println("Los stacks son: " + hero.toString());
                System.out.println("");
                System.out.println("Los stacks enemigos son:");
                for (int i = 0; i < numEnemigos; i++) {
                    System.out.println(enemigos[i].toString());
                }
                System.out.println("");
                //turno del hero
                for (int i = 0; i < enemigos.length; i++) {
                    hero.attack(enemigos[i]);//si no huye ataca
                    System.out.println(hero.getName() + " ha atacado a " + enemigos[i].getName());
                }

                //turno goblin
                for (int i = 0; i < enemigos.length; i++) {
                    if (random.nextInt(100) < 10) { // 10% de probabilidad de huir
                        System.out.println(enemigos[i].getName() + " ha huido del combate");
                        enemigos[i].setHealth(0); // El enemigo huye, por lo que se marca su salud como 0
                    } else {
                        enemigos[i].attack(hero); // Si no huye, ataca
                        System.out.println(enemigos[i].getName() + " ha atacado " + hero.getName());
                    }
                    if (hero.getHealth() <= 0) {
                        combate = true;
                        finDelJuego = true;
                    }
                }
                for (int i = 0; i < enemigos.length; i++) {
                    if (enemigos[i].getHealth() <= 0) {
                        System.out.println(enemigos[i].getName() + "enemigo muerto");

                        combate = true;
                    }
                }

            }
            if (hero.getHealth() <= 0) {
                System.out.println(hero.getName() + " Has muerto" + "\n" + "FIN DEL JUEGO");
                finDelJuego = true;
            }
            if (random.nextInt(1000) < 1) {//probabilidad de 1%
                hero.rest();//si acierta descansa
            }
            if (random.nextInt(10) < 1) {//probabilidad de 10%
                hero.drinkPotion();
            }
            if (hero.getHealth() > 0) {
                rondas++;
                System.out.println("Derrotaste a los enemigos");
            } else {
                System.out.println("\nEl juego ha terminado. Has sobrevivido a " + rondas + " hordas.");

            }
        }
    }
}
