class Notification {

    public void sendNotification() {
        System.out.println("General Notification");
    }
}

class EmailNotification extends Notification {

    public void sendNotification() {
        System.out.println("Email Notification");
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification n1 = new Notification();
        n1.sendNotification();

        EmailNotification n2 = new EmailNotification();
        n2.sendNotification();
    }
}