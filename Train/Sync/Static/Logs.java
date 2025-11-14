import java.io.*;

class LogWriter {
    public static synchronized void writeLog(String msg){
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream("log.ser", true))){
            o.writeObject(msg);
            System.out.println("Logged: "+msg);
        } catch(Exception e){}
    }
}

public class Logs {
    public static void main(String[] args) {
        new Thread(() -> LogWriter.writeLog("Start")).start();
        new Thread(() -> LogWriter.writeLog("Running")).start();
    }
}
