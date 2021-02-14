package polymorphism;

import java.util.Scanner;

public class ScannerUtils {
    Scanner scanner = new Scanner(System.in);

    public int missInt(){
        while (!scanner.hasNextInt()) {
            System.out.println("Musisz podać liczbę!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public double missDouble(){
        while (!scanner.hasNextDouble()) {
            System.out.println("Musisz podać liczbę!");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
