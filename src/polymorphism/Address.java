package polymorphism;

public class Address {
    String street;
    int streetNumber;
    int flatNumber;
    String zipCode;
    String place;

    public Address(String street, int streetNumber, int flatNumber, String zipCode, String place) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.zipCode = zipCode;
        this.place = place;
    }
}
