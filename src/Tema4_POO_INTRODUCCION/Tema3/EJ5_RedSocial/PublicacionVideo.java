package Tema4_POO_INTRODUCCION.Tema3.EJ5_RedSocial;

public class PublicacionVideo implements Publicacion, AbrirPublicaion {
    private String video;

    public PublicacionVideo(String video) {
        this.video = video;
    }

    @Override
    public void iPublicar() {
        System.out.println("Videos Publicado");
    }

    @Override
    public void iCompartir() {
        System.out.println("estas comaprtiendo el video");
    }

    @Override
    public void iAbrir() {
        System.out.println("abriendo publicacion"+"\n"+video +"\n"+"el video se abrio correctamente ");

    }
}

