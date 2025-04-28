package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {
    public static void main(String[] args) throws SQLException, IOException  {

            Connection coneccion = DBconexion.conexion();
            if (coneccion != null) {

                String consulta = "SELECT nombre,apellido,fecha_nacimiento FROM estudiante WHERE fecha_nacimiento >'1980-01-01'";

                Statement mensajero = coneccion.createStatement();

                //no te olvides colocar el executeQuery
                ResultSet result = mensajero.executeQuery(consulta);
                while (result.next()) {
                    String nombres = result.getString("nombre");
                    String apellido = result.getString("apellido");
                    String fecha_nacimiento=result.getString("fecha_nacimiento");
                    System.out.println("Estudiantes:"+nombres + " " + apellido + " - "+fecha_nacimiento );
                }
            }



    }
}
