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
        String streetName;
        int streetNumber;
        int flatNumber;
        String zipCode;
        String town;



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


                    System.out.print("Price: ");
                    price = sc.missDouble();

                    System.out.print("Quantity: ");
                    quantity = sc.missInt();

                    System.out.print("Expiration Date: ");
                    expirationDate = scanner.nextLine();

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
                    String authorName = scanner.nextLine();

                    System.out.println("Author adress");
                    System.out.print("Street: ");
                    streetName = scanner.nextLine();

                    System.out.print("Street number: ");
                    streetNumber = sc.missInt();

                    System.out.print("Flat number: ");
                    flatNumber = sc.missInt();

                    System.out.print("Post code: ");
                    zipCode = scanner.nextLine();

                    System.out.print("Town: ");
                    town = scanner.nextLine();

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
                    String producer = scanner.nextLine();

                    System.out.print("Producer NIP: ");
                    String NIP = scanner.nextLine();

                    System.out.println("Producer adress");
                    System.out.print("Street: ");
                    streetName = scanner.nextLine();

                    System.out.print("Street number: ");
                    streetNumber = sc.missInt();

                    System.out.print("Flat number: ");
                    flatNumber = sc.missInt();

                    System.out.print("Post code: ");
                    zipCode = scanner.nextLine();

                    System.out.print("Town: ");
                    town = scanner.nextLine();

                    Address address1 = new Address(streetName,streetNumber,flatNumber,zipCode,town);
                    Producer producer1 = new Producer(producer,NIP,address1);
                    Shoe shoe = new Shoe(name,price,quantity,producer1);
                    marketplace.add(shoe);

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
                    expirationDate = scanner.nextLine();

                    System.out.print("Fat content: ");
                    double fatContnent = sc.missDouble();

                    Milk milk = new Milk(name,price,quantity,expirationDate,fatContnent);
                    marketplace.add(milk);

                    break;
                case 5:
                    marketplace.displayAll();

            }

        }while (option != 19);

        scanner.close();
    }
}
