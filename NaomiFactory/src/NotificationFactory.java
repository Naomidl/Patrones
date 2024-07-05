import exception.MessageException;
import implement.AppNotification;
import implement.EmailNotification;
import implement.Notification;
import implement.SMNotification;


public class NotificationFactory {
    public static Notification crearNotificacion(String tipo) throws MessageException{
        switch (tipo){
            case "Email":
                return new EmailNotification();

            case "SMS":
                return new AppNotification();

            case "App":
                return new SMNotification();

            default:
                throw new MessageException("El mensaje "+tipo+" no puedo ser localizado");
        }
    }
}
