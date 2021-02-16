package abstractClass;

public class SportClub {
    private String name;
    private String fundation;

    public SportClub(String name, String fundation) {
        this.name = name;
        this.fundation = fundation;
    }

    @Override
    public String toString() {
        return "SportClub{" +
                "name='" + name + '\'' +
                ", fundation='" + fundation + '\'' +
                '}';
    }
}
