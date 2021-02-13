package polymorphism;

public class ToyShop {

    private Toy[] toys = new Toy[20];
    private int toyIndex = 0;

    public void add(Toy toy) {
        if(toyIndex < toys.length){
            toys[toyIndex++] = toy;
        }
    }

    public void displayAll() {
        for (int i = 0; i < toyIndex; i++) {
            toys[i].display();
        }
    }


}
