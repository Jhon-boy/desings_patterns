package structural_patterns.decorator_pattern.example2;

public class NotificationEmail extends  NotificationDecorator {

    public NotificationEmail(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending email notification: " + message);
    }
}
