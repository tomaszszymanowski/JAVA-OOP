package objectRepo;

public class Address {
    private String street;
    private int houseNumber;
    private int flatNumber;
    private String city;
    private String postCode;

    public Address(String street, int houseNumber, int flatNumber, String city, String postCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "\nAddress{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", flatNumber=" + flatNumber +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
