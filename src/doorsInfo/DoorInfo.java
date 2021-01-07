package doorsInfo;

public class DoorInfo {
    public static void main(String[] args) {
        Door door1 = new Door(2.0, 9, "white");
        Door door2 = new Door(2.1, 0.9, "brown");
        Door door3 = new Door(2.2, 1.0, "light-brown");
        Door door4 = new Door(2.5, 1.1, "dark-brown");
        Door door5 = new Door(2.3, 1.5, "steel");

        Door[] doorsArray = new Door[5];

        doorsArray[0] = door1;
        doorsArray[1] = door2;
        doorsArray[2] = door3;
        doorsArray[3] = door4;
        doorsArray[4] = door5;

        for (Door door : doorsArray) {
            System.out.println("-----info about door-----");
            System.out.println("wyskość: " + door.doorHeight);
            System.out.println("szerokość: "+ door.doorWidth);
            System.out.println("kolor producenta: " + door.color);
            System.out.println("--------------------------");
        }


    }
}
