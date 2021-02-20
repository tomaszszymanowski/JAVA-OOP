package objectRepo;

import java.util.Scanner;

public class AniumalShelterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalShelterInfo animalShelterInfo = new AnimalShelterInfo();
        int option;
        Animal animal1 = new Animal("dog","doberman",true,1234,"Brutus",1);
        animalShelterInfo.add(animal1);

        System.out.println("****** Animal Shelter App ******");
        do{
            System.out.println("1 - add animal");
            System.out.println("2 - display dogs");
            System.out.println("3 - display cats");
            System.out.println("4 - display all");
            System.out.println("100 - end program");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Kind: ");
                    String kind = scanner.nextLine();
                    System.out.print("Race: ");
                    String race = scanner.nextLine();
                    System.out.print("Has chip?: ");
                    boolean hasChip = scanner.nextBoolean();
                    System.out.print("Chip number: ");
                    int chipNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("registraton number: ");
                    int registrationNumber = scanner.nextInt();

                    Animal animal = new Animal(kind,race,hasChip,chipNumber,name,registrationNumber);
                    animalShelterInfo.add(animal);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    animalShelterInfo.display();
                    break;
            }


        }while (option != 100);









        scanner.close();
    }
}
