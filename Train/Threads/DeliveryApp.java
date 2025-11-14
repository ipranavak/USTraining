class StatusThread extends Thread {
    public void run() {
        try {
            for(int i=1;i<=3;i++){
                System.out.println("Status: Order is on the way...");
                Thread.sleep(5000);
            }
        } catch(Exception e){}
    }
}

class TimeThread extends Thread {
    public void run() {
        try {
            for(int i=1;i<=3;i++){
                System.out.println("ETA: 15 mins");
                Thread.sleep(5000);
            }
        } catch(Exception e){}
    }
}

public class DeliveryApp {
    public static void main(String[] args) {
        new StatusThread().start();
        new TimeThread().start();
    }
}
