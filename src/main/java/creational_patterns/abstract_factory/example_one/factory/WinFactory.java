package creational_patterns.abstract_factory.example_one.factory;

import creational_patterns.abstract_factory.example_one.buttons.WinButtom;
import creational_patterns.abstract_factory.example_one.interfaces.Buttom;
import creational_patterns.abstract_factory.example_one.interfaces.CheckBok;
import creational_patterns.abstract_factory.example_one.Checkbox.WinCheckBox;
import creational_patterns.abstract_factory.example_one.interfaces.GUIFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class WinFactory implements GUIFactory {

    @Override
    public CheckBok createCheckBok() {
        return new WinCheckBox();
    }

    @Override
    public Buttom createButtom() {
        return new WinButtom();
    }
}
