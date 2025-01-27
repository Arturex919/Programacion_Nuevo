package POO_INTRODUCCION;

public class Persona {
    private String name;
    private String apellido;
    private int dni;
    private int edad;
    public static final int MAYOR_EDAD=18;
    public static final int JUBILADO=65;

    //cons parametro
    public Persona(int edad, int dni, String apellido, String name) {
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        this.name = name;
    }
    //gets
    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarDatos(String name, String apellido,int dni,int edad){
        System.out.println("El nombre y el apellido del usuer es :"+name+apellido+"\n"+
                "El numero de DNI es: "+dni+"\n"+
                "La edad del user es: "+edad);
    }
    public boolean isAdult(){
        if (edad>=18){
            return true;
        }else {
            System.out.println("El usuario es menor de edad");
        }
        return false;
    }
    public  boolean isReterirado(){
        if (edad >65){
            System.out.println("Si es retirado");
            return true;
        }else {
            System.out.println("Aun no es retirado");
        }
        return false;
    }
    public int ageDifference(int edad2){
        int diferencia=edad-edad2;
        if (diferencia>edad){
            System.out.println("Es mayor  el segundo usuario");
            System.out.println("La diferencia de edad es de :"+diferencia);
        }else {
            System.out.println("El usuario uno es mayor");
            System.out.println("La diferencia de edad es de :"+diferencia+" Años");

        }
        return diferencia;
    }
    public String check(int numero){
        if (numero < 10000000 || numero > 99999999) {
            System.out.println("El DNI debe tener 8 dígitos.");
        }
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    int resto=numero% 23;
    char letra = letras.charAt(resto);
        return numero+String.valueOf(letra);
}


}
