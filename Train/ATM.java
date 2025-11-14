class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}

public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 8000;

        try {
            if (withdraw > balance)
                throw new InsufficientFundsException("Not enough balance!");
            System.out.println("Withdraw Successful");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
