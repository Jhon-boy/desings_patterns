package behavior_patterns.stategy.example2;

public class NotificationEmail implements  NotificationStrategy {
    private String mail;

    public NotificationEmail(String maill) {
        this.mail = maill;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification to: " + mail + "\n Message: " + message);
    }
}
