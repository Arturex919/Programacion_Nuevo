package Tema2;

import java.util.Scanner;

public class Tema2_EJ14{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int personas, dias,Precio,total;
        double descuento;
        System.out.println("ingrese el numero de personas");
        personas= in.nextInt();
        System.out.println("ingrese el numero de dias que se va quedar");
        dias= in.nextInt();

            Precio=15;
            total=dias*Precio;
            descuento= total * 0.25;

        if (personas >=5 && dias>=7 ){
            System.out.println("se realiza un descuento de="+descuento);
        }else{
            System.out.println("su precio es= "+ total);
        }
        in.close();
    }
}
