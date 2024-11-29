package Tema2;

import java.util.Scanner;

public class Tema2_EJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int an, mes, dias = 0;

        System.out.println("ingrese un numero del mes");
        mes = in.nextInt();
        System.out.println("ingrese el año");
        an = in.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;
            case 4, 6, 9, 11:
                dias = 30;
                break;
            case 2:
                if ((an % 4 == 0 && an % 100 != 0) || (an % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.println("el numero de dias " + dias);
        in.close();
    }
}

