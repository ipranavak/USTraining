import java.io.*;

class HospitalStats implements Serializable {
    static int patientCount = 0;

    public static synchronized void saveStats(){
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream("stats.txt"))){
            o.writeObject(patientCount);
            System.out.println("Saved count: "+patientCount);
        } catch(Exception e){}
    }
}

public class StatsTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            HospitalStats.patientCount++;
            HospitalStats.saveStats();
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
