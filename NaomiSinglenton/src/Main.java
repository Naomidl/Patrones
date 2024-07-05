public class Main {
    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();

        System.out.println("Esta es la URL de mi servidor: "+config.getServidor());
        System.out.println("El puerto de mi servidor: "+config.getPort());
        System.out.println("La ip de mi servidor: "+config.getIp());
        System.out.println("Mac del servidor: "+config.getMac());


        config.setServidor("https://naomideleon.com/");
        config.setPort(3302);
        config.setIp("192.168.56.1");
        config.setMac("16-6A-6A-1A-9C-49");


    }
}

