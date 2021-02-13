package polymorphism;

public class Car extends Toy {
    String type;

    public Car(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public void display(){
        super.display();
        System.out.println("Type: " + type);
    }
}
