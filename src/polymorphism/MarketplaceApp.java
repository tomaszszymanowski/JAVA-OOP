package polymorphism;

import java.util.Scanner;

public class MarketplaceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerUtils sc = new ScannerUtils();
        int option;
        String name;
        double price;
        int quantity;
        String expirationDate;
        String productOrigin;

        Marketplace marketplace = new Marketplace();




        do{
            System.out.println("");
            System.out.println("******* Welcome to MARKET shop *********");
            System.out.println("Select a product category :");
            System.out.println("1 - fruits");
            System.out.println("2 - books");
            System.out.println("3 - shoes");
            System.out.println("4 - milk");
            System.out.println("5 - display all");
            System.out.println("19 - end program");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Add fruit");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    scanner.nextLine();
                    System.out.print("Price: ");
                    price = sc.missDouble();

                    System.out.print("Quantity: ");
                    quantity = sc.missInt();

                    System.out.print("Expiration Date: ");
                    expirationDate = scanner.nextLine();

                    scanner.nextLine();
                    System.out.print("the origin of the product: ");
                    productOrigin = scanner.nextLine();

                    Fruit fruit = new Fruit(name,price,quantity,expirationDate,productOrigin);
                    marketplace.add(fruit);

                    break;
                case 2:
                    System.out.println("Adding a book");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = sc.missDouble();

                    System.out.print("Quantity: ");
                    quantity = sc.missInt();

                    System.out.print("Author: ");
                    scanner.nextLine();
                    String authorName = scanner.nextLine();

                    System.out.println("Author adress");
                    System.out.print("Street: ");
                    String streetName = scanner.nextLine();

                    System.out.print("Street number: ");
                    int streetNumber = sc.missInt();

                    System.out.print("Flat number: ");
                    int flatNumber = sc.missInt();

                    scanner.nextLine();
                    System.out.print("Post code: ");
                    String zipCode = scanner.nextLine();

                    System.out.print("Town: ");
                    String town = scanner.nextLine();

                    Address address = new Address(streetName,streetNumber,flatNumber,zipCode,town);
                    Author author = new Author(authorName,address);
                    PopularBook book = new PopularBook(name,price,quantity,author);

                    marketplace.add(book);


                    break;
                case 3:
                    System.out.println("Adding a shoes");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = sc.missDouble();

                    System.out.print("Quantity: ");
                    quantity = sc.missInt();

                    System.out.print("Producer: ");
                    scanner.nextLine();
                    String producer = scanner.nextLine();

                    break;
                case 4:
                    System.out.println("Adding milk");
                    System.out.print("Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = sc.missDouble();

                    System.out.print("Quantity: ");
                    quantity = sc.missInt();

                    System.out.print("Expiration Date: ");
                    scanner.nextLine();
                    expirationDate = scanner.nextLine();

                    System.out.print("Fat content: ");
                    double fatContnent = sc.missDouble();
                    break;
                case 5:
                    marketplace.displayAll();

            }

        }while (option != 19);

        scanner.close();
    }
}
