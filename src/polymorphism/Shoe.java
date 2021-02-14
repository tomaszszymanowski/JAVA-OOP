package polymorphism;

public class Shoe extends Product{
    Producer producer;

    public Shoe(String name, double price, int quantity, Producer producer) {
        super(name, price, quantity);
        this.producer = producer;
    }

    public void display(){
        super.display();
        producer.display();
    }
}
