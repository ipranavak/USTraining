import java.io.*;

class ClinicConfig implements Serializable {
    static String name = "City Clinic";

    public static synchronized void saveConfig(){
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream("config.ser"))){
            o.writeObject(name);
            System.out.println("Config Saved");
        } catch(Exception e){}
    }
}

public class ConfigTest {
    public static void main(String[] args) {
        new Thread(ClinicConfig::saveConfig).start();
        new Thread(ClinicConfig::saveConfig).start();
    }
}
