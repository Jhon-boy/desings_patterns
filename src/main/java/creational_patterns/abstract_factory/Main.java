package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.example_one.Application;
import creational_patterns.abstract_factory.example_one.factory.MacOsFactory;
import creational_patterns.abstract_factory.example_one.factory.WinFactory;
import creational_patterns.abstract_factory.example_one.interfaces.GUIFactory;

public class Main {

    private static Application configAplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacOsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
       Application  app = configAplication();
       app.paint();
    }
}