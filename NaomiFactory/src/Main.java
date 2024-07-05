import exception.MessageException;
import implement.Notification;
import implement.NotificationFac;
import implement.RegularNotificationFac;
import implement.UrgNotificationFac;

public class Main {
    public static void main(String[] args) {
        try{

            Notification EmailNotify = NotificationFactory.crearNotificacion("Email");
            EmailNotify.enviarMensaje("Reunion agendada para el dia viernes");

            Notification SMSNotify = NotificationFactory.crearNotificacion("SMS");
            SMSNotify.enviarMensaje("Recordatorio de la reunion del viernes");

            Notification AppNotify = NotificationFactory.crearNotificacion("App");
            AppNotify.enviarMensaje("Posiblemente se haran cambios en la fecha de la reunion");

            System.out.println();

            Notification EmailUrgente = new UrgNotificationFac().crearEmailNotificacion();
            EmailUrgente.enviarMensaje("La reunion se reagendo para el dia martes");

            System.out.println();

            Notification RegularSMS = new RegularNotificationFac().crearSMSNotificacion();
            RegularSMS.enviarMensaje("Recordatorio del cambio en el dia de la reunion");

        }catch (MessageException e){
            System.out.println(e.getMessage());
        }

    }
}