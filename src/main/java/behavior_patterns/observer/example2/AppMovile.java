package behavior_patterns.observer.example2;

public class AppMovile implements WheaterObserver {
    private String name;

    public AppMovile(String name) {
        this.name = name;
    }


    @Override
    public void update(Double centigrade) {
        System.out.println("App Movile: " + name + " get an updated:  " + centigrade);
    }
}
