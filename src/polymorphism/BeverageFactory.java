package polymorphism;

public class BeverageFactory {
    private Beverage[] beverages = new Beverage[20];
    private int beverageIndex = 0;

    public void add(Beverage beverage) {
        if(beverageIndex < beverages.length){
            beverages[beverageIndex++] = beverage;
        }
    }

    public void displayAll() {
        for (int i = 0; i < beverageIndex; i++) {
            System.out.println("********");
            beverages[i].display();
        }
    }
}
