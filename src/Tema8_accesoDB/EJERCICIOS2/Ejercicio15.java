package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio15 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado = DBconexion.conexion();
        String consulta = """
                SELECT e.nombre,e.apellido,c.nombre AS casa FROM estudiante e 
                 JOIN casa c ON c.id_casa=e.id_casa
                """;

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta);
        while (result.next()) {
            String nombre = result.getString("nombre");
            String apellido = result.getString("apellido");
            String casa = result.getString("casa");
            System.out.println("Estudiante: " + nombre + " " + apellido + " - "  + "-" + " casa: " + casa);
        }
    }
}
