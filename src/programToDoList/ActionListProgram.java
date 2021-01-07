package programToDoList;

public class ActionListProgram {
    public static void main(String[] args) {

        Action action1 = new Action("zmywanie", "umyj podlogę w kuchni", false);
        Action action2 = new Action("czytanie", "przeczytaj \"JAVA Przewodnik dla początkujących\"", true);
        Action action3 = new Action("gotowanie", "przygotuj zdrowy posiłek na obiad", true);
        Action action4 = new Action("odpoczynek", "połóż się spać najpóźniej o 23:00", false);
        Action action5 = new Action("spotkanie", "spotkanie w sprawie pracy w wtorek o 10:00", false);

        Action[] actionsArray = new Action[5];

        actionsArray[0] = action1;
        actionsArray[1] = action2;
        actionsArray[2] = action3;
        actionsArray[3] = action4;
        actionsArray[4] = action5;

        for(Action action : actionsArray){
            System.out.println("-----Zadanie----");
            System.out.println("nazwa: "+action.title);
            System.out.println("opis: "+action.description);
            System.out.print("status: ");
            if(action.status){
                System.out.println("wkonano jak trzeba");
            }else {
                System.out.println("czynnośc w trakcie realizacji");
            }
            System.out.println("-----------------");
        }


    }
}
