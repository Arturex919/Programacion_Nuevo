package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio6 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado = DBconexion.conexion();

        if (conectado!=null) {
            String consulta = """
                    SELECT DISTINCT anyo_curso AS cursos FROM estudiante ORDER BY cursos ;
                                      """;
            Statement mensajero = conectado.createStatement();
            ResultSet result = mensajero.executeQuery(consulta);
            while (result.next()) {
                String year = result.getString("cursos");

                System.out.println("Año - "+year);
            }
        }
    }
}