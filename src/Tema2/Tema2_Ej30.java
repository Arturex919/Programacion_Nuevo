package Tema2;

import java.util.Scanner;
public class Tema2_Ej30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opciones;
        boolean entrar=true;
        System.out.println("Bienvenido a la calculadora");
        while (entrar) {
            double num1, num2;
            System.out.print("Ingrese el primer número: ");
            num1 = in.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            num2 = in.nextDouble();
            System.out.println("Ingrese el signo de la operación que quiere realizar:");
            System.out.println(" + , - , * , / , % y 0 para Salir");
            opciones = in.next().charAt(0);

            //switch caracter '+'
            switch (opciones) {
                case '0' ->{
                    System.out.println("Saliendo de la calculadora. ¡Gracias por usarla!");
                    entrar=false;
                }
                case '+' -> {
                    double suma;
                    suma = num1 + num2;
                    System.out.println("La suma de num1+num2");
                    System.out.println("La suma es : " + suma);
                }
                case '-'-> {
                    double resta;
                    resta = num1 - num2;
                    System.out.println("el resultado de la resta es : " + resta);
                }
                case '*' -> {
                    double Multiplicacion;

                    Multiplicacion = num1 * num2;
                    System.out.println("el resultado de la suma es : " + Multiplicacion);
                }
                case '/'-> {
                    double division;
                    if (num2 != 0) {
                        division = num1 / num2;
                        System.out.println("el resultado es :" + division);
                    } else {
                        System.out.println("no se puede dividir en cero");
                    }
                }
                case '%' -> {
                    double resto;
                    if (num2 != 0) {
                        resto = num1 % num2;
                        System.out.println("el resultado es :" + resto);
                    } else {
                        System.out.println("errooooooor");
                    }
                }

            }
        }
    }
}

