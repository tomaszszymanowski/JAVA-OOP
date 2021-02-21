package pl.packageRepo;

import pl.packageRepo.notesRepo.NotesRepo;

import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotesRepo notesRepo = new NotesRepo();
        int option;



        do{
            System.out.println("------------- Notes App --------------");
            System.out.println("1 - add note");
            System.out.println("2 - display all");
            System.out.println("100 - end program");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("DateTime: ");
                    String dateTime = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    Note note = new Note(phone,dateTime,description);
                    notesRepo.add(note);

                    break;
                case 2:
                    System.out.println(notesRepo);
                    break;
            }



        }while (option !=100);

        scanner.close();
    }
}
