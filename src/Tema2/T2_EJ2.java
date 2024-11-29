package Tema2;
import java.util.Scanner;
 //area y perimetro de un  rectangulo
public class T2_EJ2  {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double a,b,c,d;
        System.out.println("ingrese un valor para a");
        a= in.nextDouble();
        System.out.println("ingrese un valor para b");
        b= in.nextDouble();
        c=a*b;
        d=a*a*b*b;
        System.out.println("el valor del area es: "+c);
        System.out.println("el valor del perimetro es: " +d);
        in.close();
    }
}
