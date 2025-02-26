package Tema4_POO_INTRODUCCION.Tema3.EJ8_Ataque_Avanzado;

public class AtaqueEspadazo implements AtaqueAvanzado {
    private int mana=20;
    private int esfuerzoFisico =50;
    private int danioMagico=0;
    private int danioFisico=100;



    public AtaqueEspadazo(int mana, int esfuerzoFisico, int danioMagico, int danioFisico) {
        this.mana = mana;
        this.esfuerzoFisico = esfuerzoFisico;
        this.danioMagico = danioMagico;
        this.danioFisico = danioFisico;
    }

    @Override
    public void iLanzarAtaque() {
        System.out.println("Le han dado un espadazo");
    }
    //llamas al enun para determinar el tipo de daño
    @Override
    public int iDaño(TipoDanio tipo) {
        //si el tipo es magico nos devolvera lo siguente
        if (tipo == TipoDanio.MAGICO){
            System.out.println("Ha utilizado un ataque magico");
            return danioMagico;
        }else {//si no
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
