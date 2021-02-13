package polymorphism;

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
            System.out.println("3 - add puzzle");
            System.out.println("4 - add book");
            System.out.println("5 - display all");
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
                    toyShop.add(bear);
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
                    toyShop.add(car);

                    break;
                case 3:
                    //add puzzle
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Elements: ");
                    int elements  = scanner.nextInt();

                    Puzzle puzzle = new Puzzle(name,price,elements);
                    toyShop.add(puzzle);
                    break;
                case 4:
                    //add book
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Numbers of pages: ");
                    int pagesNumer  = scanner.nextInt();

                    System.out.print("Sugested Age: ");
                    int forAge  = scanner.nextInt();

                    Book book = new Book(name, price, pagesNumer, forAge);
                    toyShop.add(book);

                case 5:
                    toyShop.displayAll();
                    break;
            }

        }while (option != 100);

        scanner.close();
    }
}
