package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio4 {
    public static void main(String[] args) throws SQLException, IOException {

        Connection conectado = DBconexion.conexion();

        if (conectado!=null){
            String consulta="SELECT COUNT(*) AS numero_Estudiantes,c.nombre AS casa FROM estudiante e JOIN casa c ON e.id_casa=c.id_casa GROUP BY c.nombre";
            Statement mensajero=conectado.createStatement();
            ResultSet result= mensajero.executeQuery(consulta);
            while (result.next()){
                String numero_Estudiantes = result.getString("numero_Estudiantes");
                String casa= result.getString("casa");
                System.out.println(casa +" : "+numero_Estudiantes );
            }
        }
    }
}

