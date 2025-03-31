package Tema_7_Ficheros.Ejercicios.Ejercicios3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Funko_Main {
    public static String fileName="Documentos/Ejercicios3/funkos.csv";
    public static ArrayList<Funko> funkos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingresa una opcion");
            showMenu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> {
                    aniadeFunko(funkos,in);
                }
            }
        } while (opcion != 8);
    }

    public static void showMenu() {
        System.out.println("1) Añadir funko");
        System.out.println("2) Borra funko");
        System.out.println("3) Mostrar todos los funko");
        System.out.println("4) Mostrar funko mas costoso");
        System.out.println("5) Mostrar la media de precios de los funkos");
        System.out.println("6) Mostrar funko agrupados por modelos");
        System.out.println("7) Mostrar funko del 2023");
    }

    public static void aniadeFunko(ArrayList<Funko> funkos, Scanner in) {
        boolean sal = false;
        int opcion;
        while (!sal) {
            System.out.println("1) Añade tu funko ");
            System.out.println("2) salir");
             opcion=in.nextInt();

                 switch (opcion) {
                     case 1 -> {
                         in.nextLine();
                         System.out.println("Añade el COD");
                         String cod = in.nextLine();
                         System.out.println("Añade el nombre");
                         String nombre = in.nextLine();
                         System.out.println("Añade el modelo");
                         String modelo = in.nextLine();
                         System.out.println("Añade el precio");
                         double precio = in.nextDouble();
                         in.nextLine();
                         System.out.println("Añade la fecha de lanzamiento (YYYY-MM-DD)");
                         LocalDate fecha = LocalDate.parse(in.nextLine());
                         //LocalDate Guardas la fecha
                         Funko funkoAniadido = new Funko(cod, nombre, modelo, precio, fecha);
                         if (!funkos.contains(funkoAniadido)){
                             funkos.add(funkoAniadido);
                             saveFunko();
                             String lee = "Se añadio el funko correctamente"+"\n"+
                                     "CARACTERISCAS"+"\n"+"COD :"+cod
                                     +"\n"+"Nombre: "+nombre+"\n"+
                                     "Modelo: "+modelo+"\n"+"Precio "+precio+"\n"+
                                     "Fecha: "+fecha;
                             System.out.println(lee);
                         }else {
                             System.out.println("El Funko ya existe en la colección.");
                         }
                     }
                     case 2 -> {
                         System.out.println("Adiosssss");
                         sal=true;
                     }
                     default -> System.out.println("Opcion no valida");
                 }
        }
    }
    public static void saveFunko(){
        try(BufferedWriter br=new BufferedWriter(new FileWriter(fileName))){
            for (Funko lee :funkos)
            br.write( "Se añadio el funko correctamente"+"\n"+
                    "CARACTERISCAS"+"\n"+"COD :"+lee.getCod()+"\n"
                    +"\n"+"Nombre: "+lee.getNombre()+"\n"+
                    "Modelo: "+ lee.getModelo()+"\n"+"Precio "+lee.getPrecio()+"\n"+
                    "Fecha: "+ lee.getFechaLanzamiento());
            br.newLine();
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void eliminarFunko(Scanner in){
        System.out.println("Nombre del funko a eliminar");
        String remove=in.nextLine();
        if (remove.equalsIgnoreCase(remove)){
            funkos.remove(remove);
        }
    }

}
