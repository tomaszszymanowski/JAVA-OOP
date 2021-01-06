package hotelRooms;

public class RoomsInformation {

    public static void main(String[] args) {

        Room[] roomsList = new Room[3];
        // pokój 1
        Room room1 = new Room();
        room1.roomNumber = 101;
        room1.floorNumber = 1;
        room1.roomStandard = "standard";
        room1.roomStatus = 'W';
        roomsList[0] = room1;

        // pokój 2
        Room room2 = new Room();
        room2.roomNumber = 203;
        room2.floorNumber = 2;
        room2.roomStandard = "apartament";
        room2.roomStatus = 'Z';
        roomsList[1] = room2;

        // pokój 3

        Room room3 = new Room();
        room3.roomNumber = 303;
        room3.floorNumber = 3;
        room3.roomStandard = "standard";
        room3.roomStatus = 'Z';
        roomsList[2] = room3;

        for( Room room : roomsList){
            if(room.roomStatus == 'W'){
                System.out.println("jest wolny pokój nr: " + room.roomNumber);
            }
            else {
                System.out.println(room.roomNumber + " jest zajęty");
            }
        }

    }
}
