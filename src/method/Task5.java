package method;
// zadanie o bursztynach

public class Task5 {
    public static void main(String[] args) {
        Amber amber1 = new Amber("gold", 3.5,0.98,130);
        Amber amber2 = new Amber("light-gold", 3.1,0.96,110);
        Amber amber3 = new Amber("light-orange", 3.8,0.99,140);
        Amber amber4 = new Amber("dark-orange", 4.5,1.3,150);

        Amber[] ambersArray = new Amber[4];
        ambersArray[0] = amber1;
        ambersArray[1] = amber2;
        ambersArray[2] = amber3;
        ambersArray[3] = amber4;


        System.out.println("melting at " + ambersArray[2].displayMeltingTempInFahrenheit()+ " Fah");
        ambersArray[3].displayInfoAboutAmber();
        System.out.println("---");
        System.out.println("density increased to " +ambersArray[3].increasinDensity(0.7));
        System.out.println("---");
        ambersArray[3].displayInfoAboutAmber();



    }
}
