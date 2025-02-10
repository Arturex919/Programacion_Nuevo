package Tema_primera_evaluacion.Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2_EJ29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, i;
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("ingrese un numero");
        num = in.nextInt();
        for (i = 0; i <= 100; i++) {
            if (randomInt == num) {
                System.out.println("es correcto adivino");
            } else if (i == 100) {
                System.out.println("has perdido");
            } else if (randomInt < num) {
                System.out.println("es un numero menor a : " + num);
            } else if (randomInt > num) {
                System.out.println("es un numero mayor a :" + num);
            }
        }
        System.out.println("el numero es: " + randomInt);
    }
}