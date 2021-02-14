package polymorphism;

public class Fruit extends Groceries{
    private String productOrigin;

    public Fruit(String name, double price, int quantity, String expirationDate, String productOrigin) {
        super(name, price, quantity, expirationDate);
        this.productOrigin = productOrigin;
    }

    public void display(){
        super.display();
        System.out.println("Origin of product:" + productOrigin);
    }
}
