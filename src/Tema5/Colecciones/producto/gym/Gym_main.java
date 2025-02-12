package Tema5.Colecciones.producto.gym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gym_main {
    //usas el map afuera como una especie de metodo para que puedas usar en el todo el codigo
    private static Map<String, Usuario> gimnasio = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al Gym");
            showMenu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1 -> {
                    aniadePersona();
                }
                case 2 -> {
                darseBaja();
                }
                case 3 -> {
                    mostrarDatos();
                }
                case 4 -> {

                }
                case 5 -> {
                    System.out.println("adiosss");
                }
                default -> {
                    System.out.println("opcion invalida");
                }
            }
        } while (opcion != 5);
    }
    public  static void  showMenu(){
        System.out.println("=======MENU DE GYM========");
        System.out.println("1. Darse de alta");
        System.out.println("2. Darse de baja");
        System.out.println("3. Mostrar datos");
        System.out.println("4. Modificar datos de usuario");
        System.out.println("5. Salir");

    }
    public static void aniadePersona() {
        Scanner in = new Scanner(System.in);
        System.out.println("ingresa tu dni");
        String dni = in.nextLine();
        //contains  se usa para verificar claves existente
        if (gimnasio.containsKey(dni)) {
            System.out.println("ERROR : Ya existe un dni con este numero");
        }
        System.out.println("Añade tu nombre");
        String nombre= in.nextLine();
        System.out.println("");
        System.out.println("Añade tu edad");
        int edad= in.nextInt();
        Usuario user=new Usuario(nombre,edad);
    }
public  static void darseBaja(){
    Scanner in = new Scanner(System.in);
    System.out.println("ingresa tu dni");
    String dni = in.nextLine();
    //contains  se usa para verificar claves existente
    if (gimnasio.containsKey(dni)) {
        System.out.println("ERROR : Ya existe un dni con este numero");
    }
    gimnasio.remove(dni);
    System.out.println("El usuario con Dni :"+dni+ "fue eliminado exitosamente");
}
public static void mostrarDatos(){
    Scanner in = new Scanner(System.in);
    System.out.println("ingresa tu dni");
    String dni = in.nextLine();
    //contains  se usa para verificar claves existente
    if (gimnasio.containsKey(dni)) {
        System.out.println("ERROR : Ya existe un dni con este numero");
    }
    gimnasio.get(dni);
}

}