package Tema_primera_evaluacion.Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2_EJ28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        Random random = new Random();
        int randomint = random.nextInt(100000);
        System.out.println(randomint);
        System.out.println("Bienvenido a la loteria");
        boolean ganador = false;
        for (int i = 1; i <= 5; i++) {
            System.out.println("ingrese los cinco numeros de su boleto ");
            a = in.nextInt();
            System.out.println("intento" + i + "ingresa tu numero");
            if (a == randomint) {
                System.out.println("¡FELICIDADES!");
                System.out.println("ha ganado la loteria ");
                ganador = true;
            } else {
                System.out.println(" no ha ganado la loteria ");
            }
        }
        in.close();
        }
    }


