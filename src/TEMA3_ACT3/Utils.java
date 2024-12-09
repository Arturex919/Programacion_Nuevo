package TEMA3_ACT3;


import TEMA3.TEMA3_ACT2.MyMath;

import java.util.Scanner;
public class Utils {
    public static double miles2kilometers(double milla){
        double km;
        km= milla*1.60;
        return km;
    }
    public static double kilometers2miles(double km){
        double milla;
        milla= km*0.62;
        return km;
    }

    public static double getTaxes(double cant,double impuesto){
        double tax,rendodea;
        //cant=cantidad se le multiplica por la cantidad que tenemos y dividimos para 100
        tax=cant * (impuesto/100);
        //se rendondea usando math.round(tax es el resultado del paso anteior se multiplica
        //para trabajar con enteros y evitar problemas divides para 100 al formato decimal original
        // pero ya redondeado a dos decimales.
        rendodea= Math.round(tax*100)/100;
        System.out.println("El impuesto para " + cant + "€ con un " + impuesto + "% es: " + tax + "€.");

        return rendodea;
    }
    public static double getNetPrice(double cant,double impuesto){
        double calculo,total;
        calculo=cant*(impuesto/100);
        total=cant+calculo;
        return total;
    }
    public static String getCoins(double euros){
        int centavos;
        //casteas el valor para que de monedas en entero
        centavos= (int)Math.round(euros*100);
        int euro2=centavos/200;
        euro2%=200;
        int euro1=centavos/100;
        euro1%=100;
        int fiftycent=centavos/50;
        centavos%=50;
        int cent20=20;
        cent20%=20;
        int cent10=10;
        cent10%=10;
        int cent5=5;
        cent5%=5;
        int cent2=2;
        cent2%=2;
        int cent1=1;
        cent1%=1;

        String result = ""+euro2+euro1+fiftycent+cent20+cent10+cent5;

        return getCoins(centavos);

    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int art,aa;
        System.out.println("muestra numero ");
        art= in.nextInt();
        System.out.println("precio");
        aa=in.nextInt();
        getTaxes(art,aa);
    }

}