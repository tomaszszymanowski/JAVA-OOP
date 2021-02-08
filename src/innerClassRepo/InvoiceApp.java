package innerClassRepo;

import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        InvoiceRepo invoiceRepo = new InvoiceRepo();

        do{
            System.out.println("----- Invoice App -----");
            System.out.println("1 - add invoice");
            System.out.println("2 - display invvoices ");
            System.out.println("3 - stop");
            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.print("Number: ");
                    int number = scanner.nextInt();

                    System.out.print("Ordinal number: ");
                    int ordinalNumber = scanner.nextInt();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    Invoice invoice = new Invoice(number,ordinalNumber,price);
                    invoiceRepo.add(invoice);

                    break;
                case 2:
                    invoiceRepo.displayAll();

                    break;
            }

        }while (option!=3);
        scanner.close();
    }
}
