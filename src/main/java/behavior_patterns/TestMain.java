package behavior_patterns;

import behavior_patterns.observer.example1.Observer;
import behavior_patterns.observer.example1.Suscriptor;
import behavior_patterns.observer.example1.YouTobeChanel;

public class TestMain {
    public static void main(String[] args) {
        YouTobeChanel chanels = new YouTobeChanel();

        Observer use1 = new Suscriptor("Jhony");
        Observer use2 = new Suscriptor("Mary");
        Observer use3 = new Suscriptor("DEV");

        chanels.addObserver(use1);
        chanels.addObserver(use2);
        chanels.addObserver(use3);

        chanels.uploadVideo("Patron JAVA observer");
        chanels.deleteObserver(use2);
        chanels.uploadVideo("Patron JAVA observer 2");

    }

}
