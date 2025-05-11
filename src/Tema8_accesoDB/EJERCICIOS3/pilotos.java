package Tema8_accesoDB.EJERCICIOS3;

import java.time.LocalDate;
import java.util.Date;

public class pilotos {
    private int driverid;
    private String code;
    private String forename;
    private String surname;
    private LocalDate fecha;
    private String nationality;
    private int constructorId;
    private String url;

    public pilotos() {
    }

    public pilotos(int driverid, String code, String forename, String surname,
                   LocalDate fecha, String nationality, int constructorId, String url) {
        this.driverid = driverid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.fecha = fecha;
        this.nationality = nationality;
        this.constructorId = constructorId;
        this.url = url;
    }

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


