package objectRepo;

import java.util.Objects;

public class Animal {
    private String kindOfAnimal;
    private String race;
    private boolean hasChip;
    private int chipNumber;
    private String name;
    private int registrationNumber;

    public Animal(String kindOfAnimal, String race, boolean hasChip,
                  int chipNumber, String name, int registrationNumber) {
        this.kindOfAnimal = kindOfAnimal;
        this.race = race;
        this.hasChip = hasChip;
        this.chipNumber = chipNumber;
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kindOfAnimal='" + kindOfAnimal + '\'' +
                ", race='" + race + '\'' +
                ", hasChip=" + hasChip +
                ", chipNumber=" + chipNumber +
                ", \nname='" + name + '\'' +
                ", registrationNumber=" + registrationNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return chipNumber == animal.chipNumber || registrationNumber == animal.registrationNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chipNumber, registrationNumber);
    }
}
