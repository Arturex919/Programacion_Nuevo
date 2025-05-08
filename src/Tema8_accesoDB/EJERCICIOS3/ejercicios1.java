package Tema8_accesoDB.EJERCICIOS3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ejercicios1 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con=conexionPilotosdb.conexion();
        String consulta = "SELECT forename,surname FROM drivers";

        // el Statement es para que envie la consulta a la base de datos
        Statement mensajero = con.createStatement();

        // Ejecuta y guarda la consulta
        ResultSet result = mensajero.executeQuery(consulta);

        // Recorrer los resultados
        while (result.next()) {
            //obitiene el resultado en forma de string
            String nombre = result.getString("forename");
            String apellido = result.getString("surname");

            System.out.println("Profesores: " + nombre + " " + apellido);
    }
}
}
