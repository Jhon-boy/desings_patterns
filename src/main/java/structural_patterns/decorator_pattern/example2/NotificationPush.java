package structural_patterns.decorator_pattern.example2;

public class NotificationPush extends  NotificationDecorator{

     public  NotificationPush(Notification notification){
         super(notification);
     }

     @Override
    public  void send(String message){
         super.send(message);
         System.out.println("NOTIFICATION PUSH: " + message);
     }
}
