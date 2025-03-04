package behavior_patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class WheaterStation  implements  WheaterSubject{

    private List<WheaterObserver> observers = new ArrayList<>();
    private  Double climate_actual = Double.valueOf(4.55);

    @Override
    public void registerObserver(WheaterObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WheaterObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WheaterObserver observerAux: observers)
            observerAux.update(climate_actual);
    }

    public  void setClimate(Double newValue){
        this.climate_actual = newValue;
        System.out.println(" Wheater Station Updated to:" + climate_actual);
        notifyObservers();
    }

}
