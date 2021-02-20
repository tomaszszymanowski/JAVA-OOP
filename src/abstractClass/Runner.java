package abstractClass;

public class Runner extends Sportsman{
    String preferedDistance;
    String lifesRecord;

    public Runner(String name, String surname, int birthYear, String dietDescription,
                  int careerStartAt, String preferedDistance, String lifesRecord) {
        super(name, surname, birthYear, dietDescription, careerStartAt);
        this.preferedDistance = preferedDistance;
        this.lifesRecord = lifesRecord;
    }

    @Override
    public String toString() {
        return super.toString() +"Runner{" +
                "preferedDistance='" + preferedDistance + '\'' +
                ", lifesRecord='" + lifesRecord + '\'' +
                '}';
    }

    @Override
    public void train() {
        System.out.println("[Runner] Run Forrest, RUN!!");
    }
}
