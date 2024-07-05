package implement;

public class UrgNotificationFac implements NotificationFac {
    @Override
    public EmailNotification crearEmailNotificacion() {
        System.out.println("ES URGENTE");
        return new EmailNotification(){
            @Override
            public void enviarMensaje(String mensaje) {
                System.out.println("Enviando email urgente con el contenido: '"+mensaje+"'");
            }
        };
    }

    @Override
    public SMNotification crearSMSNotificacion() {
        System.out.println("ES URGENTE DEBE DE SER ATENDIDO");
        return new SMNotification(){
            @Override
            public void enviarMensaje(String mensaje) {
                System.out.println("Enviando mensajes por medio de SMS: '"+mensaje+"'");
            }
        };
    }



}
