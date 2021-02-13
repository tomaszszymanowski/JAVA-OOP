package override;

public class Car extends Toy {
    String type;

    public Car(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }
}
