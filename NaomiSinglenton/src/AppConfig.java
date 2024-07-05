public class AppConfig {
    private static AppConfig instance;
    private String servidor;
    private int port;
    private String ip;
    private String mac;

    private AppConfig(){
        this.servidor = "https://naomideleon.com/";
        this.port = 8080;
        this.ip="192.168.56.1";
        this.mac=" 16-6A-6A-1A-9C-49";
    }

    public static synchronized  AppConfig getInstance(){
        if (instance == null){
            instance=new AppConfig();
        }
        return instance;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
