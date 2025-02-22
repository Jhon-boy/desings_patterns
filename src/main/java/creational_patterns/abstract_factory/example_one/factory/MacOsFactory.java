package creational_patterns.abstract_factory.example_one.factory;

import creational_patterns.abstract_factory.example_one.buttons.MacOSButton;
import creational_patterns.abstract_factory.example_one.interfaces.Buttom;
import creational_patterns.abstract_factory.example_one.interfaces.CheckBok;
import creational_patterns.abstract_factory.example_one.Checkbox.MacOsCheckBox;
import creational_patterns.abstract_factory.example_one.interfaces.GUIFactory;

/*
* Each concrete factory extends basic factory and responsabilities creating
* products of single variety
* */

public class MacOsFactory  implements GUIFactory {

    @Override
    public Buttom createButtom() {
        return new MacOSButton();
    }

    @Override
    public CheckBok createCheckBok() {
        return new MacOsCheckBox();
    }
}
