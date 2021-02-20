package objectRepo;

import java.util.Scanner;

public class AniumalShelterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("****** Animal Shelter App ******");
        do{
            System.out.println("1 - add animal");
            System.out.println("2 - display dogs");
            System.out.println("3 - display cats");
            System.out.println("4 - display all");
            System.out.println("100 - end program");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
            }


        }while (option != 100);









        scanner.close();
    }
}
