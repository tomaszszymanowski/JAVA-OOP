package abstractClass;

import java.util.Scanner;

public class SportSchoolApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SportSchool sportSchool = new SportSchool();

        int option;
        String name;
        String surname;
        int birthYear;
        String dietDescription;
        int careerStart;


        do {
            System.out.println("*** Sport School App ***");
            System.out.println("1 - add sportsman");
            System.out.println("5 - display all sportsman");
            System.out.println("100 - end program");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter the name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter the surname: ");
                    surname = scanner.nextLine();
                    System.out.print("Enter year of birth: ");
                    birthYear = scanner.nextInt();
                    System.out.print("Diet description: ");
                    scanner.nextLine();
                    dietDescription = scanner.nextLine();
                    System.out.print("Enter start career: ");
                    careerStart = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter position: ");
                    String positionOnField = scanner.nextLine();

                    Footballer footballer = new Footballer(name, surname, birthYear, dietDescription, careerStart, positionOnField);
                    sportSchool.add(footballer);
                    break;
                case 5:
                    //sportSchool.display();

                    sportSchool.displayAll();


                    break;
            }

        } while (option != 100);

        scanner.close();
    }
}
