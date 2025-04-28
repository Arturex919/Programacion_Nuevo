package Tema8_accesoDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconexion {
public  static Connection conexion() throws IOException, SQLException {
    Connection conectado=null;
    Properties propietario=new Properties();//nos ayuda a cargar las credenciales
    FileInputStream inputDB=new FileInputStream("src/Tema8_accesoDB/conexion");
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
