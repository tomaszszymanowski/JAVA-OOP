package abstractClass;

public class Swimmer extends Sportsman {
    String swimmingStyle;
    String bestTime;

    public Swimmer(String name, String surname, int birthYear, String dietDescription,
                   int careerStartAt, String swimmingStyle, String bestTime) {
        super(name, surname, birthYear, dietDescription, careerStartAt);
        this.swimmingStyle = swimmingStyle;
        this.bestTime = bestTime;
    }

    @Override
    public String toString() {
        return super.toString() + "Swimmer{" +
                "swimmingStyle='" + swimmingStyle + '\'' +
                ", bestTime='" + bestTime + '\'' +
                '}';
    }

    @Override
    public void train() {
        System.out.println("[Swimmer] Go to pool and swimm");
    }
}
