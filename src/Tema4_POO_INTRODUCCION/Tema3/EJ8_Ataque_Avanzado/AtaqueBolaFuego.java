package Tema4_POO_INTRODUCCION.Tema3.EJ8_Ataque_Avanzado;

public class AtaqueBolaFuego implements AtaqueAvanzado {
    private int mana = 50;
    private int esfuerzoFisico = 0;
    private int danioFisico = 0;
    private int danioMagico = 100;



    public AtaqueBolaFuego(int mana, int esfuerzoFisico, int danioFisico, int danioMagico) {
        this.mana = mana;
        this.esfuerzoFisico = esfuerzoFisico;
        this.danioFisico = danioFisico;
        this.danioMagico = danioMagico;
    }

    @Override
    public void iLanzarAtaque() {
        System.out.println("ha lanzado una bola de fuego");
    }

    @Override
    public int iDaño(TipoDanio tipo) {
        //si el tipo es magico nos devolvera lo siguente
        if (tipo == TipoDanio.MAGICO) {
            System.out.println("Ha utilizado un ataque magico");
            return danioMagico;
        } else {//si no
            System.out.println("Ha utilizado un ataque fisico");
            return danioFisico;
        }
    }


    @Override
    public int iCoste(TipoCoste tipo) {
        if (tipo == TipoCoste.MANA) {
            int restaMana = mana - danioMagico;
        System.out.println("Ha utilizado un mana de: " + danioMagico);
        System.out.println("Le queda un mana restante: " + restaMana);
        mana = restaMana;  // Actualizamos el mana
        return restaMana;  // Retornamos el valor de mana restante
    } else{
        // Actualizamos el esfuerzo físico después de restar el daño físico
        int cansacio = esfuerzoFisico - danioFisico;
        System.out.println("Ha utilizado un esfuerzo físico de: " + danioFisico);
        System.out.println("Le queda un esfuerzo físico restante: " + cansacio);
        esfuerzoFisico = cansacio;  // Actualizamos el esfuerzo físico
        return cansacio;  // Retornamos el valor de esfuerzo físico restante
    }
}
}


