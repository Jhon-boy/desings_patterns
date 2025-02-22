package creational_patterns.abstract_factory.example_one.buttons;

import creational_patterns.abstract_factory.example_one.interfaces.Buttom;
/*
* All families objects have the same varieties
* */
public class MacOSButton implements Buttom {

    @Override
    public void Onclick() {
        System.out.println("Printing.... ON MacOS");
    }
}
