package abstractClass;

import java.util.Arrays;

public class SportSchool {
    private Person[] persons = new Person[20];
    private int personIndex = 0;

    public void add(Person person) {
        persons[personIndex++] = person;
    }

    public void displayAll() {
        for (int i = 0; i < personIndex; i++) {
            System.out.println(persons[i]);
        }
    }


}
