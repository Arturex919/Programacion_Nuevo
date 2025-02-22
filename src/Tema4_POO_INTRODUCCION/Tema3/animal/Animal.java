package Tema4_POO_INTRODUCCION.Tema3.animal;

public abstract class Animal {//creas una clase abtrasta
     protected String nombre;//usas el protected para poder utilizarla en las subclases

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println(nombre+ " esta comiendo,yummy yummy ");
    }
    public void dormir(){
        System.out.println(nombre+" esta durmiendo , ZzZzZzZzZ");
    }
    //creas el metodo abtracto,es el metodo con el que se va impletar a los animales
    public abstract  void hacerRuido();

}
