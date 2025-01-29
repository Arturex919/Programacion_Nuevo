package POO_INTRODUCCION;

import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("inserta tu nombre");
        String name = in.next();
        Hero hero = new Hero(name, 1, 100, 100, 0, 30, 15);
        int rondas = 0;
        boolean finDelJuego=false;
        while (!finDelJuego) {

            int numEnemigos = random.nextInt(3) + 1;//aparece entre uno y tres enemigos

            //almacenas valores enemigos
            Hero[] enemigos = new Hero[numEnemigos];

            for (int i = 0; i < numEnemigos; i++) {//recorre y le entrega el valor al enemigo y la almacena
                enemigos[i] = new Hero("Goblins", (i + 1), 1, 50, 50, 15, 10);
            }


            while (hero.getHealth() > 0 && numEnemigos > 0){

                System.out.println("");
                System.out.println("Ronda : "+rondas);
                System.out.println("");
                System.out.println("Una horda de enemigos se acerca");
                System.out.println("El numero de enemigos que han aparecido es :" + numEnemigos);
                System.out.println("");
                System.out.println("Los stacks son: "+hero.toString());
                System.out.println("");
                System.out.println("Los stacks enemigos son:");
                for (int i = 0; i < numEnemigos; i++) {
                    System.out.println(enemigos[i].toString());
                }
                System.out.println("");
                //turno del hero
                if (random.nextInt(100)<90){//tiene un 10% de probabilidad de huir
                    hero.attack();//si no huye ataca
                    System.out.println(hero.getName()+" ha atacado");

                    //turno goblin
                    for (int i = 0; i < numEnemigos; i++) {
                        if (random.nextInt(100)<90) {
                            if (random.nextInt(100) < 10) { // 10% de probabilidad de huir
                                System.out.println(enemigos[i].getName() + " ha huido del combate");
                                enemigos[i].setHealth(0); // El enemigo huye, por lo que se marca su salud como 0
                            } else {
                                enemigos[i].attack(); // Si no huye, ataca
                                System.out.println(enemigos[i].getName() + " ha atacado");
                            }
                        }
                    }
                }else {//si es 10% huye
                    System.out.println(hero.getName()+"Huyo del combate");
                    finDelJuego=true;
                }
                if (hero.getHealth()<=0){
                    System.out.println(hero.getName()+" Has muerto"+"\n"+"FIN DEL JUEGO");
                    finDelJuego=true;
                }
                if (random.nextInt(1000)<1){//probabilidad de 1%
                    hero.rest();//si acierta descansa
                }
                if (random.nextInt(10)<1){//probabilidad de 10%
                    hero.drinkPotion();
                }
                if (hero.getHealth()>0){
                    rondas++;
                    System.out.println("Derrotaste a los enemigos");
                }else {
                    System.out.println("\nEl juego ha terminado. Has sobrevivido a " + rondas + " hordas.");

                }
            }
        }
    }
}
