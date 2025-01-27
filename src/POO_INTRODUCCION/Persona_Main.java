package POO_INTRODUCCION;

import java.util.Scanner;

public class Persona_Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String name="Arturo";
            String apellido=" Calle";
            int dni;
            int age=18;
            int age2=12;
            Persona persona1=new Persona(age,4, apellido,name);
        System.out.println("AÑade tu dni");
        persona1.check(dni= in.nextInt());
            persona1.mostrarDatos(name,apellido,dni,age);
            persona1.ageDifference(age2);

    }
}
