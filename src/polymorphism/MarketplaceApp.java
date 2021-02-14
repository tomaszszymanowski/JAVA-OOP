package polymorphism;

import java.util.Scanner;

public class MarketplaceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String name;
        double price;
        int quantity;
        String expirationDate;
        String productOrigin;





        do{
            System.out.println("");
            System.out.println("******* Welcome to MARKET shop *********");
            System.out.println("Select a product category :");
            System.out.println("1 - fruits");
            System.out.println("2 - books");
            System.out.println("3 - shoes");
            System.out.println("4 - milk");
            System.out.println("19 - end program");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Add fruit");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    quantity = scanner.nextInt();

                    System.out.print("Expiration Date: ");
                    expirationDate = scanner.nextLine();

                    scanner.nextLine();
                    System.out.print("the origin of the product: ");
                    productOrigin = scanner.nextLine();


                    break;
                case 2:
                    System.out.println("Adding a book");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    quantity = scanner.nextInt();

                    System.out.print("Author: ");
                    scanner.nextLine();
                    String authorName = scanner.nextLine();

                    Author author = new Author(authorName);


                    break;
                case 3:
                    System.out.println("Adding a shoes");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    quantity = scanner.nextInt();

                    System.out.print("Producer: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    scanner.nextLine();
                    String producer = scanner.nextLine();

                    break;
                case 4:
                    System.out.println("Adding milk");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    quantity = scanner.nextInt();

                    System.out.print("Expiration Date: ");
                    scanner.nextLine();
                    expirationDate = scanner.nextLine();

                    System.out.print("Fat content: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Musisz podać liczbę!");
                        scanner.next();
                    }
                    double fatContnent = scanner.nextDouble();

            }

        }while (option != 19);

        scanner.close();
    }
}
