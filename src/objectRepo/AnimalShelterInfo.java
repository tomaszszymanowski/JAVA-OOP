package objectRepo;

public class AnimalShelterInfo {
    private Animal[] animals = new Animal[20];
    private int index = 0;

    public void add(Animal animal){
        if (index < animals.length && !exist(animal)) {
            animals[index++] = animal;

        }else{
            System.out.println("nie dodano");
        }

    }

    private boolean exist(Animal animal) {
        for (int i = 0; i < index; i++) {
            if (animals[i].equals(animal)) {
                return true;
            }
        }
        return false;
    }



    public void display(){
        for (int i = 0; i < index; i++){
            System.out.println(animals[i]);
            System.out.println("**********************");
        }

    }


}
