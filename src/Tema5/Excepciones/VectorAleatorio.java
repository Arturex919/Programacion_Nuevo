package Tema5.Excepciones;

import java.util.Random;
import java.util.Scanner;

public class VectorAleatorio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int valorRandom = random.nextInt(100) + 1;//numero aleatoria del 1 al 100
        int[] N = new int[valorRandom];//tiene un valor del 1 al 10

        try {
            //va a llenar el vector con numero de 1 al 10
            System.out.println("añade un numero");
            for (int i = 0; i < N.length; i++) {
                //añadir en un try
                N[i] = random.nextInt(10) + 1;//asignad un valor entre el 1 al 10
            }
            System.out.println("se ha creado un vector del tamaño" + N);
            System.out.println("Los valores se asigan aletoriamente del 1 al 100");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
        boolean continua = true;
        while (continua) {
            try {
                System.out.println("Ingresa la posicion que quieres ver 0 - " + (valorRandom - 1) + "O  -1 para salir");
                int numero = in.nextInt();
                if (numero == -1) {
                    System.out.println("Adiosss");
                    continua = true;
                } else if (numero >= 0 && numero < N.length) {
                    System.out.println("La posicion " + numero + " se encuentra el vector es :" + N[numero]);
                } else {
                    System.out.println("numero no reconocido");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                //añadir e.getMessage()

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        }
    }
}
