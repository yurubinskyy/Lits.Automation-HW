package Interfaces;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new TelegramNotificationService();
        notificationService.send("asd");


    }
}
