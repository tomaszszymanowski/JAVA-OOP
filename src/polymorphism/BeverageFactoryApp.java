package polymorphism;

import java.util.Scanner;

public class BeverageFactoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        String name;
        int capacity;
        String composition;
        String productType;
        double alkoholContent;

        BeverageFactory beverageFactory = new BeverageFactory();

        do{
            System.out.println("\nProgram do zarządzania fabryką napojów");
            System.out.println("1 - dodaj produkt piwo");
            System.out.println("2 - dodaj produkt wodę");
            System.out.println("3 - wyświetl wszystkie dostępne produkty");
            System.out.println("19 - zakończ program");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Nazwa produktu: ");
                    name = scanner.nextLine();
                    System.out.print("Pojemność produktu: ");
                    capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Skład produktu: ");
                    composition = scanner.nextLine();
                    System.out.print("procentowa zawartość alkoholu: ");
                    alkoholContent = scanner.nextDouble();

                    Beer beer = new Beer(name,capacity,composition,alkoholContent);
                    beverageFactory.add(beer);
                    break;
                case 2:
                    System.out.print("Nazwa produktu: ");
                    name = scanner.nextLine();
                    System.out.print("Pojemność produktu: ");
                    capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Skład produktu: ");
                    composition = scanner.nextLine();
                    System.out.print("rodzaj produktu: ");
                    productType = scanner.nextLine();

                    Water water = new Water(name,capacity,composition,productType);
                    beverageFactory.add(water);

                    break;
                case 3:
                    beverageFactory.displayAll();
                    break;

            }

        }while (option !=19);
        scanner.close();
    }
}
