class DownloadChunk extends Thread {
    String file;
    public DownloadChunk(String f){ file=f; }

    public void run() {
        try {
            System.out.println(file + " downloading...");
            Thread.sleep(2000);
            System.out.println(file + " done");
        } catch(Exception e){}
    }
}

public class DownloadManager {
    public static void main(String[] args) throws Exception {
        Thread t1 = new DownloadChunk("Part1");
        Thread t2 = new DownloadChunk("Part2");
        Thread t3 = new DownloadChunk("Part3");

        t1.start(); t2.start(); t3.start();

        t1.join(); t2.join(); t3.join();

        System.out.println("Download complete");
    }
}
