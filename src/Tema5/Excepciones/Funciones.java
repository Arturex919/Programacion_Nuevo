package Tema5.Excepciones;

import java.util.Scanner;

public class Funciones {

    public static void imprimePositivo(int p) {

        // Método que lanza excepción si el número es negativo
        if (p < 0) {
            System.out.println("Error: " + p + " es un número menor a 0.");
        } else {
            System.out.println("Número positivo: " + p);
        }
    }


    // Método que lanza excepción si el número es positivo o cero
    public static void imprimeNegativo(int p) {
        if (p >= 0) {
            System.out.println(p + " es un número positivo o mayor a cero.");
        } else {
            System.out.println("Número negativo: " + p);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continua = false;

        while (!continua) {
            try {
                System.out.println("Ingresa un número entero (-1 para salir): ");
                int numero = in.nextInt();

                // Verifica si el usuario quiere salir antes de llamar a las funciones
                if (numero == -1) {
                    System.out.println("Adiós!");
                    continua = true;
                }

                try {
                    imprimePositivo(numero);
                    imprimeNegativo(numero);
                } catch (Exception e) {
                    System.out.println("Error numero invalido " );
                    in.next();
                }

            } catch (Exception e) {
                System.out.println("Error: Ingresa un número entero válido.");
            } finally {
                System.out.println("Añadido correctamente");
            }
        }
    }
}