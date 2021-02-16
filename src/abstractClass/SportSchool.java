package abstractClass;

import java.util.Arrays;

public class SportSchool {
    private Sportsman[] sportsmens = new Sportsman[20];
    private int sportsmanIndex = 0;

    public void add(Sportsman sportsman) {
        sportsmens[sportsmanIndex++] = sportsman;
    }

    public void displayAll() {
        for (int i = 0; i < sportsmanIndex; i++) {
            System.out.println(sportsmens[i]);
        }
        System.out.println("***********");
    }


    public void train() {
        for (int i = 0; i < sportsmanIndex; i++) {
            sportsmens[i].train();
        }
    }
}
