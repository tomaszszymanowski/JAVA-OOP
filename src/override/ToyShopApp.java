package override;

import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToyShop toyShop = new ToyShop();
        int option;
        String name;
        double price;
        String maerial;
        String type;

        do {
            System.out.println("---------- Toy Shop ----------");
            System.out.println("1 - add bear");
            System.out.println("2 - add car");
            System.out.println("3 - display all");
            System.out.println("100  - stop program\n");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Material: ");
                    maerial = scanner.nextLine();

                    Bear bear = new Bear(name,price, maerial);
                    toyShop.addBear(bear);
                    break;
                case 2:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Type: ");
                    type = scanner.nextLine();

                    Car car = new Car(name,price,type);
                    toyShop.addCar(car);

                    break;
                case 3:
                    toyShop.displayAll();
                    break;
            }

        }while (option != 100);

        scanner.close();
    }
}
