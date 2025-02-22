package creational_patterns.abstract_factory.example_one.Checkbox;

import creational_patterns.abstract_factory.example_one.interfaces.CheckBok;

public class WinCheckBox implements CheckBok {

    @Override
    public void Check() {
        System.out.println("Win-based checkbox checked");
    }
}
