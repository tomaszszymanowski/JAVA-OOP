package polymorphism;

public class Milk extends Groceries{
    private double fatContent;

    public Milk(String name, double price, int quantity, String expirationDate, double fatContent) {
        super(name, price, quantity, expirationDate);
        this.fatContent = fatContent;
    }

    public void display(){
        super.display();
        System.out.println("Fat % contnetn: " + fatContent);
    }
}
