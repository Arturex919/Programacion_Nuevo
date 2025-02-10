package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora, min, seg;
        System.out.println("introduzca la hora");
        hora = in.nextInt();
        System.out.println("introduzca los min");
        min = in.nextInt();
        System.out.println("introduzca los seg");
        seg = in.nextInt();
        seg++;
        if (seg == 60) {
            seg = 0;
            min++;
            if (min == 60) {
                min = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
        System.out.println("la hora es = "+ hora + ":" + min + ":" + seg);
        in.close();
    }
}

