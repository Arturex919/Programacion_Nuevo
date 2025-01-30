package POO_INTRODUCCION;

public class Persona {
    private String name;
    private String apellido;
    private String dni;
    private int edad;
    public static final int MAYOR_EDAD=18;
    public static final int JUBILADO=65;

    public Persona() {
        this.name = " ";
        this.edad = 0;
        this.dni = " ";
        this.apellido =" ";
    }

    //cons parametro
    public Persona( String name,String apellido, String dni,int edad) {
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

    public void mostrarDatos(String name, String apellido,String dni,int edad){
        System.out.println("El nombre y el apellido del user es :"+name +"  "+ apellido+"\n"+
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
    public boolean check(String dni){
   if (dni.length() !=9){//si es disntito a 9 digitos nos dara error
       System.out.println("Numero invalido,ingresa un numero valido");
       return false;
   }
        for (int i = 0; i < 8; i++) {//recorre los numeros
            if (!Character.isDigit(dni.charAt(i))){
                return false;
            }
        }
        char letra=dni.charAt(8);
        return Character.isLetter(letra);
}


}
