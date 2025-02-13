package Tema5.Colecciones.Banco;

import java.util.LinkedList;
import java.util.Scanner;

public class Cola_banco {
    //la creas como variable global para usarla en los metodos
    private static LinkedList<Usuario> cola = new LinkedList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            showmenu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1 -> {
                    agregaPersona();
                }
                case 2 -> {
                    atenderUsario();
                }
                case 3 -> {
                    in.nextLine();
                    System.out.println("añade el dni");
                    String dni = in.nextLine();
                    eliminatePerson(cola,dni);
                }
                case 4 -> {
                    mostraCola();
                }
                case 5 -> {
                    System.out.println("saliendo");
                }
                default -> {
                    System.out.println("opcion invalida");
                }
            }

        } while (opcion != 5);

    }

    //menu
    public static void showmenu() {
        System.out.println("BIENVIDO A LA COLA DEL BANCO");
        System.out.println("");
        System.out.println("=====Menu del Banco=====");
        System.out.println("1. Agregar usuario");
        System.out.println("2. Atender usuario");
        System.out.println("3. Quitar usuario por DNI");
        System.out.println("4. Mostrar cola");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    //metodo para agragar personas
    public static void agregaPersona() {
        Scanner in = new Scanner(System.in);
        String name, dni;
        int edad;
        System.out.println("ingresa tu nombre");
        name = in.nextLine();
        System.out.println("ingresa tu dni");
        dni = in.nextLine();
        do {
            System.out.println("Ingresa tu edad");
            edad = in.nextInt();
            if (edad < 0) {
                System.out.println("Error: La edad no puede ser negativa. Inténtalo de nuevo.");
            }
        } while (edad < 0);
        Usuario user = new Usuario(name, dni,edad);
        // Se usa addLast() para agregar al final de la cola,
        // simulando una fila de espera.
        cola.addLast(user);
        System.out.println("Persona añadida exitosamente a la lista");
    }

    public static void eliminatePerson(LinkedList<Usuario> cola,String dni) {
        boolean eliminado=false;
        for (int i = 0; i < cola.size(); i++) {
            if (cola.get(i).getDni().equals(dni)){//compara los dni
                Usuario borrado=cola.remove(i);//este va a buscar donde esta el mismo dni y lo va a borrar del usuario
                eliminado=true;
                System.out.println("Se ha eliminado correctamente  ");
                System.out.println(borrado);
            }
        }
        if (!eliminado){
            System.out.println("no se encontro el usuario con el dni"+dni);
        }

    }

    //metodo para atender al usario
    public static void atenderUsario() {
        if (cola.isEmpty()) {
            System.out.println("cola vacia");
        } else {
            //quita al primer usuario ya lo atiende
            Usuario atiende = cola.removeFirst();
            System.out.println("Se esta atendiendo al:");
            System.out.println(atiende);
        }
    }

    //metodo para mostrar la cola
    public static void mostraCola() {
        //empty es para comrpobrar si no esta vacia
        if (cola.isEmpty()) {
            System.out.println("la fila esta vacia");
        } else {
            //si hay usuarios nos muestra
            System.out.println("los usuarios en la cola son:");
            for (Usuario fila : cola) {
                System.out.println(fila);
            }
        }
    }
}
    /*
       //usamos un iterator ya que nos per permite recorrer una colección como el LinkedList
        //se usa para recorrer la lista cola y encontrar un usuario específico por su DNI
        //llamas al like para que poder buscar dentro de este
        Iterator <Usuario> borrado= cola.iterator();
        boolean elimado=false;
     */


