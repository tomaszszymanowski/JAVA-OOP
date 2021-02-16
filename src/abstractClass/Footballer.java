package abstractClass;

public class Footballer extends Sportsman {
    private String positionOnfield;

    public Footballer(String name, String surname, int birthYear, String dietDescription,
                      int careerStartAt, String positionOnfield) {
        super(name, surname, birthYear, dietDescription, careerStartAt);
        this.positionOnfield = positionOnfield;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFootballer{" +
                "positionOnfield='" + positionOnfield + '\'' +
                '}';
    }


}
