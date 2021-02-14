package polymorphism;

public class Address {
    String street;
    int streetNumber;
    int flatNumber;
    String zipCode;
    String town;

    public Address(String street, int streetNumber, int flatNumber, String zipCode, String town) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.zipCode = zipCode;
        this.town = town;
    }

    public void display(){
        System.out.println("Street: " + street);
        System.out.println("Street number: " + streetNumber);
        System.out.println("Flat number: " + flatNumber);
        System.out.println("Post code : " + zipCode);
        System.out.println("Town: " + town);
    }
}
