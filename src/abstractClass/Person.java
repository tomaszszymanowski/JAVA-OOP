package abstractClass;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    private int age;

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = 2021 - birthYear;
    }

    public void display() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age +
                '}';
    }
}
