package behavior_patterns.stategy.example2;

public class NotificationPush implements NotificationStrategy {

    private String userId;

    public NotificationPush(String userId) {
        this.userId = userId;
    }

    @Override
    public void sendNotification(String message) {

        System.out.println("Notification Push to: " + userId + "\n Message: " + message);
    }
}
