package polymorphism;

public class Author {
    private String name;
    Address address;

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println("Name: " + name);
        address.display();

    }
}
