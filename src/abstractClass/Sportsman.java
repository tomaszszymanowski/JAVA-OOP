package abstractClass;

public abstract class Sportsman extends Person{
    private String dietDescription;
    private int careerStartAt;
    //private Club club

    public Sportsman(String name, String surname, int birthYear, String dietDescription, int careerStartAt) {
        super(name, surname, birthYear);
        this.dietDescription = dietDescription;
        this.careerStartAt = careerStartAt;
    }

    public void train(){

    }

    @Override
    public String toString() {
        return super.toString() +"\nSportsman{" +
                "dietDescription='" + dietDescription + '\'' +
                ", careerStartAt=" + careerStartAt +
                '}';
    }


}