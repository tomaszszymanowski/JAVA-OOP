package objectRepo;

import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int option;


        do{
            System.out.println("----------- RealEstate App -------------");
            System.out.println("1 -  add real estate");
            System.out.println("2 - display real estate");
            System.out.println("100 - end program");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Border: ");
                    String border = scanner.nextLine();
                    System.out.print("Street: ");
                    String street = scanner.nextLine();
                    System.out.print("House number: ");
                    int houseNumber = scanner.nextInt();
                    System.out.print("Flat number: ");
                    int flatNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Post Code: ");
                    String postCode = scanner.nextLine();
                    System.out.print("land Register Number: ");
                    String landRegisterNumber = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    Address address = new Address(street, houseNumber,flatNumber,city,postCode);
                    RealEstate realEstate = new RealEstate(number,border,address,landRegisterNumber,description);





                    break;
                case 2:

                    break;

            }



        }while (option != 100);





        scanner.close();
    }
}
