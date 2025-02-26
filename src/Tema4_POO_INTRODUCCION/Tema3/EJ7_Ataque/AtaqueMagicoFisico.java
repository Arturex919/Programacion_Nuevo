package Tema4_POO_INTRODUCCION.Tema3.EJ7_Ataque;

public class AtaqueMagicoFisico implements Ataque {
    private String name;
    private int ataque;
    private int defensa;
    private int vida;
    private String nombreAtaques;
    private int mana;

    public AtaqueMagicoFisico(int mana, String nombreAtaques, int vida, int defensa, int ataque, String name) {
        this.mana = mana;
        this.nombreAtaques = nombreAtaques;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
        this.name = name;
    }

    public void iLanzar() {
        System.out.println(name + " ha lazando un ataque mixto " + nombreAtaques);
    }

    @Override
    public void iCoste() {
        int coste = mana - ataque;
        System.out.println("Tu ataque " + nombreAtaques + " ha costado " + ataque+ " de mana");
        System.out.println( " Te queda un mana de: "+coste);
    }

    //formula para ver el daño causado
    @Override
    public void iDaño() {
        int danio =defensa-ataque;//creas la variable para saber el daño
        danio *=0.9;//lo haces para que no baje mucho daño
        int danioFinal=Math.abs(danio);//valor absolute del daño final
        System.out.println(name + " le a quitado vida a su enemigo haciendo " +
                "un daño de " + danioFinal);
    }
}