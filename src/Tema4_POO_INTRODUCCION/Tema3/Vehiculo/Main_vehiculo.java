package Tema4_POO_INTRODUCCION.Tema3.Vehiculo;

import java.util.Scanner;

public class Main_vehiculo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        char opcion;
        int opcion1;

        boolean continua=false;
        do {
            showMenu();
            opcion =in.next().toUpperCase().charAt(0);
            switch (opcion){
                case 'A'->{
                    System.out.println("Has seleccionado  turismo");
                    do {
                        System.out.println("Seleciona el tipo de uso del vehiculo 1.) Profesional 2.) Particular ");
                        opcion1 = in.nextInt();

                        switch (opcion1) {
                            case 1 -> {
                                System.out.println("El uso de tu coche es de uso profesional");
                                String modelo="";
                                int numeroPlaza=0;
                                coches(modelo,numeroPlaza);
                                continua=true;
                            }
                            case 2 -> {
                                System.out.println("El uso de tu coche es de uso Particular");
                                String modelo="";
                                int numeroPlaza=0;
                                coches(modelo,numeroPlaza);
                                continua=true;
                            }
                            case 3 -> {
                                System.out.println("Adios");
                                continua=true;
                            }
                            default -> {
                                System.out.println("opcion1 no reconocida");
                            }
                        }
                    }while (opcion1 !=3);
                }
            }
        }while (opcion !='D');

    }
    public static void showMenu(){
        System.out.println("A. Turismo");
        System.out.println("B. Camiones");
        System.out.println("C. Ciclomotor");
        System.out.println("D. Salir");
    }
    public static void coches(String modelo, int numeroPlaza ){
        Scanner in=new Scanner(System.in);
        System.out.println("Inserta los siguientes datos de tu coche");
        System.out.println("");
        System.out.println("Escriba el modelo del coche ");
        modelo= in.nextLine();
        System.out.println("Dime el numero de plazas en el coche");
        numeroPlaza = in.nextInt();
    }
}
