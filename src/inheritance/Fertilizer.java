package inheritance;

public class Fertilizer {
    private String name;
    private double price;
    private String purpose;

    public Fertilizer(String name, double price, String purpose) {
        this.name = name;
        this.price = price;
        this.purpose = purpose;
    }

    public void display() {
        System.out.println("Nazwa: " + name);
        System.out.println("Cena: " + price);
        System.out.println("Typ: " + purpose);
    }
}
