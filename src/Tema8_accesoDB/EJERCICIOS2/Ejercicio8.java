package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio8 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado = DBconexion.conexion();

        if (conectado!=null) {
            String consulta = """
                    SELECT nombre, apellido,anyo_curso FROM estudiante WHERE anyo_curso IN(4,5) ORDER BY anyo_curso;
                                      """;
            Statement mensajero = conectado.createStatement();
            ResultSet result = mensajero.executeQuery(consulta);
            while (result.next()) {
                String nombre = result.getString("nombre");
                String apellido=result.getString("apellido");
                String year= result.getString("anyo_curso");
                System.out.println("Estudiante: "+ nombre +" "+apellido +" -"+" Curso: "+year );
            }
        }
    }
}
