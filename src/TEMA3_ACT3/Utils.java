package TEMA3_ACT3;


import TEMA3.TEMA3_ACT2.MyMath;

import java.util.Scanner;

public class Utils {
    public static double miles2kilometers(double milla) {
        double km;
        km = milla * 1.60;
        return km;
    }

    public static double kilometers2miles(double km) {
        double milla;
        milla = km * 0.62;
        return km;
    }

    public static double getTaxes(double cant, double impuesto) {
        double tax, rendodea;
        //cant=cantidad se le multiplica por la cantidad que tenemos y dividimos para 100
        tax = cant * (impuesto / 100);
        //se rendondea usando math.round(tax es el resultado del paso anteior se multiplica
        //para trabajar con enteros y evitar problemas divides para 100 al formato decimal original
        // pero ya redondeado a dos decimales.
        rendodea = Math.round(tax * 100) / 100;
        System.out.println("El impuesto para " + cant + "€ con un " + impuesto + "% es: " + tax + "€.");

        return rendodea;
    }

    public static double getNetPrice(double cant, double impuesto) {
        double calculo, total;
        calculo = cant * (impuesto / 100);
        total = cant + calculo;
        return total;
    }

    public static String getCoins(double euros) {
        int centavos;
        //casteas el valor para que de monedas en entero
        centavos = (int) Math.round(euros * 100);
        //el valor que introducimos anteriormente va hacer dividido en para el numero que
        //tenemos y vamos a sacar el modular si nos da
        int euro2 = centavos / 200;
        centavos %= 200;

        int euro1 = centavos / 100;
        centavos %= 100;

        int fiftycent = centavos / 50;
        centavos %= 50;

        int cent20 = centavos / 20;
        centavos %= 20;

        int cent10 = centavos / 10;
        centavos %= 10;

        int cent5 = centavos / 5;
        centavos %= 5;

        int cent2 = centavos / 2;
        centavos %= 2;

        int cent1 = centavos;


        String result = "" + euro2 + euro1 + fiftycent + cent20 + cent10 + cent5 + cent2 + cent1;

        return result;
    }


    public static String getNIF(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto=numero% 23;
        char letra = letras.charAt(resto);
        return numero+String.valueOf(letra);
    }
    public static boolean isValidNIF(int numero,char letra) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero");
            numero = in.nextInt();
            System.out.println("Ingrese la letra del DNI");
            letra=in.
            if (numero >= 1000000 && numero <= 99999999) {

                System.out.println("Su NIF es :");
            } else {
                System.out.println("ingrese un numero valido");
            }
        }
        while (numero <= 1000000 || numero >= 99999999);

        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

/* DNI
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numero;
    do {
        System.out.println("Introduce un numero");
         numero = in.nextInt();
        if (numero >=1000000 && numero<=99999999) {

            System.out.println("Su NIF es :"+getNIF(numero));

//        } else if (numero >8 ) {
//            System.out.println("ingrese un numero valido");
        }else {
            System.out.println("ingrese un numero valido");
        }
    }
    while (numero <=1000000 || numero>=99999999);

*/
}