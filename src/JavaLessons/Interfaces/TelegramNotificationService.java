package Interfaces;

public class TelegramNotificationService implements NotificationService {
    @Override
    public void send(String userContact) {
        System.out.println("Telegram");
    }
}
