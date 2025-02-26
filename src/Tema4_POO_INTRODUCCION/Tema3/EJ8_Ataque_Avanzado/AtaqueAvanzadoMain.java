package Tema4_POO_INTRODUCCION.Tema3.EJ8_Ataque_Avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtaqueAvanzadoMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Crear un ArrayList para almacenar los ataques
        ArrayList<AtaqueAvanzado> ataques = new ArrayList<>();

        System.out.println("Introduce los valores para el Ataque Bola de Fuego:");
        System.out.print("Mana: ");
        int manaBolaFuego = in.nextInt();
        System.out.print("Esfuerzo Físico: ");
        int esfuerzoFisicoBolaFuego = in.nextInt();
        System.out.print("Daño Mágico: ");
        int danioMagicoBolaFuego = in.nextInt();
        System.out.print("Daño Físico: ");
        int danioFisicoBolaFuego = in.nextInt();
        ataques.add(new AtaqueBolaFuego(manaBolaFuego, esfuerzoFisicoBolaFuego, danioMagicoBolaFuego, danioFisicoBolaFuego));
        System.out.println();
        System.out.println("Introduce los valores para el Ataque Espadazo:");
        System.out.print("Mana: ");
        int manaEspadazo = in.nextInt();
        System.out.print("Esfuerzo Físico: ");
        int esfuerzoFisicoEspadazo = in.nextInt();
        System.out.print("Daño Mágico: ");
        int danioMagicoEspadazo = in.nextInt();
        System.out.print("Daño Físico: ");
        int danioFisicoEspadazo = in.nextInt();
        ataques.add(new AtaqueEspadazo(manaEspadazo, esfuerzoFisicoEspadazo, danioMagicoEspadazo, danioFisicoEspadazo));
        System.out.println();
        System.out.println("Introduce los valores para el Ataque Espadazo Encantado:");
        System.out.print("Mana: ");
        int manaEspadazoEncantado = in.nextInt();
        System.out.print("Esfuerzo Físico: ");
        int esfuerzoFisicoEspadazoEncantado = in.nextInt();
        System.out.print("Daño Mágico: ");
        int danioMagicoEspadazoEncantado = in.nextInt();
        System.out.print("Daño Físico: ");
        int danioFisicoEspadazoEncantado = in.nextInt();
        ataques.add(new AtaqueEspadazoEncantado(manaEspadazoEncantado, esfuerzoFisicoEspadazoEncantado, danioMagicoEspadazoEncantado, danioFisicoEspadazoEncantado));

        for (AtaqueAvanzado ataque : ataques) {
            if (ataque instanceof AtaqueBolaFuego){
                System.out.println("---- Ataque Bola de Fuego ----");
            } else if (ataque instanceof AtaqueEspadazo) {
                System.out.println("---- Ataque Espadazo ----");
            } else if (ataque instanceof AtaqueEspadazoEncantado) {
                System.out.println("---- Ataque Espadazo Encantado ----");
            }
            // Lanzar el ataque
            ataque.iLanzarAtaque();

            // Calcular daño de cada tipo
            System.out.println("Daño Mágico: " + ataque.iDaño(TipoDanio.MAGICO));
            System.out.println("Daño Físico: " + ataque.iDaño(TipoDanio.FISICO));
            System.out.println("Daño Mixto: " + ataque.iDaño(TipoDanio.MIXTO));

            // Calcular coste de cada tipo
            System.out.println("Coste Mana: " + ataque.iCoste(TipoCoste.MANA));
            System.out.println("Coste Esfuerzo Físico: " + ataque.iCoste(TipoCoste.ESFUERZO_FISICO));
            System.out.println("Coste Mixto: " + ataque.iCoste(TipoCoste.MIXTO));
        }
    }
}
