package creational_patterns.abstract_factory.example_one;

import creational_patterns.abstract_factory.example_one.interfaces.Buttom;
import creational_patterns.abstract_factory.example_one.interfaces.CheckBok;
import creational_patterns.abstract_factory.example_one.interfaces.GUIFactory;

public class Application {
    private Buttom buttom;
    private CheckBok checkBok;

    public  Application (GUIFactory guiFactory){
        this.buttom = guiFactory.createButtom();
        this.checkBok = guiFactory.createCheckBok();
    }

    public  void paint(){
        buttom.Onclick();
        checkBok.Check();
    }
}
