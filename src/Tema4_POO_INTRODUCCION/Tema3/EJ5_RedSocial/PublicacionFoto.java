package Tema4_POO_INTRODUCCION.Tema3.EJ5_RedSocial;

public class PublicacionFoto implements Publicacion, AbrirPublicaion {
    private String imagen;

    public PublicacionFoto(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public void iPublicar() {
        System.out.println("La foto fue publicada con exito "+imagen);
    }

    @Override
    public void iCompartir() {
        System.out.println("Compariendo foto "+imagen);
    }

    @Override
    public void iAbrir() {
        System.out.println("abriendo Foto......"+"\n"+imagen+"\n"+"Se abrio con exito");
    }
}
