class InvalidCardException extends Exception {
    public InvalidCardException(String msg) { super(msg); }
}

public class PaymentSystem {
    public static void main(String[] args) {
        String card = "12345";

        try {
            if (card.length() < 16)
                throw new InvalidCardException("Invalid card number!");
            System.out.println("Payment Success");
        } catch (InvalidCardException e) {
            System.out.println(e.getMessage());
        }
    }
}
