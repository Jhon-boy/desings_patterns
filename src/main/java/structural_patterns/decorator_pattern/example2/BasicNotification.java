package structural_patterns.decorator_pattern.example2;

public class BasicNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Basic notification sent" + message);
    }
}
