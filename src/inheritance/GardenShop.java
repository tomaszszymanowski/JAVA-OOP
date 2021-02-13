package inheritance;

import java.util.Scanner;

public class GardenShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String name;
        double price;

        GardenShopStorage gardenShopStorage = new GardenShopStorage();

        do {
            System.out.println("\n------- Garden Shop --------");
            System.out.println("1 - add flower");
            System.out.println("2 - add fertilizer");
            System.out.println("3 - display all");
            System.out.println("100 - end program");
            option = scanner.nextInt();


            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Nazwa: ");
                    name = scanner.nextLine();

                    System.out.print("Cena: ");
                    price = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.print("Rodzaj: ");
                    String type = scanner.nextLine();

                    Flower flower = new Flower(name,price,type);

                    gardenShopStorage.addFlower(flower);
                    break;
                case 2:
                    System.out.print("Nazwa: ");
                    name = scanner.nextLine();

                    System.out.print("Cena: ");
                    price = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.print("Przeznaczenie: ");
                    String purpose = scanner.nextLine();

                    Fertilizer fertilizer = new Fertilizer(name,price,purpose);
                    gardenShopStorage.addFertilizer(fertilizer);

                    //System.out.println("dodany nawóz");
                    break;
                case 3:
                    gardenShopStorage.displayAll();



                    break;
            }


        }while (option != 100);










        scanner.close();
    }
}
