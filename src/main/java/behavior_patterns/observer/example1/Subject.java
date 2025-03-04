package behavior_patterns.observer.example1;

/**
 * Subjects with functions to obsver
 * */
public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(String message);
}
