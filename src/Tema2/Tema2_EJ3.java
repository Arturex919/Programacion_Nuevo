package Tema2;
import java.util.Scanner;
//base y altura de un triangulo
public class Tema2_EJ3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
                double b,h,A,P ;
                System.out.println("ingrese un valor para b");
                b= in.nextDouble();
                System.out.println("ingrese un valor para h");
                h=in.nextDouble();
                A= b*h / 2 ;
                P= b+b+b ;
        System.out.println("el area del triangulo es:"+A);
        System.out.println("El perimetro del triangulo es:"+ P);
        in.close();
    }
}