package structural_patterns.decorator_pattern.example2;

public class NotificationDecorator implements  Notification{
    protected Notification notification;

    public  NotificationDecorator(Notification notification){
        this.notification = notification;
    }

    @Override
    public void send(String message) {
         notification.send(message);
    }
}
