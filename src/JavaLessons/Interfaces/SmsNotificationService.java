package Interfaces;

public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String userContact) {
        System.out.println("SMS");
    }
}
