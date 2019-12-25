package Interfaces;

public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String userContact) {
        System.out.println("Email");
    }
}
