package Tema8_accesoDB.EJERCICIOS2;
/*psql -h ad-postgres.cu6a0b4p2sni.us-east-1.rds.amazonaws.com -U postgres -d hogwarts
 */
import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio5 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado = DBconexion.conexion();

        if (conectado!=null) {
            String consulta = """
                    SELECT AVG(calificacion) AS media, MAX(calificacion) AS maxima
                                        FROM Estudiante_Asignatura ea
                                        JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura
                                        WHERE a.nombre = 'Pociones'
                                        """;
            Statement mensajero = conectado.createStatement();
            ResultSet result = mensajero.executeQuery(consulta);
            while (result.next()) {
                String media = result.getString("media");
                String notaMaxima = result.getString("maxima");
                System.out.println("Nota Media: "+media + " Nota Maxima: " + notaMaxima);
            }
        }
    }
}
