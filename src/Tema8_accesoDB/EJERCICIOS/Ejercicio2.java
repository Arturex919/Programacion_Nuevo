package Tema8_accesoDB.EJERCICIOS;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void mascotaPersona(String nombre,String apellido) throws SQLException, IOException {
        Connection coneccion= DBconexion.conexion();
        String sql= """
                SELECT m.nombre AS mascota FROM mascota m 
                JOIN estudiante e ON e.id_estudiante=m.id_estudiante
                WHERE e.nombre=? AND e.apellido=?
                """;
        try (PreparedStatement mensajero= coneccion.prepareStatement(sql)){
            mensajero.setString(1,nombre);
            mensajero.setString(2,apellido);
            ResultSet resultado= mensajero.executeQuery();
            while (resultado.next()){
                String mascota=resultado.getString("mascota");
                System.out.println("mascota: "+mascota);
            }
        }
    }

    public static void main(String[] args) throws SQLException, IOException {
        Scanner in=new Scanner(System.in);
        System.out.println("ingresa el nombre del estudiante");
        String nombre=in.nextLine();
        System.out.println("ingresa el apellido del estudiante");
        String apellido=in.nextLine();
        mascotaPersona(nombre,apellido);
    }
}
