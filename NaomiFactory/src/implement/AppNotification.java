package implement;

public class AppNotification implements Notification {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificación con el contenido: '"+mensaje+"'");
    }
}
