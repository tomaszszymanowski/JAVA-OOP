package innerClassRepo;

public class Account {
    private static int accountNumber =1000;
    private String owner;
    private double saldo =0;
    private Card card;

    public Account(String owner) {
        this.owner = owner;
        this.accountNumber++ ;
        card = new Card();
    }

    public void display() {
        System.out.println("Owner: " + owner);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Saldo: " + saldo);
        System.out.println("Card number: " + card.cardNumber);
        System.out.println("Valid to: " + card.validTo);
    }

    private static class Card{
        private static long cardNumber = 100;
        private String validTo = "12-2025";

        public Card() {
            this.cardNumber++;

        }
    }

}
