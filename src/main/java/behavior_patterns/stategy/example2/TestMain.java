package behavior_patterns.stategy.example2;

public class TestMain {
    private static final   String MESSAGE = "NOTIFICATION MESSAGE FROM JHONY DEV";
    public static void main(String[] args) {

        NotificationContext notificationContext = new NotificationContext();
        System.out.println("NOTIFICATION");
        notificationContext.setStrategy(new NotificationPush("0659895545"));
        notificationContext.executeNotification(MESSAGE);

        notificationContext.setStrategy(new NotificationEmail("jhonnydev@gmail.com"));
        notificationContext.executeNotification(MESSAGE);
    }
}
