import java.io.*;

class FileExporter {
    Object lock = new Object();

    public void export(Object obj, String file){
        synchronized(lock){
            try(ObjectOutputStream o =
                new ObjectOutputStream(new FileOutputStream(file))){
                o.writeObject(obj);
                System.out.println("Saved in "+file);
            } catch(Exception e){}
        }
    }
}

public class ExportTest {
    public static void main(String[] args) {
        FileExporter f1 = new FileExporter();
        FileExporter f2 = new FileExporter();

        new Thread(() -> f1.export("A","a.ser")).start();
        new Thread(() -> f2.export("B","b.ser")).start();
    }
}
