package objectRepo;

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
}
