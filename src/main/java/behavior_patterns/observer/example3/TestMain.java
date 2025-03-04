package behavior_patterns.observer.example3;

public class TestMain {
    public static void main(String[] args) {

        ServerApi server = new ServerApi();
        TokenObserver token1 = new RequestHttp();
        TokenObserver token2 = new RequestWebSocket();

        server.addObserver(token1);
        server.addObserver(token2);
        server.notifyObservers("klsdmskgmdklnwlkenjtnhjnms dfsmf");
        System.out.println("******** TIME IS OVER *********");

        server.setToken("kdksdjjasjadlakfmafa new value");

    }
}
