package abstractClass;

public class Footballer extends Sportsman {
    private String positionOnfield;
    private SportClub sportClub;

    public Footballer(String name, String surname, int birthYear, String dietDescription, int careerStartAt, String positionOnfield, SportClub sportClub) {
        super(name, surname, birthYear, dietDescription, careerStartAt);
        this.positionOnfield = positionOnfield;
        this.sportClub = sportClub;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "positionOnfield='" + positionOnfield + '\'' +
                ", sportClub=" + sportClub +
                '}';
    }

    public void train(){
        System.out.println("Footbalers - kick that ball, goddamn it");
    }
}
