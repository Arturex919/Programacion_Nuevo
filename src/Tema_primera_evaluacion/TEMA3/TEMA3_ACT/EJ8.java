package Tema_primera_evaluacion.TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ8 {
    //Escribe un programa que lea por consola un día (1-31), un mes (1-12) y
    //un año y nos indique si la fecha es correcta o no.//
    //pregunta //
    //si creas una variable bool el return de la variable creada no se guarda en el metodo si no en la variable
    // pero cuando se llame el metodo la variable creada respondera igualmente//
    public static boolean biciesto(int anioBiciesto) {
        //creamos un bool para determinar cuando es un año biciesto y cuando no//
        boolean esbiciesto;
        esbiciesto = (anioBiciesto % 4 == 0 && anioBiciesto % 100 != 0) || (anioBiciesto % 400 == 0);
        return esbiciesto;
    }

    public static boolean fechaValida(int dia, int mes, int anio) {
        boolean fechaValida;
        //si el año o mes no es correcto esta salta diciendo no es valida//
        if (anio <= 0 || mes < 1 || mes > 12) {
            return false;
        }
        // diasmaximo y switch determina el numero de dia que tiene cada mes a excepción de febrero//
        int diaMaximo;
        switch (mes) {
            case 4, 6, 9, 11 -> {
                diaMaximo = 30;
            }
            case 2 -> {
                if (biciesto(anio)) {
                    diaMaximo = 29;
                } else {
                    diaMaximo = 28;
                }
            }
            default -> {
                diaMaximo = 31;
            }
        }
        return dia >= 1 && dia <= diaMaximo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, anio;
        boolean valida = false;
        //creas un bucle para que no finalice el programa//
        while (!valida) {
            System.out.println("ingrese un dia");
            dia = in.nextInt();
            System.out.println("ingrese un mes");
            mes = in.nextInt();
            System.out.println("ingrese un año");
            anio = in.nextInt();
            //llamas al metodo decha valida para que compruebe si es correcta o no//
            if (fechaValida(dia, mes, anio)) {
                //valida true es para que acabe el bucle//
                valida = true;
                System.out.println("La fecha ingresada es correcta");
            } else {
                System.out.println("Ingrese una fecha valida");
            }

        }
    }
}


