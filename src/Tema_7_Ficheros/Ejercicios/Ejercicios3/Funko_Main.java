package Tema_7_Ficheros.Ejercicios.Ejercicios3;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Funko_Main {
    public static String fileName = "Documentos/Ejercicios3/funkos.csv";
    public static ArrayList<Funko> funkos = new ArrayList<>();

    public static void main(String[] args) {
        loadFunko();
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingresa una opcion");
            showMenu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> {
                    aniadeFunko(funkos, in);
                }
                case 2 -> {
                    eliminarFunko(funkos, in);
                }
                case 3 -> {
                    mostrarFunko(funkos);
                }
                case 4 -> {
                    funkoCostoso(funkos);
                }
                case 5 -> {
                    media(funkos);
                }
                case 6 ->{
                    mostrarModelos(funkos);
                }
                case 7 ->{
                   /* mostarFunkoYear(funkos);*/
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
            opcion = in.nextInt();

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
                    if (!funkos.contains(funkoAniadido)) {
                        funkos.add(funkoAniadido);
                        saveFunko(funkos);

                        System.out.println(funkoAniadido.toString());

                    } else {
                        System.out.println("El Funko ya existe en la colección.");
                    }
                }
                case 2 -> {
                    System.out.println("Adiosssss");
                    sal = true;
                }
                default -> System.out.println("Opcion no valida");
            }
        }
    }


    public static void saveFunko(ArrayList<Funko> funkos) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName, true))) {//el true es para que no se sobreescriba todo
            for (Funko lee : funkos)
                br.write(lee.getCod() + "," + lee.getNombre() + "," +
                        lee.getModelo() + "," +
                        lee.getPrecio() + "," +
                        lee.getFechaLanzamiento());
            br.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadFunko() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Intentar crear un Funko desde la línea CSV
                Funko funko = Funko.fromCSV(linea);
                if (funko != null) {
                    funkos.add(funko);  // Solo añadir si no es null
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //corregir no borra funko
    public static void eliminarFunko(ArrayList<Funko> funkos, Scanner in) {
        in.nextLine();
        System.out.println("COD del funko a eliminar");
        String remove = in.next();
        //nota
        //funko es una variable temporal que solo usas dentor del parentesis,
        // no existe fuera del parentesis
        //removeIf lo borra si (funko -> funko ca a coger el cod y lo compara si esta para eliminar)
        boolean eliminado = funkos.removeIf(funko -> funko.getCod().equalsIgnoreCase(remove));
        if (eliminado) {
            System.out.println("se ha eliminado");
            saveFunko(funkos);
        } else {
            System.out.println("no eliminado");
        }
    }

    public static void mostrarFunko(ArrayList<Funko> funkos) {
        if (funkos.isEmpty()) {
            System.out.println("no hay funko");
        } else {
            for (Funko funko : funkos) {
                System.out.println(funko.toString());
            }
        }
    }

    public static void funkoCostoso(ArrayList<Funko> funkos) {
        Funko funkoMoney = funkos.get(0);
        for (Funko funkoCaro : funkos) {
            if (funkoCaro != null && funkoCaro.getPrecio() > funkoMoney.getPrecio()) {
                funkoMoney = funkoCaro;
            }
        }
        System.out.println("El Funko más caro es:");
        System.out.println(funkoMoney);

    }

    public static void media(ArrayList<Funko> funkos) {
        double suma = 0;
        double media = 0;
        double resulut;

        if (funkos.isEmpty()) {
            System.out.println("No hay funkos");
        } else {
            for (Funko media1 : funkos) {

                suma += media1.getPrecio();
                media++;
            }
            media = suma / funkos.size();
            resulut = Math.round(media * 100.0) / 100.0;//es para que redonde y te muestre lo decimales
            System.out.println(resulut);
        }
    }
    //correjir bien
    public static void mostrarModelos(ArrayList<Funko>funkos) {
        Map<String, List<Funko>> modeloFunko = new HashMap<>();
        for (Funko modelos : funkos) {
            String personaje = modelos.getModelo();
            modeloFunko.putIfAbsent(personaje, new ArrayList<>());
            modeloFunko.get(personaje).add(modelos);
        }
        for (String modeloPersonaje : modeloFunko.keySet()) {//lo cojes de la llave del arrayList
            System.out.println("Modelo: " + modeloPersonaje);
            //el for-each lo haces con el la llave anterior del for
            for (Funko personajes : modeloFunko.get(modeloPersonaje)) {
                System.out.println(" -" + personajes);
            }
        }
    }
    }



