package inheritance;

public class Flower {
    private String name;
    private double price;
    private String type;

    public Flower(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }


    public void display() {
        System.out.println("Nazwa: " + name);
        System.out.println("Cena: " + price);
        System.out.println("Typ: " + type);
    }
}
