package behavior_patterns.observer.example2;

public class LedScreen implements  WheaterObserver{


    @Override
    public void update(Double centigrade) {
        System.out.println("SCREEN LED get a new update: " + centigrade);
    }
}
