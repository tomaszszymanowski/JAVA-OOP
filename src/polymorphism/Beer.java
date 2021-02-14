package polymorphism;

public class Beer extends Beverage {
    private double alkoholContent;


    public Beer(String name, int capacityInMilliter, String composition, double alkoholContent) {
        super(name, capacityInMilliter, composition);
        this.alkoholContent = alkoholContent;
    }

    public void display(){
        super.display();
        System.out.println("Zawartość alkoholu: " + alkoholContent);
    }
}
