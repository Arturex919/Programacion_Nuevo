package Tema4_POO_INTRODUCCION.Tema3.EJ1_Vehiculo;

import java.util.Scanner;

public class Main_vehiculo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char opcion;

        do {
            mostrarMenu();
            opcion = in.next().toUpperCase().charAt(0);
            in.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 'A' ->{
                    turista(in);
                }
                case 'B' -> {
                    camion(in);
                }
                case 'C' -> {
                    ciclomotor(in);
                }
                case 'D' -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 'D');

    }

    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("A. Crear Turismo");
        System.out.println("B. Crear Camión");
        System.out.println("C. Crear Ciclomotor");
        System.out.println("D. Salir");
        System.out.print("Seleccione una opción: ");
    }
    public static void  turista(Scanner in){

        System.out.println("Ingresa la marca");
        String marca=in.nextLine();
        System.out.println("Ingresa el color");
        String color=in.nextLine();
        System.out.println("Ingrese el tipo del vehiculo ya sea Profesional o turista ");
        String tipo= in.nextLine();
        System.out.println("ingresa el numero de plaza");
        int numeroPlaza= in.nextInt();
        Turismo vehiculo=new Turismo(marca,color,tipo,numeroPlaza);
        vehiculo.mostrarDatos();
    }
    public static void camion(Scanner in){
        System.out.println("Ingresa la marca");
        String marca=in.nextLine();
        System.out.println("Ingresa el color");
        String color=in.nextLine();
        System.out.println("ingresa el peso del camion");
        double peso=in.nextDouble();
        System.out.println("transporta mercancia peligrosa? (true/false))");
        boolean esPeligrosa=in.nextBoolean();
        Camiones camiones=new Camiones(marca,color,peso,esPeligrosa);
        camiones.mostrarDatos();
    }
    public static void ciclomotor(Scanner in){
        System.out.println("Ingresa la marca");
        String marca=in.nextLine();
        System.out.println("Ingresa el color");
        String color=in.nextLine();
        System.out.println("ingresa la cilindrada");
        int cilindrada =in.nextInt();
        Ciclomotores moto =new Ciclomotores(marca,color, cilindrada);
        moto.mostrarDatos();
    }





}
