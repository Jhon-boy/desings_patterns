package creational_patterns.singleton_pattern;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * In this class let read const values of disk, Don´t use for read other values
 * */
public class LoadDatosConfigSingleton {

    private static String  pathDisk = "Z:/servicios_recaudacion/sr_parametros.properties";
    //Build the instance
    private static LoadDatosConfigSingleton instance;
    private Properties properties;

    //Private constructor to no let external initialization
    private LoadDatosConfigSingleton() {
        properties = new Properties();
        loadConfiguration();

    }

    //Instance to get Data
    public  static LoadDatosConfigSingleton getInstance(){
        if(instance == null){
            instance = new LoadDatosConfigSingleton();
            System.out.println("Instance already initialicing");
        }
        return instance;
    }

    //Read Data from Disk
    private void loadConfiguration(){

        try (InputStream input = new FileInputStream(pathDisk) ) {
                properties.load((input));
                System.out.println("There are no propierties to read");
                System.out.println("✅ Configuración cargada desde: " + pathDisk);
        }catch (Exception e){
            System.out.println("Error loading properties: " + e.getMessage());
        }
    }

    //Show all propierties in the system
    public void showPropierties(){
        System.out.println("***************************\n*************************** \n********* VALORES *********");
        properties.forEach((clave, valor) -> System.out.println("CLAVE: " + clave + " VALOR -->" + valor));
        System.out.println("***************\n**************");
    }
    //Get an specific Property
    public String getProperty(String clave) {
        String valor = properties.getProperty(clave);
        if(valor == null){
            System.out.println("⚠ Propierties not found (" + clave + ")");
            return  null;
        }
        String valueAux = System.getenv().get(clave);

        return  valueAux !=null ? valueAux: valor;
    }
}
