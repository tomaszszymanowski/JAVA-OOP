package finalWordRepo;

import java.util.Scanner;

public class PeselApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Podaj numer pesel");
            String pesel = scanner.nextLine();

            System.out.println("Rok urodzenia: ");
            int birthYear = scanner.nextInt();
            scanner.nextLine();


            valid = DataValidator.birth(pesel,birthYear);

        }while (!valid);



        scanner.close();
    }

}
