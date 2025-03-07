package Tema_7_Ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ClaseFiles {

    public static void main(String[] args) {

        //CLASE FILES

        //COPY
        /// copias el archivo de datosAna al nuevo archivo
        File from = new File("datosAna.txt");
        File to = new File("dest.txt");

        try {
            //files.copy es el que va a copiar los ficheros y si existe este lo va a reemplanza
            //por el  StandardCopyOption.REPLACE_EXISTING
            Files.copy(from.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        }
        catch (IOException ex) {
            ex.printStackTrace();//mensaje de error si salta el error
        }

        //MOVE
        try {
            //va  a mover los ficheros creados y en caso de existir lo va a reemplazar
            Files.move(from.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        //DELETE
        //creas un booleano para eliminar  y para comprobarlo
        //intentas eliminar el archivo nuevo
        boolean result = to.delete();
        if (result) {
            System.out.println("File is successfully deleted.");
        }
        else {
            System.out.println("File deletion failed.");
        }

        //CREATEFILE

        File fichero = new File("datosAna.txt");

        try {
            // A partir del objeto File creamos el fichero físicamente
            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else//porque ya existe
                System.out.println("No ha podido ser creado el fichero");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //CREATEDIRECTORY
        Path path = Paths.get("carpetaPrueba");
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            System.err.println("Error creating directory: " + e.getMessage());
        }

        //EXISTS
        String filePath = "/Users/anavicianofabregat/intelliJ-workspace/programacionSoluciones/datosAna.txt";
        File file = new File(filePath);
        //comprueba si el archivo existe y si no es un directorio
        if (file.exists() && !file.isDirectory()) {
            System.out.println("File exists!!");
        }
        else {
            System.out.println("File doesn't exist or program doesn't have access " +
                    "to the file");
        }

    }

}

