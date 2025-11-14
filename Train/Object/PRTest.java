import java.io.*;

class PatientReport implements Serializable {
    String details;
    public PatientReport(String d){ details=d; }
}

class ReportExporter {

    public void exportReport(PatientReport r) {
        synchronized(r){
            try(ObjectOutputStream o =
                new ObjectOutputStream(new FileOutputStream(r.details+".ser"))){
                o.writeObject(r);
                System.out.println("Saved: "+r.details);
            } catch(Exception e){}
        }
    }
}

public class PRTest {
    public static void main(String[] args) {
        PatientReport r1 = new PatientReport("Report1");
        PatientReport r2 = new PatientReport("Report2");

        ReportExporter re = new ReportExporter();

        new Thread(() -> re.exportReport(r1)).start();
        new Thread(() -> re.exportReport(r2)).start();
    }
}
