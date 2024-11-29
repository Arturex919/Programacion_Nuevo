package Tema2;

import java.util.Scanner;

public class Tema2_EJ16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("converion de euros a dolares");
        char opcion = in.next().charAt(0);
        double D, E;
        switch (opcion) {
            case 'D':
                System.out.println("ingrese un valor en Dolares");
                D = in.nextDouble();
                E = (int) D / 1.08;
                System.out.println("el valor es" + E);
                break;
            case 'E':
                System.out.println("ingrese un valor en Euros");
                E= in.nextDouble();
                D=E*0.92;
                System.out.println("el valor es" + D);
                break;
        }

        in.close();
    }
}
