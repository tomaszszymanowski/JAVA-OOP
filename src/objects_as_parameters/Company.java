package objects_as_parameters;

public class Company {
    String name;
    long NIP;
    Address address;

    public Company(String name, long NIP, Address address) {
        this.name = name;
        this.NIP = NIP;
        this.address = address;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("NIP: " + NIP);
        address.displayAddress();
    }

}
