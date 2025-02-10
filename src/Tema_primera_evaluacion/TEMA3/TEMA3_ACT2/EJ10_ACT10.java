package Tema_primera_evaluacion.TEMA3.TEMA3_ACT2;

import Tema_primera_evaluacion.TEMA3.TEMA3_ACT.EJ3;
import Tema_primera_evaluacion.TEMA3.TEMA3_ACT.EJ7;


import java.util.Scanner;

//Crea un programa principal llamado Ejercicio10 donde utilices todas las
//funciones creadas anteriormente dentro de MyMath.//
public class EJ10_ACT10 {
    public static void showMenu() {
        System.out.println("=== Menú de Funciones de MyMath ===");
        System.out.println();
        System.out.print("Elija una opción: ");
        System.out.println("1. Calcular perímetro y área (Círculo, Cuadrado, Rectángulo)");
        System.out.println("2. Verificar si un número es primo o no primo");
        System.out.println("3. Número de dígitos de unnúmero entero.");
        System.out.println("4. Contar dígitos, dígitos pares de un número");
        System.out.println("5. Contar dígitos, dígitos  impares de un número");
        System.out.println("6. Calcular el factorial de un número");
        System.out.println("7. Calcular el factorial de un número - Metodo Recursivo");
        System.out.println("8. Calcular soluciones de una ecuación de segundo grado");
        System.out.println("9. Sumar los dígitos de un número");
        System.out.println("10. Salir");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            showMenu();
            opcion = in.nextInt();

            switch (opcion) {

                case 1 -> {
                    int areayp;
                    System.out.println("1. Calcular perímetro y área Círculo ");
                    System.out.println("2. Calcular perímetro y área Cuadrado");
                    System.out.println("3. Calcular perímetro y área Rectángulo)");
                    System.out.println("4. Salir");

                    do {
                        areayp = in.nextInt();
                        switch (areayp) {

                            case 1 -> {
                                System.out.println("Ingresa un radio");
                                double radio = in.nextDouble();
                                EJ3.validRadius(radio);
                                System.out.println("El area del ciruclo es: " + EJ3.calculateCircleArea(radio));
                                System.out.println("El perimetro de su circulo es:" + EJ3.calculateCircleArea(radio));
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.println("Ingrese un valor");
                                double cuadrado = in.nextDouble();
                                System.out.println("El area del cuadrado es: " + MyMath.squareArea(cuadrado));
                                System.out.println("El perimetro del cuadrado es: " + MyMath.squareArea(cuadrado));
                            }
                            case 3 -> {
                                double base, altura;
                                System.out.println("Ingrese la base del rectangulo");
                                base = in.nextDouble();
                                System.out.println("Ingrese la altura del rectangulo");
                                altura = in.nextDouble();
                                System.out.println("Su perimetro es :" + MyMath.rectanglePerimeter(base, altura));
                                System.out.println("Su area es :" + MyMath.rectangleArea(base, altura));
                            }
                            case 4 -> {
                                System.out.println("Salir");
                            }
                            default -> {
                                System.out.println("Opcion no Valida");
                            }
                        }

                    } while (areayp != 4);
                }
                case 2 -> {
                    System.out.println("Ingrese un numero");
                    int numero = in.nextInt();
                    if (EJ7.esPrimo(numero)) {
                        System.out.println(numero + " es un numero primo");
                    } else if (MyMath.noPrimo(numero)) {
                        System.out.println(numero + " es un numero NO primo");
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese su numero");
                    int nume = in.nextInt();
                    System.out.println("Los digitos que tiene su numero son : " + MyMath.contDigito(nume));
                }
                case 4 -> {
                    System.out.println("ingrese su numero");
                    int numero = in.nextInt();
                    System.out.println("Los digitos pares que tiene su numero son: " + MyMath.pares(numero));
                }
                case 5 -> {
                    System.out.println("ingrese su numero");
                    int numero = in.nextInt();
                    System.out.println(" Los digitos impares de su numero son : " + MyMath.impares(numero));
                }
                case 6 -> {
                    System.out.println("Ingrese un numero");
                    int numero = in.nextInt();
                    System.out.println("El factorial de su numero es " + MyMath.factorial(numero));
                }
                case 7 -> {
                    int numero;
                    do {
                        System.out.println("ingrese un numero");
                        numero = in.nextInt();
                        if (numero < 0) {
                            System.out.println("Error,ingrese un numero valido");
                        }
                    } while (numero < 0);
                    MyMath.factorialR(numero);
                }
                case 8 ->{

                    double a, b, c;
                    do {
                        System.out.println("añada un valor para a");
                        a = in.nextDouble();
                        if (a == 0) {
                            System.out.println("A no puede ser 0");
                        }
                    } while (a == 0);
                    System.out.println("añada un valor para b");
                    b = in.nextDouble();
                    System.out.println("añada un valor para c");
                    c = in.nextDouble();
                    MyMath.segundoGrado(a,b,c);
                }
                case 9 -> {
                    System.out.println("Ingrese un numero");
                    int num = in.nextInt();
                    System.out.println("La suma de los dígitos de " + num + " es: " + MyMath.sumaD(num));
                }
                case 10 ->{
                    System.out.println("Saliendoooo");
                }
                default -> {
                    System.out.println("opcion no valida");
                }
            }

        } while (opcion != 10);
    }
}

