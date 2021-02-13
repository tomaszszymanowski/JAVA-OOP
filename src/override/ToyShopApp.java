package override;

import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

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
