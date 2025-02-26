package Tema4_POO_INTRODUCCION.Tema3.EJ6_PublicacionReaccion;

public class Reaccion implements PubliccacionReaccione{
    private String tipoReaccion;
    private String comentarios;
    private String compartir;

    public Reaccion(String tipoReaccion, String comentarios, String compartir) {
        this.tipoReaccion = tipoReaccion;
        this.comentarios = comentarios;
        this.compartir = compartir;
    }

    @Override
    public void iReacciona() {
        System.out.println("Has reaccionado con un: "+tipoReaccion);
    }

    @Override
    public void iCometar() {
        System.out.println("su comentario: "+comentarios);
    }

    @Override
    public void iCompartir() {
        System.out.println("se ha compartido: "+compartir);
    }
}
