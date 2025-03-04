package behavior_patterns.observer.example3;

public class RequestWebSocket implements  TokenObserver{

    @Override
    public void refreshToken(String token) {
        System.out.println("REFERESH TOKEN ON WEB SOCKET" + token);
    }
}
