package behavior_patterns.observer.example3;

import java.util.ArrayList;
import java.util.List;

public class ServerApi implements TokenSubject{

    List<TokenObserver> observers = new ArrayList<>();
    private String token = "dfgdghdhfsdfs";

    @Override
    public void addObserver(TokenObserver observer) {
    observers.add(observer);
    }

    @Override
    public void removeObserver(TokenObserver observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObservers(String token) {
        for (TokenObserver observer : observers) {
            System.out.println("Actualizando token.....");
            observer.refreshToken(token);
        }
    }

    public void setToken(String token) {
        this.token = token;
        notifyObservers(token);
    }

}
