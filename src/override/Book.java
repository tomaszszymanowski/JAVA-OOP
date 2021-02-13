package override;

public class Book extends Toy{
    int pagesNumber;
    int forAge;

    public Book(String name, double price, int pagesNumber, int age) {
        super(name, price);
        this.pagesNumber = pagesNumber;
        this.forAge = age;
    }

    public void display() {
        super.display();
        System.out.println("Number of Pages: " + pagesNumber);
        System.out.println("Sugested age: " + forAge);
    }

}
