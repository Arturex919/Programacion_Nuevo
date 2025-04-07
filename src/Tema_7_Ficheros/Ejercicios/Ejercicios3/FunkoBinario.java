package Tema_7_Ficheros.Ejercicios.Ejercicios3;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class FunkoBinario {
    public static String fileName = "Documentos/Ejercicios3/funkos.csv";  // Nombre del archivo CSV
    public static String fileName2 = "Documentos/Ejercicios3/funkos.dat"; // Nombre del archivo binario (.dat)
    public static ArrayList<FunkobinarioClass> funkos = new ArrayList<>();

    public static void main(String[] args) {
        loadFunkoFromCSV(fileName, funkos); // Cargar datos desde CSV
        Scanner in = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        do {
            System.out.println("Ingresa una opcion");
            showMenu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> aniadeFunko(funkos, in);
                case 2 -> eliminarFunko(funkos, in);
                case 3 -> mostrarFunko(funkos);
                case 4 -> funkoCostoso(funkos);
                case 5 -> media(funkos);
                case 6 -> mostrarModelos(funkos);
                case 7 -> mostarFunkoYear(funkos);
                case 8->{
                    System.out.println("Hasta luego");
                    salir=true;
                }
            }
        } while (opcion != 8);

        // Guardar los datos de funkos en un archivo binario al finalizar
        saveFunkoBinario(funkos);
    }

    public static void showMenu() {
        System.out.println("1) Añadir funko");
        System.out.println("2) Borra funko");
        System.out.println("3) Mostrar todos los funkos");
        System.out.println("4) Mostrar funko más costoso");
        System.out.println("5) Mostrar la media de precios de los funkos");
        System.out.println("6) Mostrar funkos agrupados por modelos");
        System.out.println("7) Mostrar funkos de 2023");
        System.out.println("8) Salir");
    }

    public static void aniadeFunko(ArrayList<FunkobinarioClass> funkos, Scanner in) {
        boolean sal = false;
        int opcion;
        while (!sal) {
            System.out.println("1) Añadir un funko ");
            System.out.println("2) Salir");
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
                    // Crear el objeto Funko
                    FunkobinarioClass funkoAniadido = new FunkobinarioClass(cod, nombre, modelo, precio, fecha);
                    if (!funkos.contains(funkoAniadido)) {
                        funkos.add(funkoAniadido);
                        System.out.println(funkoAniadido.toString());
                    } else {
                        System.out.println("El Funko ya existe en la colección.");
                    }
                }
                case 2 -> {
                    System.out.println("Adiosssss");
                    sal = true;
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }

    // Función para guardar los funkos en un archivo binario (.dat)
    public static void saveFunkoBinario(ArrayList<FunkobinarioClass> funkos) {
        try (ObjectOutputStream binario = new ObjectOutputStream(new FileOutputStream(fileName2))) {
            // Guardar todos los objetos Funko en el archivo binario
            for (FunkobinarioClass funko : funkos)
                binario.writeObject(funko);
            System.out.println("Funkos guardados en el archivo binario.");
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void loadFunkoFromCSV(String fileName, ArrayList<FunkobinarioClass> funkos) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean firstLine = true; // Para ignorar la primera línea (encabezado)

            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // Ignoramos la primera línea
                    continue;
                }

                // Dividir la línea por comas (CSV)
                String[] datos = line.split(",");

                // Verificar si la línea tiene la cantidad de columnas correctas
                if (datos.length == 5) {
                    String cod = datos[0].trim();
                    String nombre = datos[1].trim();
                    String modelo = datos[2].trim();

                    double precio = 0;
                    try {
                        precio = Double.parseDouble(datos[3].replace(",", ".").trim());
                    } catch (NumberFormatException e) {
                        System.err.println("Precio inválido en la línea: " + line);
                        continue; // Saltar esta línea si el precio no es válido
                    }

                    LocalDate fecha = null;
                    try {
                        fecha = LocalDate.parse(datos[4].trim());
                    } catch (Exception e) {
                        System.err.println("Fecha inválida en la línea: " + line);
                        continue; // Saltar esta línea si la fecha no es válida
                    }

                    // Crear el objeto Funko y agregarlo a la lista
                    FunkobinarioClass funko = new FunkobinarioClass(cod, nombre, modelo, precio, fecha);
                    funkos.add(funko);
                } else {
                    System.err.println("Formato incorrecto en la línea: " + line);
                }
            }
            System.out.println("Funkos cargados desde el archivo CSV.");
        } catch (IOException e) {
            System.err.println("Error al cargar funkos desde el archivo CSV: " + e.getMessage());
        }
    }

    // Funciones para eliminar, mostrar y manejar los funkos
    public static void eliminarFunko(ArrayList<FunkobinarioClass> funkos, Scanner in) {
        in.nextLine();
        System.out.println("COD del funko a eliminar");
        String remove = in.next();
        boolean eliminado = funkos.removeIf(funko -> funko.getCod().equalsIgnoreCase(remove));
        if (eliminado) {
            System.out.println("Se ha eliminado");
            saveFunkoBinario(funkos); // Guardar cambios en el archivo binario
        } else {
            System.out.println("No se encontró el funko");
        }
    }

    public static void mostrarFunko(ArrayList<FunkobinarioClass> funkos) {
        if (funkos.isEmpty()) {
            System.out.println("No hay funkos");
        } else {
            for (FunkobinarioClass funko : funkos) {
                System.out.println(funko.toString());
            }
        }
    }

    public static void funkoCostoso(ArrayList<FunkobinarioClass> funkos) {
        FunkobinarioClass funkoMoney = funkos.get(0);
        for (FunkobinarioClass funkoCaro : funkos) {
            if (funkoCaro.getPrecio() > funkoMoney.getPrecio()) {
                funkoMoney = funkoCaro;
            }
        }
        System.out.println("El Funko más caro es:");
        System.out.println(funkoMoney);
    }

    public static void media(ArrayList<FunkobinarioClass> funkos) {
        double suma = 0;
        if (funkos.isEmpty()) {
            System.out.println("No hay funkos");
        } else {
            for (FunkobinarioClass funko : funkos) {
                suma += funko.getPrecio();
            }
            double media = suma / funkos.size();
            System.out.println("La media de precios es: " + media);
        }
    }

    public static void mostrarModelos(ArrayList<FunkobinarioClass> funkos) {
        System.out.println("Modelos:");
        Set<String> modelos = new HashSet<>();
        for (FunkobinarioClass funko : funkos) {
            modelos.add(funko.getModelo());
        }
        for (String modelo : modelos) {
            System.out.println(modelo);
        }
    }

    public static void mostarFunkoYear(ArrayList<FunkobinarioClass> funkos) {
        System.out.println("Funkos de 2023:");
        for (FunkobinarioClass funko : funkos) {
            if (funko.getFechaLanzamiento().getYear() == 2023) {
                System.out.println(funko);
            }
        }
    }
}
