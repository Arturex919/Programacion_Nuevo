package Tema4_POO_INTRODUCCION.Tema3.EJ8_Ataque_Avanzado;

public interface AtaqueAvanzado {
    //metodo normal de la interfaz
    void iLanzarAtaque();
    //llamas al metodo del enum para saber que tipo es
    //magico o fisico
    int iDaño(TipoDanio tipo);
    //mana y esfuerzo fisico
    int iCoste(TipoCoste tipo);
}
