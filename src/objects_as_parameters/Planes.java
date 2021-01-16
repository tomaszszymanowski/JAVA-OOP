package objects_as_parameters;

public class Planes {
    String planeID;

    public Planes(String planeID) {
        this.planeID = planeID;
    }
    void displayPlaneInfo(){
        System.out.println(planeID);
    }
}
