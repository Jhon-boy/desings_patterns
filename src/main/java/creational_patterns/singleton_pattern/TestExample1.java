package creational_patterns.singleton_pattern;

public class TestExample1 {

    public  static void main(String [] args){

        LoadDatosConfigSingleton load_one = LoadDatosConfigSingleton.getInstance();
        load_one.showPropierties();
        LoadDatosConfigSingleton load_two = LoadDatosConfigSingleton.getInstance();
        String data = load_two.getProperty("url.zima.canales.cb");
        System.out.println("VALOR BUSCADO --->" + data);
    }
}
