package hermetization;

import java.util.Scanner;

public class CommDeptApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int choose;

        do{

            System.out.println("\n----- Communication Department - Customer Service application -----");
            System.out.println("select the operation number\n");
            System.out.println("1 - submission of the application ");
            System.out.println("2 - change submission status ");
            System.out.println("3 - checking the status of the application ");
            System.out.println("100 - end program ");


            while(!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("To nie jest poprawna opcja");
            }
            choose = scanner.nextInt();


            switch (choose){
                case 1:
                    System.out.println("*****");

                    System.out.println("Wniosek złożony");
                    break;
                case 2:
                    System.out.println("*****");
                    System.out.println("Zmienił się status wniosku");
                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("wyświetla status wniosku");
                    break;
                case 100:
                    System.out.println("Dziękujemy za korzystanie z programu");
                    break;
            }

        }while (choose != 100);
    }
}
