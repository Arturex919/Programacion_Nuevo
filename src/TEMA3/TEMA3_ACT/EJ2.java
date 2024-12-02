package TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ2 {
    //Utiliza la función anterior y una función nueva que crearás llamada
    //isAdult para hacer un programa que reciba una edad e indica si se es
    //mayor de edad o no.
    //boolean isAdult(age)//
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int edad,num;
        System.out.println("Ingrese su edad");
        edad=in.nextInt();
        boolean adulto = isAdult(edad);
        if (adulto){
            System.out.println("es mayor");
        }else {
            System.out.println("es menor");
        }
        in.nextLine();
        System.out.println("dame un numero");
        num= in.nextInt();
        int res=numberSign(num);
        if (res ==1){
            System.out.println("su numero  es positivo");
        } else if (res == -1) {
            System.out.println("su numero  es negativo");
        } else {
            System.out.println("su numero  es cero");
        }
    }
    public static boolean isAdult(int age) {
        //se crea un bool resul para comprobar la edad si true o false//
        boolean result = false;
        //si es mayor es true//
        if (age >= 18) {
            result = true;
        }else {
            System.out.println("");
        }
        //hacemos el return a la variable return
        return result;
    }
    public static int numberSign(int numero){
        if (numero>0){
            return 1; // si es mayor a 0 nos devuelve 1
        } else if (numero < 0) {
            return -1;  // si es menor a 0 nos devuelve -1
        }else {
            return 0;  // si es igual a 0 nos devuelve 0
        }
    }
}
