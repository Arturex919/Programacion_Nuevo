package Tema4_POO_INTRODUCCION.Tema3.EJ7_Ataque;

public class AtaqueMagico implements Ataque {
    private String name;
    private int ataque;
    private int defensa;
    private int vida;
    private  int mana;
    private String nombreAtaques;

    public AtaqueMagico(String name, int ataque, int defensa, int vida, int mana, String nombreAtaques) {
        this.name = name;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.mana = mana;
        this.nombreAtaques = nombreAtaques;
    }

    @Override
    public void iLanzar() {
        System.out.println(name+ " ha lazando "+ nombreAtaques);
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
