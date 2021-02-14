package polymorphism;

public class PopularBook extends Product{
    Author authorName;

    public PopularBook(String name, double price, int quantity, Author authorName) {
        super(name, price, quantity);
        this.authorName = authorName;
    }
}
