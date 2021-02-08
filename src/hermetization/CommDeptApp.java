package hermetization;

import java.util.Scanner;

public class CommDeptApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        CommunicationDepartment commDept = new CommunicationDepartment();


        int choose;
        int applicationNumber =1;

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
                    System.out.println("Wniosek składa: ");
                    System.out.print("Imię: ");
                    String name = scanner.next();
                    System.out.print("Nazwisko: ");
                    String sureName = scanner.next();
                    System.out.println("Wniosek o wydanie tablicy: ");
                    System.out.println("A - samochodowa");
                    System.out.println("B - motocyklowa");
                    System.out.println("C - zabytkowa");
                    String typeOfLicensePlate = scanner.next();
                    String licensePlate = "";

                    switch (typeOfLicensePlate){
                        case "a":
                            licensePlate = "samochodowa";
                            break;
                        case "b":
                            licensePlate = "motocyklowa";
                            break;
                        case "c":
                            licensePlate = "zabytkowa";
                    }
                    Application application = new Application(name,sureName,licensePlate,applicationNumber);
                    commDept.addAplication(application);
                    application.displayApplicationDetails();
                    applicationNumber++;
                    break;
                case 2: // zmiana statusu
                    System.out.println("*****");
                    System.out.print("Podaj numer wniosku: ");
                    int number = scanner.nextInt();
                    commDept.findApplication(number);

                    System.out.println("Możesz zmienić status wniosku");
                    System.out.println("A - w realizacji");
                    System.out.println("B - do odbioru");
                    String chooseStatusOption;
                    chooseStatusOption = scanner.next();
                    switch (chooseStatusOption){
                        case "a":
                            commDept.changeStatus(number,"w realizacji");
                            commDept.displayApplicationStatus(number);
                            break;
                        case "b":
                            commDept.changeStatus(number,"do odbioru");
                            commDept.displayApplicationStatus(number);
                            break;
                    }

                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("wyświetla status wniosku");
                    System.out.println("*****");
                    System.out.print("Podaj numer wniosku: ");
                    number = scanner.nextInt();
                    commDept.findApplication(number);
                    commDept.displayApplicationStatus(number);
                    break;
                case 100:
                    System.out.println("Dziękujemy za korzystanie z programu");
                    break;
            }

        }while (choose != 100);
    }
}
