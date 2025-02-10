package Tema_primera_evaluacion.TEMA3.TEMA3_ACT2;

import Tema_primera_evaluacion.TEMA3.TEMA3_ACT.EJ7;

//Crea una clase MyMath que tendrá funciones para calcular el perímetro y
//el área de un círculo, cuadrado y rectángulo. Los nombres de las
//funciones serán:
//squarePerimeter
//squareArea
//rectanglePerimeter
//rectangleArea
//circlePerimeter
//circleArea//
public class MyMath {
    //1//
    public static double squarePerimeter(double ladocuadrado) {
        double perimetro;
        perimetro = 4 * ladocuadrado;
        return perimetro;
    }

    public static double squareArea(double num) {
        double areaC;
        areaC = num * num;
        return areaC;
    }

    public static double rectanglePerimeter(double numX, double numY) {
        double perimetro;
        perimetro = 2 * (numX + numY);
        return perimetro;
    }

    public static double rectangleArea(double base, double altura) {
        double area;
        area = base * altura;
        return area;
    }

    //2 ñade una función a MyMath que nos diga si un número es primo. Añade
    //otra función que nos diga si un número NO es primo (reutiliza código).//
    public static boolean noPrimo(int numero) {
        boolean noPrime=EJ7.esPrimo(numero);
        return noPrime;
    }
    //3 Añade a MyMath una función que nos indique el número de dígitos de un
    //número entero//
    public static int contDigito(int numero) {
        numero = Math.abs(numero);
        if (numero == 0) {
            return 1;
        }

        int cont = 0;
        while (numero > 0) {
            numero /= 10;
            cont++;
        }
        return cont;
    }
    //4.Añade a MyMath una función que devuelve el número de dígitos pares de
    //un número entero.//
    public static int pares(int num) {
        num = Math.abs(num);
        int cont = 0;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                cont++;
            }
            num /= 10;
        }

        return cont;
    }

    //5 Añade a MyMath una función que devuelve el número de dígitos impares
    //de un número entero.//
    public static int impares(int num) {
        num = Math.abs(num);
        int cont = 0;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                cont++;
            }
            num /= 10;
        }

        return cont;
    }
    //6 Añade a MyMath una función que nos calcule el factorial de un número//
    public static int factorial(int num) {

        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i; // *=  Multiplicamos por cada número
        }
        return resultado;
    }
    //7 Añade a MyMath una función que nos calcule el factorial de un número
    //(de manera recursiva)//
    public static int factorialR(int num) {

        if (num == 0 || num == 1) {
            return 1; //en el caso de que sea 0 o 1 siempre va a ser 1//
        }
        int factor;
        factor = num * factorialR(num - 1); //se usa para recursividad//
        System.out.println("El factorial de " + num + " es de : " +factor);
        return factor;
    }
    //8 . Añade una función a MyMath que recibirá 3 coeficientes de una ecuación
    //de segundo grado y devolverá cuántas soluciones tiene la ecuación (2, 1
    //o 0).//
    public static void segundoGrado(double a, double b, double c) {
        double proceso;
        //este espara ver el numero de soluciones//
        proceso = b * b - 4 * a * c;
        //vamos a determinar el numero de soluciones y la respuesta que nos puede dar//
        if (proceso > 0) {
            //METODO DE FORMULA GENERAL//
            double raiz = (-b + Math.sqrt(proceso)) /( 2 * a);
            double raiz2 = (-b - Math.sqrt(proceso)) / (2 * a) ;
            System.out.println("La ecuacion "+a+"X^2 "+b+"X "+c+" =0 tiene dos soluciones");
            System.out.println("Solucion 1 :" + raiz);
            System.out.println("Solucion 2 :" + raiz2);
        } else if (proceso == 0) {
            //CUANDO EL proceso es igual a 0, significa que las raíces son iguales. se usa
            // double raiz = -b / (2 * a);//
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene 1 solución real:");
            System.out.println("Raíz: " + raiz);
        } else {
            System.out.println("No tiene una solucion real");
        }

    }
    //9 Añade una función a MyMath que sume los dígitos de un número entero //
    public static int sumaD(int numero) {
        //asegura ser positivo//
        numero = Math.abs(numero);
        int suma = 0;
        while (numero > 0) {
            // Obtenemos el último dígito y lo sumamos//
            suma += numero % 10;
            numero /=10; // Eliminamos el último dígito
        }
        return suma;
    }

/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {

            showMenu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1 -> {
                    double radio;
                    do {
                        System.out.println("añada un radio");
                        radio = in.nextDouble();
                        if (EJ3.validRadius(radio)) {

                            System.out.println("Su perimetro es :" + EJ3.calculateCiclePerimeter(radio));
                            System.out.println("Su area es :" + EJ3.calculateCircleArea(radio));
                        } else {
                            System.out.println("No es valido ");
                        }
                    } while (!EJ3.validRadius(radio));
                }
                case 2 -> {
                    double numero;

                    System.out.println("Ingrese un numero");
                    numero = in.nextInt();
                    System.out.println("Su perimetro es :" + squarePerimeter(numero));
                    System.out.println("Su area es :" + squareArea(numero));
                }
                case 3 -> {
                    double base, altura;
                    System.out.println("Ingrese la base del rectangulo");
                    base = in.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo");
                    altura = in.nextDouble();
                    System.out.println("Su perimetro es :" + rectanglePerimeter(base, altura));
                    System.out.println("Su area es :" + rectangleArea(base, altura));
                }
                case 4 -> {
                    System.out.println("Hasta la Proximaaaaaa");
                }
                default -> {
                    System.out.println("No valida");
                }

            }
        } while (opcion != 4);
    }*/

}
