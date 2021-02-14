package polymorphism;

public class Beverage {
    private String name;
    private int capacityInMilliter;
    private String composition;

    public Beverage(String name, int capacityInMilliter, String composition) {
        this.name = name;
        this.capacityInMilliter = capacityInMilliter;
        this.composition = composition;
    }

    public void display(){
        System.out.println("Nazwa: " + name);
        System.out.println("Pojemność: " + capacityInMilliter);
        System.out.println("Skład: " + composition);
    }
}
