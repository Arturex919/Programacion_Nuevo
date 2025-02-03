package POO_INTRODUCCION.EJ1_Reloj;

public class Reloj {
    private int hora;
    private int min;
    private int seg;
    boolean formato;

    // Constructor vacío
    public Reloj() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
        this.formato = true;
    }

    public Reloj(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        this.formato = true;
    }

    //getters
    public int getHora() {
        return hora;
    }

    public boolean isFormato() {
        return formato;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }
    //setters

    public void setHora(int hora) {
        if (hora >= 00 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora invalida inserta una hora ente 0 y 23");
        }
    }

    public void setMin(int min) {
        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            System.out.println("Minuto inválido. Debe estar entre 0 y 59.");
        }
    }

    public void setSeg(int seg) {
        if (seg >= 0 && seg < 60) {
            this.seg = seg;
        } else {
            System.out.println("Segundos inválido. Debe estar entre 0 y 59.");
        }
    }

    public void setFormato(boolean formato) {

        this.formato = formato;
    }
    public void mostrarHora() {
        if (formato) { // Formato 12 horas
            String amPm = (hora < 12) ? "AM" : "PM";
            int hora12 = (hora % 12 == 0) ? 12 : hora % 12;
            System.out.printf("La hora es: %02d:%02d:%02d %s%n", hora12, min, seg, amPm);
        } else { // Formato 24 horas
            System.out.printf("La hora es: %02d:%02d:%02d%n", hora, min, seg);
        }
    }
    public String toString() {
        if (formato) { // Formato 12 horas
            String amPm = (hora < 12) ? "AM" : "PM";
            int hora12 = (hora % 12 == 0) ? 12 : hora % 12;
            return String.format("La hora es: %02d:%02d:%02d %s", hora12, min, seg, amPm);
        } else {
            return String.format("La hora es: %02d:%02d:%02d", hora, min, seg);
        }
    }
}









