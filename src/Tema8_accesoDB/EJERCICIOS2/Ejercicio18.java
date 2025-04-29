package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio18 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado= DBconexion.conexion();
        String consulta = """
        SELECT c.nombre AS casa,AVG(ea.calificacion) AS promedio FROM casa c 
        JOIN estudiante e ON e.id_casa = c.id_casa
        JOIN Estudiante_Asignatura ea ON ea.id_estudiante = e.id_estudiante
        GROUP BY c.nombre 
        HAVING AVG(ea.calificacion)> 7
                                      """;

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta);
        while (result.next()) {
            String casa = result.getString("casa");
            double promedio = result.getDouble("promedio");

            System.out.println("Casa: " + casa + " - Promedio de calificación: " + promedio);
        }}
}
