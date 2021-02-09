package innerClassRepo;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String owner;
        BankAccountsRepo bankAccountsRepo = new BankAccountsRepo();

        do {
            System.out.println("$$$$$$$$$$$$ banking system operation $$$$$$$$$$$$$$$$");
            System.out.println("1 - create account ");
            System.out.println("2 - display all accounts ");
            System.out.println("3 - display  accounts details ");
            System.out.println("100 - end program");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the name of the owner");
                    scanner.nextLine();
                    owner = scanner.nextLine();


                    Account account = new Account(owner);
                    bankAccountsRepo.add(account);

                    break;
                case 2:
                    bankAccountsRepo.displayAll();
                    break;
                case 3:

                    break;
            }


        } while (option != 100);
        scanner.close();
    }
}
