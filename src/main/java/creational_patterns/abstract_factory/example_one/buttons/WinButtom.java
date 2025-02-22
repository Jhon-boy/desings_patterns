package creational_patterns.abstract_factory.example_one.buttons;

import creational_patterns.abstract_factory.example_one.interfaces.Buttom;

public class WinButtom implements Buttom {
    @Override
    public void Onclick() {
        System.out.println("Printing....On WinOS");
    }
}
