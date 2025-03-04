package behavior_patterns.observer.example3;

public class RequestHttp implements  TokenObserver{

    @Override
    public void refreshToken(String token) {
        System.out.println("REFRESH TOKEN: " + token);
    }
}
