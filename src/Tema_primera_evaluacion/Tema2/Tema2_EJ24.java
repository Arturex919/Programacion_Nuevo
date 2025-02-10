package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double nota;
        int aprobados,desaprobados;
        boolean entrada=true;
        aprobados=0;
        desaprobados=0;
        System.out.println("para saber el numero de alumnos suspendidos cerrar con un numero negativo");
        while (entrada){
            System.out.println("introduzca la nota del alumno");
            nota= in.nextDouble();
           if (nota<0){
               entrada=false;
           }else if (nota>=5 && nota<=10){
                aprobados++;
            }else if (nota>=0 && nota<=4.99){
                desaprobados++;
            }
        }
        System.out.println("numero de apobado es "+ aprobados);
        System.out.println("numero de suspendidos es "+desaprobados);
        }
    }

