package method;

public class Radiator {
    char[] color;
    int weight;
    int power;

    public Radiator(char[] color, int weight, int power) {
        this.color = color;
        this.weight = weight;
        this.power = power;
    }

    void display() {
        System.out.print("color: ");
        for (char c : color) {
            System.out.print(c);
        }

        System.out.println("\nweight: " + weight+" kg");
        System.out.println("power: " + power + " Watt");
        System.out.println("-----");
    }

    double convertToKWH(){
        return (double) power/1000;
    }



}
