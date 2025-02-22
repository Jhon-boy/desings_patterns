package structural_patterns.decorator_pattern;

import structural_patterns.decorator_pattern.example1.*;
import structural_patterns.decorator_pattern.example2.BasicNotification;
import structural_patterns.decorator_pattern.example2.Notification;
import structural_patterns.decorator_pattern.example2.NotificationEmail;
import structural_patterns.decorator_pattern.example2.NotificationPush;

public class TestMain {
    public static void main(String[] args) {
        // Example 1: Decorator Pattern with Encryption, Compression, and File IO
        System.out.println("\n ************ EXAMPLE 1 ****************\n");
        /*String salaryRecords = "Name,Salary\nJOHN WITES,1000\nSTEVE JOBS,9202154";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/testMain.txt")
                )
        );

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/testMain.txt");
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());*/

        //Example 2: Notification
        System.out.println("\n ************ EXAMPLE 2 ****************\n");
        Notification notification = new BasicNotification();
        notification = new NotificationEmail(notification);
        notification = new NotificationPush(notification);
        notification.send("SENDIN MESSAGE");

    }
}
