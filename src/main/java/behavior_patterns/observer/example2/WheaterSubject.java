package behavior_patterns.observer.example2;

public interface WheaterSubject {
    void registerObserver(WheaterObserver observer);
    void removeObserver(WheaterObserver observer);
    void notifyObservers();
}
