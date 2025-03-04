package behavior_patterns.observer.example2;

public class Main {
    public static void main(String[] args) {
        WheaterStation station = new WheaterStation();
        WheaterObserver app1 = new AppMovile("JhonyApp");
        WheaterObserver app2 = new AppMovile("DevApp");

        WheaterObserver ledScreen = new LedScreen();

        station.registerObserver(app1);
        station.registerObserver(app2);
        station.registerObserver(ledScreen);

        //Update climate
        station.setClimate(45.6);
        station.setClimate(22.0);

        //Remove observer
        station.registerObserver(app2);

        // Return change
        station.setClimate(20.0);

    }
}
