package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double suma = 0;
        int num, cont = 0;

        do {
            System.out.println("ingrese un numero");
            num = in.nextInt();
            if (num>=0) {
                suma += num;
                cont++;
            }
        } while (num >= 0);
            double media;
            media = suma / cont;
        System.out.println(media);
        }
    }
