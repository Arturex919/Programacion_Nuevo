package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DosVariables {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1,num2;
        System.out.println("Añade dos valores ");
        try {
            System.out.println("ingresa el valor de A");
             num1=in.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("el valor ingresado no es un entero");
            return;
        }
        try {
            System.out.println("ingresa el valor de B");
            num2 = in.nextInt();

        }catch (InputMismatchException e) {
            System.out.println("el valor ingresado no es un entero");
            return;
        }
        try {
        int division=num1/num2;
            System.out.println("el resultado es "+division);
    }catch ( ArithmeticException e){
            System.out.println(e.getMessage());

        }
}
}