import java.io.*;

class Account implements Serializable {
    int accNo; double bal;
    public Account(int a,double b){ accNo=a; bal=b; }
}

class TransactionSaver {
    public synchronized void saveTransaction(Account a){
        try(ObjectOutputStream o =
            new ObjectOutputStream(new FileOutputStream("txn.ser", true))){
            o.writeObject(a);
            System.out.println("Saved txn: "+a.accNo);
        } catch(Exception e){}
    }
}

public class Bank {
    public static void main(String[] args) {
        TransactionSaver ts = new TransactionSaver();
        new Thread(() -> ts.saveTransaction(new Account(1,1000))).start();
        new Thread(() -> ts.saveTransaction(new Account(2,2000))).start();
    }
}
