package behavior_patterns.stategy.example2;

/**
 * Context to use stategy notification
 * **/
public class NotificationContext {

    private  NotificationStrategy strategy;

    public  void setStrategy(NotificationStrategy strategy){
        this.strategy = strategy;
    }

    public void executeNotification(String message){
        if(strategy == null){
            System.out.println("No notification strategy set");
        } else {
            strategy.sendNotification(message);
        }
    }

}
