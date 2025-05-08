package Tema8_accesoDB.EJERCICIOS3;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class conexionPilotosdb {
    public  static Connection conexion() throws IOException, SQLException {
        Connection conectado=null;
        Properties propietario=new Properties();//nos ayuda a cargar las credenciales
        FileInputStream inputDB=new FileInputStream("src/Temas8_accesoDB/EJERCICIOS3/pilotosdb.properties");
        propietario.load(inputDB);
        //solo va a tomar la url,el user y la contraseña no es neceario poner toda la direccion completa
        String url = propietario.getProperty("db.url");
        String user = propietario.getProperty("db.user");
        String password = propietario.getProperty("db.password");
        //DriverManager establece la conexion con la BD
        try {
            conectado = DriverManager.getConnection(url, user, password);
            System.out.println("conectado");
        }catch (Exception e){
            System.out.println("error de conexion");
        }
        return conectado;
    }
}
