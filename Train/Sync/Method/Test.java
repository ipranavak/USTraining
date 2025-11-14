import java.io.*;

class Patient implements Serializable {
    String name; int age;
    public Patient(String n,int a){ name=n; age=a; }
}

class PatientSerializer {
    public synchronized void savePatient(Patient p) {
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream("patients.ser", true))){
            o.writeObject(p);
            System.out.println("Saved: " + p.name);
        } catch(Exception e){}
    }
}

public class Test {
    public static void main(String[] args) {
        PatientSerializer ps = new PatientSerializer();

        new Thread(() -> ps.savePatient(new Patient("AK", 22))).start();
        new Thread(() -> ps.savePatient(new Patient("Ram", 30))).start();
    }
}
