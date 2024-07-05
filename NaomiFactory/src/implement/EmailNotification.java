package implement;

public class EmailNotification implements Notification {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Ya enviamos un email con el contenido: '"+mensaje+"'");
    }
}
