import java.io.*;

class Doctor implements Serializable {
    String name;
    public Doctor(String n){ name=n; }

    public synchronized void serializeDoctor(){
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream(name+".ser"))){
            o.writeObject(this);
            System.out.println("Saved doctor: "+name);
        } catch(Exception e){}
    }
}

public class DocTest {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("A");
        Doctor d2 = new Doctor("B");

        new Thread(d1::serializeDoctor).start();
        new Thread(d2::serializeDoctor).start();
    }
}
