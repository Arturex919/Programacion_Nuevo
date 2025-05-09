package Tema8_accesoDB.EJERCICIOS3;

import java.time.LocalDate;
import java.util.Date;

public class pilotos {
    String code;
    String forename;
    String surname;
    LocalDate fecha;
    String nationality;
    int constructorId;
    String url;

    public pilotos(String url, int constructorId, String nationality,
                   LocalDate fecha, String surname, String forename, String code) {
        this.url = url;
        this.constructorId = constructorId;
        this.nationality = nationality;
        this.fecha = fecha;
        this.surname = surname;
        this.forename = forename;
        this.code = code;
    }

    //getter
    public String getCode() {
        return code;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNationality() {
        return nationality;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public String getUrl() {
        return url;
    }
//setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
