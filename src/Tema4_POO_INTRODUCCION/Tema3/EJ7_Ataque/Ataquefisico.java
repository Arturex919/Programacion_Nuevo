package Tema4_POO_INTRODUCCION.Tema3.EJ7_Ataque;

public class Ataquefisico implements  Ataque{
    private int ataque;
    private int defensa;
    private int vida;
    private String name;
    private String nombreAtaques;
    private  int mana;

    public Ataquefisico(int ataque, int defensa, int vida, String name, String nombreAtaques, int mana) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.name = name;
        this.nombreAtaques = nombreAtaques;
        this.mana = mana;
    }

    public void iLanzar() {
        System.out.println(name+ " ha lazando"+ nombreAtaques);
    }

    @Override
    public void iCoste() {
        int coste = mana - ataque;
        System.out.println("Tu ataque " + nombreAtaques + " ha costado " + ataque+ "de mana");
        System.out.println( " Te queda un mana de: "+coste);
    }

    @Override
    public void iDaño() {
        int danio =defensa-ataque;//creas la variable para saber el daño
        danio *=0.9;//lo haces para que no baje mucho daño
        int danioFinal=Math.abs(danio);//valor absolute del daño final
        System.out.println(name + " le a quitado vida a su enemigo haciendo un daño de " + danioFinal);
    }
}
