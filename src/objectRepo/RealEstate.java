package objectRepo;

import java.util.Objects;

public class RealEstate {
    private int number;
    private String border;
    private Address address;
    private String landRegisterNumber;
    private String description;

    public RealEstate(int number, String border, Address address, String landRegisterNumber, String description) {
        this.number = number;
        this.border = border;
        this.address = address;
        this.landRegisterNumber = landRegisterNumber;
        this.description = description;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "number=" + number +
                ", border='" + border + '\'' +
                ", address=" + address +
                ", \nlandRegisterNumber='" + landRegisterNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealEstate that = (RealEstate) o;
        return number == that.number && Objects.equals(border, that.border) && Objects.equals(address, that.address) && Objects.equals(landRegisterNumber, that.landRegisterNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, border, address, landRegisterNumber);
    }
}
