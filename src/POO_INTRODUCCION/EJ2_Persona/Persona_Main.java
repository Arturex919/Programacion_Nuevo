package POO_INTRODUCCION.EJ2_Persona;

import java.util.Scanner;

public class Persona_Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, apellido, dni;
        int age;
        Persona persona1 = new Persona();
        System.out.println("ingrese el nombre de la persona 1");
        name = in.next();
        persona1.setName(name);
        System.out.println("Ingrese su apellido");
        apellido = in.next();
        persona1.setApellido(apellido);
        System.out.println("Ingrese su edad");
        age = in.nextInt();
        persona1.setEdad(age);
        do {
            // Verificar que los primeros 8 caracteres sean dígitos
            System.out.println("ingrese su DNI");
            dni = in.next();
            persona1.check(dni);
            if (!persona1.check(dni)) {
                System.out.println("DNI no valido");
            }
        } while (!persona1.check(dni));//verifica si es una letra el ultimo digito

        Persona persona2 = new Persona();
        String name2, apellido2, dni2;
        int age2;
        System.out.println("ingrese el nombre de la persona 2");
        name2 = in.next();
        persona2.setName(name);
        System.out.println("Ingrese su apellido");
        apellido2 = in.next();
        persona2.setApellido(apellido);
        System.out.println("Ingrese su edad");
        age2 = in.nextInt();
        persona2.setEdad(age);
        do {
            // Verificar que los primeros 8 caracteres sean dígitos
            System.out.println("ingrese su DNI");
            dni2 = in.next();
            persona2.check(dni2);
            if (!persona1.check(dni2)) {
                System.out.println("DNI no valido");
            }
        } while (!persona1.check(dni2));

        Persona persona=new Persona(name,apellido,dni,age);
        Persona persona_2=new Persona(name2,apellido2,dni2,age2);
        System.out.println("La informacion de persona 1");
        persona.mostrarDatos(name,apellido,dni,age);
        System.out.println("Es mayor de edad? " + (persona1.isAdult() ? "Sí" : "No"));
        System.out.println("¿Está jubilado? " + (persona1.isReterirado() ? "Sí" : "No"));

        System.out.println("La informacion de persona 2?");
        persona_2.mostrarDatos(name2,apellido2,dni2,age2);
        System.out.println("¿Es mayor de edad? " + (persona2.isAdult() ? "Sí" : "No"));
        System.out.println("¿Está jubilado? " + (persona2.isReterirado() ? "Sí" : "No"));

        System.out.println("La diferencia de edad es: " + persona1.ageDifference(age2)+"años");
        }

    }

