package Tema8_accesoDB.EJERCICIOS;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void consultaCasa(String nombreCasa) throws SQLException, IOException {
        Connection conexion= DBconexion.conexion();
        String consulta= """
                SELECT e.nombre,e.apellido FROM estudiante e
                JOIN casa c ON c.id_casa=e.id_casa
                 WHERE c.nombre = ?""";
        //para consulta con parametros y mas segura usa esta
        try(PreparedStatement mensajero= conexion.prepareStatement(consulta)){
            mensajero.setString(1,nombreCasa);
            ResultSet result= mensajero.executeQuery();
            System.out.println("casa de los estudiantes: "+nombreCasa);
            while (result.next()){
                String nombre=result.getString("nombre");
                String apellido=result.getString("apellido");
                System.out.println(nombre+" "+ apellido);
            }
        }
    }
    public static void main(String[] args) throws SQLException, IOException {
        Scanner in=new Scanner(System.in);
        System.out.println("ingresa el nombre de la casa");
        String casa=in.nextLine();
        consultaCasa(casa);
    }
}
