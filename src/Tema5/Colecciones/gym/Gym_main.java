package Tema5.Colecciones.gym;

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
                    modificarDatos();
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
        //put es para añadir
        gimnasio.put(dni,user);

    }
    //revisar el ERRO:
public  static void darseBaja(){
    Scanner in = new Scanner(System.in);
    System.out.println("ingresa tu dni");
    String dni = in.nextLine();

    //contains  se usa para verificar claves existente
    if (gimnasio.containsKey(dni)) {
        gimnasio.remove(dni);
        System.out.println("El usuario con Dni :" + dni + "fue eliminado exitosamente");
    }else {
        System.out.println("ERROR : no existe un dni con este numero");
    }
}
public static void mostrarDatos() {
    Scanner in = new Scanner(System.in);
    System.out.println("ingresa tu dni");
    String dni = in.nextLine();
    // Verificar si el DNI existe en el mapa
    if (!gimnasio.containsKey(dni)) {
        System.out.println("ERROR: No existe un usuario con este DNI.");
    }else {
        // Obtener el usuario asociado al DNI y mostrarlo
        Usuario usuario = gimnasio.get(dni);
        System.out.println("Datos del usuario:");
        System.out.println(usuario); // Llama al método toString() automáticamente
    }
}
    public static void modificarDatos(){
    Scanner in = new Scanner(System.in);
        System.out.println("añada tu dni");
        String dni = in.nextLine();
        //contains  se usa para verificar claves existente
        if (gimnasio.containsKey(dni)) {
             Usuario user=gimnasio.get(dni);
        System.out.println("Agrega tu nuevo nombre o deja vacio para no cambiar");
        String nombre=in.nextLine();
        if (!nombre.isEmpty()){
            user.setNombre(nombre);
    }
        System.out.println("Agrega tu nueva edad si no toca un -1 para no cambiar");
        int edad=in.nextInt();
        if (edad <=-1){
            user.setEdad(edad);
        }
        System.out.println("Se han modificado sus datos ");
        System.out.println("sus nuevos datos son:");
            System.out.println(user);
    }else {
            System.out.println("ERROR : Ya existe un dni con este numero");
        }

}
}