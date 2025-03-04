package behavior_patterns.observer.example3;
/**
 * Actions to obsver
 * */
public interface TokenSubject {
    void addObserver(TokenObserver observer);
    void removeObserver(TokenObserver observer);
    void notifyObservers(String token);
}
