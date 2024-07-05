package implement;

public class SMNotification implements Notification{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje SMS con el contenido: '"+mensaje+"'");
    }
}
