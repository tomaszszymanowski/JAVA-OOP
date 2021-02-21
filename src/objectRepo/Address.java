package objectRepo;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber && flatNumber == address.flatNumber && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(postCode, address.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, houseNumber, flatNumber, city, postCode);
    }
}
