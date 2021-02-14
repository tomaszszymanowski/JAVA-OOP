package polymorphism;

public class Producer {
    String name;
    String NIP;
    Address address;

    public Producer(String name, String NIP, Address address) {
        name = name;
        this.NIP = NIP;
        this.address = address;
    }

    public void display(){
        System.out.println("Company name: " + name);
        System.out.println("Company NIP: " + NIP);
        address.display();
    }
}
