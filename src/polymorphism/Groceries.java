package polymorphism;

public class Groceries extends Product {
    private String expirationDate;

    public Groceries(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public void display(){
        super.display();
        System.out.println("Expiration date: " + expirationDate);
    }
}
