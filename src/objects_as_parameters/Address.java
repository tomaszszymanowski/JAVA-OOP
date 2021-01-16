package objects_as_parameters;

public class Address {
    String street;
    int houseNumber;
    int flatNumber;

    public Address(String street, int houseNumber, int flatNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    void displayAddress(){
        System.out.println("street: " + street);
        System.out.println("house number: " + houseNumber);
        System.out.println("flat number: " + flatNumber);

    }
}
