package Tema4_POO_INTRODUCCION.Tema3.EJ8_Ataque_Avanzado;

public class AtaqueEspadazoEncantado implements AtaqueAvanzado {
    private int mana = 100;
    private int esfuerzoFisico = 50;
    private int danioMagico = 75;
    private int danioFisico = 75;



    public AtaqueEspadazoEncantado(int mana, int esfuerzoFisico, int danioMagico, int danioFisico) {
        this.mana = mana;
        this.esfuerzoFisico = esfuerzoFisico;
        this.danioMagico = danioMagico;
        this.danioFisico = danioFisico;
    }

    @Override
    public void iLanzarAtaque() {
        System.out.println("Le han dado un espadazo encatado");
    }

    //llamas al enun para determinar el tipo de daño
    @Override
    public int iDaño(TipoDanio tipo) {
        //si el tipo es magico nos devolvera lo siguente
        if (tipo == TipoDanio.MAGICO) {
            System.out.println("Ha utilizado un ataque magico: "+danioMagico);
            return danioMagico;
        } else if (tipo == TipoDanio.FISICO) {//si no
            System.out.println("Ha utilizado un ataque fisico: "+danioFisico);
            return danioFisico;
        } else {
            int nivelAtaque = (danioMagico + danioFisico) / 2;
            System.out.println("Has utilizado un ataque mixto causando un daño de :"+nivelAtaque);
            return nivelAtaque;
        }
    }

    @Override
    public int iCoste(TipoCoste tipo) {
        if (tipo == TipoCoste.MANA) {
            int restaMana = mana - danioMagico;
            System.out.println("Ha utilizado un mana de: " + danioMagico);
            System.out.println("Le queda un mana restante: " + restaMana);
            mana = restaMana;  // Actualizamos el mana
            return restaMana;
        } else if (tipo == TipoCoste.ESFUERZO_FISICO) {
            int cansacio = esfuerzoFisico - danioFisico;
            System.out.println("Ha utilizado un esfuerzo físico de: " + danioFisico);
            System.out.println("Le queda un esfuerzo físico restante: " + cansacio);
            esfuerzoFisico = cansacio;  // Actualizamos el esfuerzo físico
            return cansacio;  // Retornamos el valor de esfuerzo físico restante
        } else {
            // Si es un ataque mixto, sumamos ambos costes (mana y esfuerzo físico)
            int costeMixto = (danioMagico * 1) + (danioFisico * 1);  // Puedes cambiar el multiplicador si quieres ponderar más uno de los costes
            mana -= danioMagico;  // Restamos el mana utilizado
            esfuerzoFisico -= danioFisico;  // Restamos el esfuerzo físico utilizado
            System.out.println("Ha utilizado un esfuerzo físico y mana de: " + costeMixto);
            System.out.println("Le queda un mana restante: " + mana);
            System.out.println("Le queda un esfuerzo físico restante: " + esfuerzoFisico);
            return costeMixto;  // Retornamos el coste mixto
        }
    }
}
