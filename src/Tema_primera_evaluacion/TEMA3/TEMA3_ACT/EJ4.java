package Tema_primera_evaluacion.TEMA3.TEMA3_ACT;

import java.util.Scanner;
// Escribe un programa que permita pasar de euros a dólares y de dólares
//a euros. Necesitarás implementar el procedimiento showMenu() y las
//funciones euro2dollar y dollar2euro.//
public class EJ4 {

public static void showMenu(){
    System.out.println("------ MENÚ PRINCIPAL ------");
    System.out.println("1.Euro a Dolar");
    System.out.println("2. Dolar a Euro");
    System.out.println("3. Salir");
    System.out.print("Seleccione una opción: ");
}
public static double  euro2dollar(double euro){
    double dolar;
    dolar= euro*1.06;
    return dolar;
}
public static double dollar2euro(double dolar){
    double euroC;
    euroC =dolar*0.95;
    return euroC;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        //usas el dowhile para qu este se repita hasta que el usuario quiera salir//
        do {
            //LA COLOCAS AQUI POR AQUI LA LEE//
            showMenu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Haz Seleccionado: Euro a Dolares");
                    in.nextLine();
                    double euro;
                    System.out.println("ingrese su cantidad en Euros");
                    euro=in.nextDouble();
                    double cambiodolar=euro2dollar(euro);
                    System.out.println("Su conversion de "+euro+"€ en Dolares es : "+cambiodolar+" $");
                }
                case 2 -> {
                    System.out.println("Haz Seleccionado: Dolares a Euros ");
                    in.nextLine();
                    double dolar;
                    System.out.println("ingrese su cantidad en Dolares");
                    dolar=in.nextDouble();
                    double euroConversion=dollar2euro(dolar);
                    System.out.println("Su conversion de "+dolar+"$ en Euros es : "+euroConversion+" €");

                }
                case 3 -> {
                    System.out.println("Saliendoooo");
                }
                default -> System.out.println("Opcion no valida");
            }
            //hasta que opcion no sea !=3(distita a 3 este no va a salir)//
        }while (opcion!=3);
    }

}




