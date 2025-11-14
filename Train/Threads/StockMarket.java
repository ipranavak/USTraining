class Stock extends Thread {
    String name;
    public Stock(String name){ this.name = name; }

    public void run() {
        try {
            for(int i=0;i<5;i++){
                int price = (int)(Math.random()*1000);
                System.out.println(name + ": " + price);
                Thread.sleep(2000);
            }
        } catch (Exception e){}
    }
}

public class StockMarket {
    public static void main(String[] args) {
        new Stock("TATA").start();
        new Stock("INFY").start();
    }
}
