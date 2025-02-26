package Tema4_POO_INTRODUCCION.Tema3.EJ7_Ataque;

import java.util.regex.MatchResult;

public class AtaqueMagico implements Ataque {
    private int ataque;
    private int defensa;
    private int vida;
    private String nombreAtaques;
    private  String mana;


    @Override
    public void iLanzar() {
        System.out.println("Jugador 1 ha lazando"+ nombreAtaques);
    }

    @Override
    public void iCoste() {
        System.out.println("Tu ataque ; " +nombreAtaques+ " ha costa "+mana);
    }

    @Override
    public void iDaño() {
        vida=ataque-defensa;
    }
}
