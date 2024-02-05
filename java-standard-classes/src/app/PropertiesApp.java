package app;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    //properties class @ class yg bisa gunakan untuk mengambil atau menyimpan informasi ke file properties.
    public static void main(String[] args) {
        //membuat secara manual file properties
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host"); //mengakses file nya.
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception){ //jika terjadi file tidak ketemu
            System.out.println("File Tidak Ditemukan");
        } catch (IOException exception){ //jika gagal ng-load
            System.out.println("Gagal load dari data file");
        }

        //Membuat langsung file properties, tanpa manual.
        //Langsung dibuatkan file propertis secara langsung tanpa manual.
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Dani"); //membuat isi file nya.
            properties.put("name.middle", "Imdadur"); //membuat isi file nya.
            properties.put("name.last", "Rohman"); //membuat isi file nya.

            String firtsName = properties.getProperty("name.first");
            String middleName = properties.getProperty("name.middle");
            String lastName = properties.getProperty("name.last");

            System.out.println(firtsName);
            System.out.println(middleName);
            System.out.println(lastName);

            properties.store(new FileOutputStream("name.properties"),"membuat file name.properties"); //membuat file properties
        }catch (FileNotFoundException exception){
            System.out.println("Error membuat file properties");
        }catch (IOException exception){
            System.out.println("Error menyimpan properties");
        }
    }
}
