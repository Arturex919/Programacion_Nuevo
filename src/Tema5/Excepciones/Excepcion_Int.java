package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion_Int {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       try {
           System.out.println("añada un numero entero");
           int num = in.nextInt();
           System.out.println("el numero introducido es "+num);

       }catch (InputMismatchException num){
           System.out.println("Valor introducido incorrecto,ingresa un numero entero");
       }finally {
           in.close();
       }
    }
}
