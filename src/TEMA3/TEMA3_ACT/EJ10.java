package TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ10 {
    //)Escribe un programa que muestre un menú con 9 opciones (si tus
    //ejercicios son modulares no debería costarte demasiado):
    //a) Muestra el signo de un número introducido por el usuario.
    //b) Indica si el usuario es mayor de edad o no.
    //c) Calcula el área y perímetro de un círculo.
    //d) Conversor de euros a dólares y de dólares a euros.
    //e) Mostrar tabla de multiplicar de un número.
    //f) Mostrar tablas de multiplicar del 1 al 10.
    //g) Comprobador de números primos.
    //h) Comprobador de fechas.
    //i) Dibujar triángulos.//
    public static void showMenu() {
        System.out.println("Menu Principal ");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.");
        System.out.println("b) Indica si el usuario es mayor de edad o no.");
        System.out.println("c)Calcula el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
        System.out.println("j) Salir");
        System.out.println("Seleccione una opcion");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opcion;
        do {
            showMenu();
            opcion = in.next().charAt(0);
            switch (opcion) {
                case 'a' -> {
                    System.out.println("ingrese un numero");
                    int numero = in.nextInt();
                    EJ.numberSign(numero);
                    if (EJ.numberSign(numero) >= 1) {
                        System.out.println("su numero  es 1");
                    } else if (EJ.numberSign(numero) == 0) {
                        System.out.println("su numero  es 0");
                    } else {
                        System.out.println("su numero  es -1");
                    }
                }
                case 'b' -> {
                    System.out.println("Ingrese su edad");
                    int edad = in.nextInt();
                    if (EJ2.isAdult(edad)) {
                        System.out.println("Es mayor de edad");
                    } else {
                        System.out.println("Es menor de edad");
                    }
                }
                case 'c' -> {
                    double radio;
                    do {
                        System.out.println("inserte un radio");
                        radio = in.nextDouble();
                        if (EJ3.validRadius(radio)) {
                            System.out.println(EJ3.calculateCiclePerimeter(radio));
                            System.out.println(EJ3.calculateCircleArea(radio));
                        }

                    } while (!EJ3.validRadius(radio));
                }
                case 'd' -> {
                    int cantidad;
                    EJ4.showMenu();
                    int opci = in.nextInt();
                    switch (opci) {
                        case 1 -> {
                            System.out.println("Ingrese su cantidad");
                            cantidad = in.nextInt();
                            EJ4.euro2dollar(cantidad);
                            System.out.println(EJ4.euro2dollar(cantidad));
                        }
                        case 2 -> {
                            System.out.println("Ingrese su cantidad");
                            cantidad = in.nextInt();
                            EJ4.dollar2euro(cantidad);
                            System.out.println(EJ4.dollar2euro(cantidad));

                        }
                        case 3 -> {
                            System.out.println("Hasta luego");
                        }
                        default -> {
                            System.out.println("opcion no valida");
                        }

                    }
                }
                case 'e' -> {
                    int tabla;
                    System.out.println("Que tabla quiere ver");
                    tabla = in.nextInt();
                    EJ5.tabla(tabla);
                }
                case 'f' -> {
                    for (int num = 1; num <= 10; num++)
                        EJ6.mostrarTabla(num);
                    System.out.println("");
                }
                case 'g' -> {
                    int num;
                    System.out.println("ingrese su numero");
                    num = in.nextInt();
                    if (EJ7.esPrimo(num)){
                        System.out.println("Es primo");
                    }else {
                        System.out.println("No es primo");
                    }
                }
                case 'h'->{
                    int dia,mes,anio;
                    System.out.println("Ingrese su fecha");
                    dia = in.nextInt();
                    System.out.println("Ingrese un mes del 1 al 12");
                    mes=in.nextInt();
                    System.out.println("Ingrese un año");
                    anio=in.nextInt();
                    if (EJ8.fechaValida(dia,mes,anio)){
                        System.out.println("Fecha valida");
                    }else {
                        System.out.println("No es valida");
                    }
                }
                case 'i'->{
                    int nume;
                    char caracter;
                    System.out.println("Ingrese el numero de filas");
                    nume= in.nextInt();
                    System.out.println("Ingrese el tipo de caracter");
                    caracter=in.next().charAt(0);
                    EJ9.triangulo(caracter,nume);
                }
                case 'j' -> {
                    System.out.println("Adioooos");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        }
        while (opcion != 'j');
    }
}
