package method;

// zadanie - informacja o kaloryferach

public class Task1 {
    public static void main(String[] args) {

        Radiator radiator1 = new Radiator(new char[]{'r', 'e', 'd'}, 105, 1150);
        Radiator radiator2 = new Radiator(new char[]{'w', 'h', 'i', 't', 'e'}, 70, 700);
        Radiator radiator3 = new Radiator(new char[]{'g', 'r', 'e', 'e', 'n'}, 50, 450);
        Radiator radiator4 = new Radiator(new char[]{'b', 'l', 'a', 'c', 'k'}, 90, 950);

        Radiator[] radiatorsArray = new Radiator[4];
        radiatorsArray[0] = radiator1;
        radiatorsArray[1] = radiator2;
        radiatorsArray[2] = radiator3;
        radiatorsArray[3] = radiator4;

//        for(Radiator radiator: radiatorsArray){
//            radiator.display();
//        }
//        System.out.print("Radiator2 has ");
//        System.out.println("power in kWh: " + radiator2.convertToKWH());

        double powerinKWHValue = radiatorsArray[0].convertToKWH();
        if(powerinKWHValue < 1){
            System.out.println("is low-power radiator");
        }else {
            System.out.println("is High-power radiator");
        }

    }
}
