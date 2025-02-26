package Tema4_POO_INTRODUCCION.Tema3.EJ5_RedSocial;

public class PublicacionTexto  implements Publicacion{
    private String text;

    public PublicacionTexto(String text) {
        this.text = text;
    }

    @Override
    public void iPublicar() {
        System.out.println("se ha publicado "+text);

    }

    @Override
    public void iCompartir() {
        System.out.println("se ha compartido "+text);
    }
    public String toString(){
        return "mensaje:"+text;
    }
}
