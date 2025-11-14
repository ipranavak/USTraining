import java.io.*;

public class FileUpload {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");
            int data = fis.read();
            System.out.println("File Read");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO error");
        } catch (SecurityException e) {
            System.out.println("No permission");
        } finally {
            try { if (fis != null) fis.close(); } catch (Exception e) {}
        }
    }
}
