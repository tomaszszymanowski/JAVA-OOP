package polymorphism;

public class Water extends Beverage {
    private String productType;

    public Water(String name, int capacityInMilliter, String composition, String productType) {
        super(name, capacityInMilliter, composition);
        this.productType = productType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Rodzaj produktu: " + productType);
    }
}
