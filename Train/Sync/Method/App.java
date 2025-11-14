import java.io.*;

class Appointment implements Serializable {
    String doctor, time;
    public Appointment(String d,String t){ doctor=d; time=t; }
}

class AppointmentSaver {
    public synchronized void saveAppointment(Appointment a){
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream("appt.ser", true))){
            o.writeObject(a);
            System.out.println("Saved: "+a.doctor);
        } catch(Exception e){}
    }
}

public class App {
    public static void main(String[] args) {
        AppointmentSaver as = new AppointmentSaver();
        new Thread(() -> as.saveAppointment(new Appointment("Dr A","10AM"))).start();
        new Thread(() -> as.saveAppointment(new Appointment("Dr B","11AM"))).start();
    }
}
