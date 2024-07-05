package implement;

public class RegularNotificationFac implements NotificationFac{
    @Override
    public EmailNotification crearEmailNotificacion() {
        System.out.println("Regular");
        return new EmailNotification();
    }

    @Override
    public SMNotification crearSMSNotificacion() {
        System.out.println("Regular");
        return new SMNotification();
    }


}
